package com.honghe.guardtest;

public class JniLoader {
    static {
        System.loadLibrary("firstndk");
    }

    public native String getHelloString();
}
