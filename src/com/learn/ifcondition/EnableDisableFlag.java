package com.learn.ifcondition;

import com.learn.util.CommonConstant;

public class EnableDisableFlag {
    public static void main(String[] args) {
    if((CommonConstant.PUSH_NOTIFICATION_FLAG.startsWith("enable")) &&
            (CommonConstant.PUSH_NOTIFICATION.startsWith("+"))){
        System.out.println("condition true");
    }
    }
}
