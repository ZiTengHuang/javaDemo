package 接口回调.demo2;

public class Contach {
    public ICallBack2 mCallBack2;

    public void setiCallBack2(ICallBack2 iCallBack2) {
        mCallBack2 = iCallBack2;
    }

    public void doCallBack() {
        mCallBack2.doMsg();
    }
}
