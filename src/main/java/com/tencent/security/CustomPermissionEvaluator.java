package com.tencent.security;

import com.tencent.pojo.TsmcpPermit;
import com.tencent.service.impl.ITsmcpPermitServiceImpl;
import com.tencent.service.impl.ITsmcpUserRoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Component
public class CustomPermissionEvaluator implements PermissionEvaluator {

    @Autowired
    private ITsmcpPermitServiceImpl iTsmcpPermitService;

    @Autowired
    private ITsmcpUserRoleServiceImpl tsmcpUserRoleService;

    /**
     *
     * 在 hasPermission() 方法中，参数 1 代表用户的权限身份，参数 2 参数 3 分别和
     * 在控制器中@PreAuthorize("hasPermission('/admin','r')") 中的参数对应，即访问 url 和权限。
     * anthor:shn
     * time:2019:11:06
     */
    @Override
    public boolean hasPermission(Authentication authentication, Object targetUrl, Object targetPermission) {
        // 获得loadUserByUsername()方法的结果
        User user = (User)authentication.getPrincipal();
        // 获得loadUserByUsername()中注入的角色
        Collection<GrantedAuthority> authorities = user.getAuthorities();

        // 遍历用户所有角色
        for(GrantedAuthority authority : authorities){
            String roleName = authority.getAuthority();
            Integer roleId = tsmcpUserRoleService.selectByName(roleName).getId();
            System.out.println(roleId);
            // 得到角色所有的权限
            List<TsmcpPermit> permissionList = iTsmcpPermitService.listByRoleId(roleId);
            // 遍历permissionList
            for(TsmcpPermit sysPermission : permissionList) {
                // 获取权限集
                List permissions = sysPermission.getPermitPaths();
                // 如果访问的Url和权限用户符合的话，返回true
                if(targetUrl.equals(sysPermission.getPermitName())
                        && permissions.contains(targetPermission)) {
                    return true;
                }
            }

        }

        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable serializable, String s, Object o) {
        return false;
    }


}
