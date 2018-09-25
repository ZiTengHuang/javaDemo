package 接口回调.demo2;

public class PortBackMain {
    public static void main(String[] args) {
         Contach contach=new Contach();
         contach.setiCallBack2(new Client2(){
             @Override
             public void doMsg() {
                 super.doMsg();
             }
         });
         contach.doCallBack();
    }
}
