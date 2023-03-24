package Adapter;

public class HautPBleu implements TpcCable, UsbMicro{
    public void show(String msg) {
        System.out.println("¨¨¨¨¨¨¨¨HPB UM¨¨¨¨¨¨¨¨¨");
        System.out.println(msg);
        System.out.println("¨¨¨¨¨¨¨¨HPB UM¨¨¨¨¨¨¨¨¨");
    }

    public void connecte(byte[] data) {
        String m=new String(data);
        System.out.println("¨¨¨¨¨¨¨¨HPB TC¨¨¨¨¨¨¨¨¨");
        System.out.println(m);
        System.out.println("¨¨¨¨¨¨¨¨HPB TC¨¨¨¨¨¨¨¨¨");
    }
}
