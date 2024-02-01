package com.frt.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;


/**
 * @author fengrt
 * @version V1.0
 * @create 2023-03-21 18:44
 */
@RestController
public class TestControler {
    @RequestMapping("/printParam")
    @ResponseBody
    public  String printParam(@RequestParam("name") String name,@RequestParam("age") String age) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name",name);
        jsonObject.put("age",age);
        jsonObject.put("requestId",System.currentTimeMillis()+ System.nanoTime());
        return jsonObject.toJSONString();
    }
    @GetMapping("/printP")
    public  String printParam1() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name","docker");
        jsonObject.put("requestId",System.currentTimeMillis()+ System.nanoTime());
        System.out.println(jsonObject.toJSONString());
        return jsonObject.toJSONString();
    }
}
