package com.tencent.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tencent.pojo.TsmcpProduct;
import com.tencent.service.ITsmcpProductService;
import com.tencent.utill.RcDetailRequest;
import com.tencent.utill.RcDetailResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
@Controller
public class TsmcpProductControl {

    @Autowired
    private ITsmcpProductService iTsmcpProductService;

    //pagehelper+datatable前后端Ajax分页
    //参考
    //https://blog.csdn.net/qq_39455116/article/details/84329071
    //https://blog.csdn.net/evane1890/article/details/63262610


    @RequestMapping(value = "/selectAllPro", method = RequestMethod.POST)
    @ResponseBody
    public RcDetailResponse queryRcDetail(@RequestBody RcDetailRequest req) {
        //根据当前的数量，算出来要查询的页码，第一页开始从0，第二页是10，每页数量10，所以页码要+1
        PageHelper.startPage(req.getStart() / 10 + 1, 10);
        List<TsmcpProduct> list = iTsmcpProductService.selectAll();
        PageInfo<TsmcpProduct> pageInfo = new PageInfo<TsmcpProduct>(list);
        HashMap<String, Object> map = new HashMap<>();
        map.put("list", list);
        RcDetailResponse res = new RcDetailResponse();
        //前端传过来的draw是多少，就返回多少
        res.setDraw(req.getDraw());
        //过滤后的数量
        res.setRecordsFiltered(300);
        //总共的数量
        res.setRecordsTotal(300);
        res.setDataMap(map);
        return res;
    }

    @RequestMapping("/selectAllProduct")
    @ResponseBody
    public Map<String ,Object> selectAllProduct(){
        Map<String ,Object>  map = iTsmcpProductService.selectAll2();
      return map;
    }

    /**
     *
     * @param tsmcpProduct
     * @return
     * @author xianxian
     * @create:2019-11-08
     * @Description
     */
    @RequestMapping("/addProduct")
    @ResponseBody
    public Boolean addProduct(TsmcpProduct tsmcpProduct){
        Boolean result = iTsmcpProductService.addProduct(tsmcpProduct);
        return result;
    }

    /**
     * @param productId
     * @return
     * @author xianxian
     * @create:2019-11-11
     * @Description
     * 根据产品id删除产品
     */
    @RequestMapping("/deleteProductByProductId")
    @ResponseBody
    public Boolean deleteProductByProductId(Integer productId){
        Boolean result = iTsmcpProductService.deleteProductByProductId(productId);
        return result;
    }

    /**
     *
     * @param tsmcpProduct
     * @return
     * @author xianxian
     * @create:2019-11-11
     * @Description
     * 更新产品
     */
    @RequestMapping("/updateProduct")
    @ResponseBody
    public Boolean updateProduct(TsmcpProduct tsmcpProduct){
        Boolean result = iTsmcpProductService.updateProduct(tsmcpProduct);
        return  result;
    }
}
