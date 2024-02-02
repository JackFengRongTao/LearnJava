package com.frt.util;

import com.frt.enums.ReturnValueEnum;
import com.google.gson.JsonObject;
import lombok.extern.slf4j.Slf4j;

/**
 * 异常处理工具
 * @author fengrt
 * @version V1.0
 * @create 2024-01-23 11:17
 */
@Slf4j
public class ExceptionHandlerUtil {

    /**
     *自定义异常处理器
     * @param e 异常
     * @return  字符串类型json返回值
     */
    public static String  exceptionHandler(Exception e) {
        JsonObject result = new JsonObject();
        result.addProperty("code", Integer.parseInt(e.getMessage().split(":")[0]));
        result.addProperty("note", e.getMessage().split(":")[1]);
        log.error(e.getMessage());
        return result.toString();
    }

    /**
     * 测试样例
     */
    public static void main(String[] args) {
        try {
            try {
                int num = 1/0;
            } catch (Exception e) {
                e.printStackTrace();
                //异常转译
                throw new Exception(ReturnValueEnum.DIVIDED_BY_ZERO.getCode()+":"+ReturnValueEnum.DIVIDED_BY_ZERO.getNote());
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(exceptionHandler(e));
        }
    }
}
