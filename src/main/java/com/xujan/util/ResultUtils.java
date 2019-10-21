package com.xujan.util;

public class ResultUtils {

    public static String result() {
        int i = (int) (Math.random() * 2);
        String result;
        if (i == 0) {
            result = "拒绝";
        } else {
            result = "同意";
        }
        return result;
    }

}
