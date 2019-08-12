package com.example.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    // RestTemplate 是由SpringBoot Web组件提供 默认整合ribbon负载均衡器
    // rest方式底层采用httpclient技术
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 在SpringCloud中有俩种方式调用rest、fegin（SpringCloud）
     *
     * @return
     */
    //订单服务调用会员服务
    @RequestMapping("/getOrder")
    public String getOrder() {
        String url = "http://member/getMember";
        // 有俩种方式，一种是采用服务别名方式调用，另一种是直接调用
        String result = restTemplate.getForObject(url, String.class);
        System.out.println("订单服务调用会员服务结果：" + result);
        return result;
    }


}
