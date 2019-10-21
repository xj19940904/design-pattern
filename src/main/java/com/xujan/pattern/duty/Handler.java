package com.xujan.pattern.duty;

public abstract class Handler {

    private Handler nextHandler;

    public abstract String processHandler(String userName, Integer outlay);

    public Handler getNextHandler() {
        return nextHandler;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
