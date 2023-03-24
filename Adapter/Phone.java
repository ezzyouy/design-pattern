package Adapter;

public class Phone {
    private TpcCable tpc;

    public void show(String message){
        System.out.println("---------------");
        tpc.show(message);
        System.out.println("---------------");
    }
    public void setTpcCable(TpcCable tpc){
        this.tpc=tpc;
    }

}
