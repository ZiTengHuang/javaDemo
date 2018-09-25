package 接口回调;

public class Client {
    public static ICallBack mCallBack;
    public Client() {

    }
    public static void setiCallBack(ICallBack iCallBack) {
        mCallBack = iCallBack;
    }

    public static void doCallBackMethod() {
        mCallBack.printMsg("");
    }
}
