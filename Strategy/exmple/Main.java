package Strategy.exmple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Context context=new Context();
       // context.effectuerOperation();
//        context.setStrategy(new StrategyImpl());
//        context.effectuerOperation();
//        context.setStrategy(new StrategyImpl2());
//        context.effectuerOperation();
        Scanner scanner= new Scanner(System.in);
        while(true){
            System.out.println("Quelle Strategy?:");
            String strategyClass= scanner.nextLine();
            Startegy startegy= (Startegy) Class.forName(strategyClass).newInstance();
           context.setStrategy(startegy);
           context.effectuerOperation();
        }
    }
}
