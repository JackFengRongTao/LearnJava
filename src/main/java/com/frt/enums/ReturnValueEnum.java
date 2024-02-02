package com.frt.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 返回值定义
 * @author fengrt
 * @version V1.0
 * @create 2024-01-23 16:17
 */
@Getter
@AllArgsConstructor
public enum ReturnValueEnum {
    SUCCESS(100001,"成功"),
    ADD_VOTE_TOPIC_ERROR(-100001,"新增投票议题失败"),
    ADD_VOTE_RESULT_ERROR(-100002,"新增投票结果失败"),
    RECOVER_VOTE_OA_ERROR(-100003,"回收投票失败"),
    DIVIDED_BY_ZERO(-100011,"被除数为零");

    private int code;
    private String note;
}
