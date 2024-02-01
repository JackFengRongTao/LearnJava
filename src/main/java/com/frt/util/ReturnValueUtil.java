package com.frt.util;

import com.dwzq.common.enums.ReturnValueEnum;
import com.google.gson.JsonObject;

/**
 * 返回值工具
 * @author fengrt
 * @version V1.0
 * @create 2024-01-22 15:11
 */
public class ReturnValueUtil {

    /**
     * 返回Gson类型的返回值
     * @param code  返回码
     * @param note  返回码说明
     * @return      Gson类型的返回值
     */
    public static JsonObject  getGsonReturnValue(int code,String note) {
        JsonObject result = new JsonObject() ;
        result.addProperty("code", code);
        result.addProperty("note", note);
        return result;
    }

    /**
     * 输入输出，返回Gson类型的返回值
     * @param result    返回值
     * @param code      返回码
     * @param note      返回码说明
     */
    public static void  getGsonReturnValue(JsonObject result,int code,String note) {
        result.addProperty("code", code);
        result.addProperty("note", note);
    }

    public static void main(String[] args) {
        System.out.println(ReturnValueEnum.SUCCESS.getCode()+":"+ReturnValueEnum.SUCCESS.getNote());
    }
}
