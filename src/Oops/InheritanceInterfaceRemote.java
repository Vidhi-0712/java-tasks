package Oops;

interface TvRemote{
    void meth1();
    void meth2();
}
interface SmartTvRemote{
    void meth3();
    void meth4();
}
class SmartTv implements TvRemote,SmartTvRemote{
    @Override
    public void meth1() {
        System.out.println("Turning Tv ON/OFF");
    }
    public void meth2() {
        System.out.println("Changing volume");
    }
    public void meth3() {
        System.out.println("Connecting to WI-FI");
    }
    public void meth4() {
        System.out.println("Streaming Content");
    }
    public void extraMethod() {
        System.out.println("Screen Mirroring");
    }
}
public class InheritanceInterfaceRemote {
    public static void main(String[] args) {
        TvRemote tv = new SmartTv();
        tv.meth1();
        tv.meth2();

        SmartTvRemote stv = new SmartTv();
        stv.meth3();
        stv.meth4();

        SmartTv smartTv = new SmartTv();
        smartTv.meth1();
        smartTv.meth2();
        smartTv.meth3();
        smartTv.meth4();
        smartTv.extraMethod();

    }
}
