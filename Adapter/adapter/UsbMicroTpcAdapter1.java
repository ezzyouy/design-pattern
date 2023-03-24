package Adapter.adapter;

import Adapter.Mp4;
import Adapter.Phone;
import Adapter.TpcCable;
import Adapter.UsbMicro;

public class UsbMicroTpcAdapter1 extends Mp4 implements TpcCable  {

    public void show(String msg) {
        System.out.println("¨¨¨¨¨¨¨¨Adapter¨¨¨¨¨¨¨¨¨");
        byte[] data=msg.getBytes();
        super.connecte(data);
        System.out.println("¨¨¨¨¨¨¨¨/Adapter¨¨¨¨¨¨¨¨¨");
    }

}
