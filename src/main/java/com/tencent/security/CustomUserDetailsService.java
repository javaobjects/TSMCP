package com.tencent.security;

import com.tencent.pojo.TsmcpRolePermit;
import com.tencent.pojo.TsmcpUser;
import com.tencent.pojo.TsmcpUserRole;
import com.tencent.service.impl.ITsmcpRolePermitServiceImpl;
import com.tencent.service.impl.ITsmcpUserRoleServiceImpl;
import com.tencent.service.impl.ITsmcpUserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("userDetailsService")
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private ITsmcpUserServiceImpl userService;

    @Autowired
    private ITsmcpUserRoleServiceImpl roleService;

    @Autowired
    private ITsmcpRolePermitServiceImpl userRoleService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        TsmcpUser user = userService.selectByName(username);

        // 判断用户是否存在
        if(user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 添加权限
        List<TsmcpRolePermit> userRoles = userRoleService.listByUserId(user.getId());
        for (TsmcpRolePermit userRole : userRoles) {
            TsmcpUserRole role = roleService.selectById(userRole.getRoleId());
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        }

        // 返回UserDetails实现类
        return new User(user.getUserName(), user.getUserPasswd(), authorities);
    }

}
