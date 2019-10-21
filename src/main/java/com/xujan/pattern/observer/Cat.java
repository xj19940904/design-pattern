package com.xujan.pattern.observer;

import java.util.Observable;

public class Cat extends Observable {

    public void catCry() {
        super.setChanged();
        super.notifyObservers("猫叫了");
    }

}
