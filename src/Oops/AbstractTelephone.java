package Oops;

abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone{
    public void ring(){
        System.out.println("ringing ");
    }
    public void lift(){
        System.out.println("lifting ");
    }
    public void disconnect(){
        System.out.println("disconnecting ");
    }
    void dialing(){
        System.out.println("Dialing");
    }
}

public class AbstractTelephone {
    public static void main(String[] args) {
        Telephone t = new SmartTelephone();
        t.ring();
        t.lift();
        t.disconnect();

        SmartTelephone st = new SmartTelephone();
        st.dialing();
    }
}
