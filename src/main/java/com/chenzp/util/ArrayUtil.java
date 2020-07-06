package com.chenzp.util;


public class ArrayUtil {

    /**
     * 指定类是否为Enum类
     *
     * @param clazz 类
     * @return 是否为Enum类
     */
    public static boolean isEnum(Class<?> clazz) {
        return clazz.isEnum();
    }
}
