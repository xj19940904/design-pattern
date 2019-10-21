package com.xujan.pattern.observer;

import java.util.Observable;
import java.util.Observer;

public class Mouse implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.printf("Mouse：收到%s的消息，消息内容是%s，赶紧跑……", o.getClass().getSimpleName(), arg);
        System.out.println();

    }
}
