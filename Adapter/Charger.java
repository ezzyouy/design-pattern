package Adapter;

public class Charger implements TpcCable {
    public void show(String msg) {
        System.out.println("###############");
        System.out.println(msg);
        System.out.println("###############");
    }
}
