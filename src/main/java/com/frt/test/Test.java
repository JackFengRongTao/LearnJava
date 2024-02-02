package com.frt.test;

import lombok.extern.slf4j.Slf4j;

/**
 * @author fengrt
 * @version V1.0
 * @create 2023-12-06 09:16
 */
@Slf4j
public class Test {

    public static String test(String name,int age) {
        log.info("test(String name,String age):{},{}",name,age);

        String rs = name +":"+ age;

        log.info("test(String name,String age)返回值:{}",rs);
        return rs;
    }
    public static void main(String[] args) {
        System.out.println("123232"+555);
        test("feng",30);
    }
}
