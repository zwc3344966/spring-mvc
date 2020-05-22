package com.zwc.common;

/**
 * @author: zhangwch
 * @create: 2020-05-22 15:29
 **/
public enum  CodeMsg {
    SUCCESS("000000", "处理成功!"),
    FAIL("-999999", "处理失败!"),
    IS_EXIST("-999998", "数据已存在!"),
    NOT_EXIST("-999997", "查询结果不存在!");

    private final String value;
    private final String label;

    private CodeMsg(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 获取键
     * @return
     */
    public String getValue() {
        return value;
    }

    /**
     * 获取值
     * @return
     */
    public String getLabel() {
        return label;
    }

    /**
     * 根据键取这个枚举
     * @param value
     * @return
     */
    public static CodeMsg find(String value) {
        if (null == value) {
            return null;
        }
        for (CodeMsg s: values()) {
            if (s.value.equals(value)) {
                return s;
            }
        }
        return null;
    }

    /**
     * 根据键取值
     * @param value
     * @return
     */
    public static String findValue(String value) {
        if (null == value) {
            return null;
        }
        for (CodeMsg s: values()) {
            if (s.value.equals(value)) {
                return s.label;
            }
        }
        return null;
    }
}
