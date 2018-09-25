package 接口回调;

public class portMain implements ICallBack {

    public static void main(String[] args) {
            portMain portMain=new portMain();
            portMain.onCall();
    }

    private void onCall(){
        Client.setiCallBack(this);
        Client.doCallBackMethod();
    }
    @Override
    public void printMsg(String msg) {
        System.out.println("得到的数据:");
    }
}
