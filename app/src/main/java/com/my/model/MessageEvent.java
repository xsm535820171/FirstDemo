package com.my.model;

/**
 * Created by AOW on 2018/3/6.
 * 定义消息事件类
 * Alt+Insert 快速生成get set方法
 */

public class MessageEvent {
    String message;
    @Override
    public String toString() {
        return "MessageEvent{" +
                "message='" + message + '\'' +
                '}';
    }

    public MessageEvent(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
