package nthtrung09it.android.hello.experimental;

/**
 * @author nthtrung09it@gmail.com
 * @version 1.0
 * @since 16/01/2016
 */
public class NdkManager {

    static {
        System.loadLibrary("NdkLib");
    }


    public native String getMsgFromJni();

    public String helloFromNdkManager() {
        return getMsgFromJni();
    }
}
