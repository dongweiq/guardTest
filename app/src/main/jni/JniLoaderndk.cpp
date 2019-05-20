#include <string.h>
#include <jni.h>
#include <stdio.h>

//#include "yue_excample_hello_JniLoader.h"
//按照C语言规则编译。jni依照C的规则查找函数，而不是C++，没有这一句运行时会崩溃报错：
// java.lang.UnsatisfiedLinkError: Native method not found:
extern "C"{

JNIEXPORT jstring JNICALL Java_com_honghe_guardtest_JniLoader_getHelloString
(JNIEnv *env, jobject _this)
{
int m=30;
int n=0;
int j=m/n;
printf("hello %d",j);
Java_com_honghe_guardtest_JniLoader_getHelloString(env,_this);
//return (*env)->NewStringUTF(env, "Hello world from jni)");//C语言格式，文件名应为xxx.c
return env->NewStringUTF((char *)("hello whh"));//C++格式，文件名应为xxx.cpp
}


}
