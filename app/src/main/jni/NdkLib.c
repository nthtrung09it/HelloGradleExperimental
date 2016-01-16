#include <jni.h>

JNIEXPORT jstring JNICALL
Java_nthtrung09it_android_hello_experimental_NdkManager_getMsgFromJni(JNIEnv *env,
                                                                      jobject instance) {

    // TODO


    return (*env)->NewStringUTF(env, "Msg from jni.");
}