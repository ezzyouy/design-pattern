package Adapter;

public class Mp4 extends Phone implements UsbMicro {
    public void connecte(byte[] data) {
        System.out.println("~~~~~~~~~mp4~~~~~~~~~");
        String msg= new String(data);
        System.out.println(msg);
        System.out.println("~~~~~~~~~mp4~~~~~~~~~");
    }
}
