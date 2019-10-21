package com.xujan.pattern.single;

/**
 * 饿汉单例
 */
public class HungrySingle {

    private static HungrySingle hungrySingle = new HungrySingle();

    private HungrySingle() {
    }

    public static HungrySingle getInstance() {
        return hungrySingle;
    }
}
