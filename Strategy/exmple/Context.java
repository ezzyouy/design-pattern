package Strategy.exmple;

public class Context {

    private Startegy startegy= new DefaultStrategy();

    public void effectuerOperation(){
        System.out.println("*************");
        startegy.operationStrategy();
        System.out.println("*************");
    }

    public void setStrategy(Startegy strategy) {
        this.startegy=strategy;
    }
}
