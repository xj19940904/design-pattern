package com.xujan.pattern.single;

/**
 * 懒汉单例
 */
public class LazySingle {

    private LazySingle lazySingle;

    private LazySingle() {
    }

    public LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }


}
