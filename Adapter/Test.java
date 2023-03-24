package Adapter;

import Adapter.adapter.UsbMicroTpcAdapter;
import Adapter.adapter.UsbMicroTpcAdapter1;

public class Test {
    public static void main(String[] args) {
        Phone f= new Phone();
        f.setTpcCable( new Charger());
        f.show("charger connected");
        f.setTpcCable(new Pc());
        f.show("pc connected");

        UsbMicroTpcAdapter usbMicroTpcAdapter=new UsbMicroTpcAdapter();
        usbMicroTpcAdapter.setUsbMicro(new Mp4());
        f.setTpcCable(usbMicroTpcAdapter);
        usbMicroTpcAdapter.show("the connected successfully");

        UsbMicroTpcAdapter1 usbMicroTpcAdapter2=new UsbMicroTpcAdapter1();
        f.setTpcCable(usbMicroTpcAdapter2);
        usbMicroTpcAdapter.show("Adapter 2 connected successfully");

        UsbMicroTpcAdapter usbMicroTpcAdapter1=new UsbMicroTpcAdapter();
        usbMicroTpcAdapter1.setUsbMicro(new HautPBleu());
        f.setTpcCable(new HautPBleu());
        f.show("is done");
        f.setTpcCable(usbMicroTpcAdapter1);
    }
}
