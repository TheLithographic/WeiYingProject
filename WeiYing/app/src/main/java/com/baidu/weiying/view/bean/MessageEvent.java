package com.baidu.weiying.view.bean;

/**
 * Created by Administrator on 2018/5/22.
 */

public class MessageEvent {
    private String message;

    public MessageEvent() {
    }

    public  MessageEvent(String message){
        this.message=message;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
