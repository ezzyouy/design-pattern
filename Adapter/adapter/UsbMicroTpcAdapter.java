package Adapter.adapter;

import Adapter.TpcCable;
import Adapter.UsbMicro;

public class UsbMicroTpcAdapter implements TpcCable {
    private UsbMicro usbMicro;
    public void show(String msg) {
        System.out.println("¨¨¨¨¨¨¨¨Adapter¨¨¨¨¨¨¨¨¨");
        byte[] data=msg.getBytes();
        usbMicro.connecte(data);
        System.out.println("¨¨¨¨¨¨¨¨/Adapter¨¨¨¨¨¨¨¨¨");
    }

    public void setUsbMicro(UsbMicro usbMicro){
        this.usbMicro=usbMicro;
    }
}
