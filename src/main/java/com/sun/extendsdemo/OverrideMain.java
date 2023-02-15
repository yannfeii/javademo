package com.sun.extendsdemo;

public class OverrideMain {

    public static void main(String[] args) {
        OverrideSub overrideSub = new OverrideSub();
        overrideSub.showName();
        overrideSub.doSupper();
        overrideSub.doThis();
        overrideSub.getParentName();
    }
}
