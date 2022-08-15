package org.chiangkai.year2022.aug;

import lombok.Data;
import lombok.SneakyThrows;

import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;

/**
 * @author ChiangKai
 * @date 2022/8/15 22:34
 */
public class Day15 {
    public static void main(String[] args) {
        System.out.println(getFiledName(Student::getName));
    }

    @SneakyThrows
    public static <T> String getFiledName(SFunction<T, ?> function) {
        String result = null;
        Method method = function.getClass().getDeclaredMethod("writeReplace");
        method.setAccessible(true);
        SerializedLambda invoke = (SerializedLambda) method.invoke(function);
        String implMethodName = invoke.getImplMethodName();
        result = implMethodName;
        if (result != null) {
            if (result.startsWith("get")) {
                return toLowerCaseFirstOne(result.substring(3));
            }
            if (result.startsWith("is")) {
                return toLowerCaseFirstOne(result.substring(2));
            }
        }
        return result;
    }

    /**
     * 首字母转小写
     *
     * @param s
     * @return
     */
    public static String toLowerCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return (new StringBuilder()).append(Character.toLowerCase(s.charAt(0))).append(s.substring(1)).toString();
        }
    }

    @Data
    class Student {
        private String name;
    }
}
