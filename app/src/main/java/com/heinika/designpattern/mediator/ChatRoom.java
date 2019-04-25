package com.heinika.designpattern.mediator;

import java.util.Date;

import static java.lang.System.out;

public class ChatRoom {
    public static void showMessage(User user,String message){
        out.println(new Date().toString() + " [" + user.getName()+"] : " + message);
    }
}
