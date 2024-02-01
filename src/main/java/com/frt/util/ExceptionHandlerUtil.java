package com.frt.util;

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
     * @return  json返回值
     */
    public static String  exceptionHandler(Exception e) {
        JsonObject result = new JsonObject();
        result.addProperty("code", Integer.parseInt(e.getMessage().split(":")[0]));
        result.addProperty("note", e.getMessage().split(":")[1]);
        log.error(e.getMessage());
        return result.toString();
    }
}
