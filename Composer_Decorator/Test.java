package Composer_Decorator;

import Composer_Decorator.Composant.Calamar;
import Composer_Decorator.Composant.Creuvette;
import Composer_Decorator.Composant.Poisson;
import Composer_Decorator.Decorator.Boite;
import Composer_Decorator.Decorator.Glasse;
import Composer_Decorator.Decorator.Transport;

public class Test {
    public static void main(String[] args) {
        Poisson poisson;

        poisson= new Calamar();
        System.out.println(poisson.getType());
        System.out.println(poisson.price());
        System.out.println("------------------");
        poisson=new Boite(poisson);
        System.out.println(poisson.getType());
        System.out.println(poisson.price());
        System.out.println("------------------");
        poisson=new Glasse(poisson);
        System.out.println(poisson.getType());
        System.out.println(poisson.price());
        System.out.println("------------------");
        poisson=new Transport(poisson);
        System.out.println(poisson.getType());
        System.out.println(poisson.price());
        System.out.println("------------------");

        Poisson po;
        po=new Glasse(new Boite(new Glasse(new Transport(new Creuvette()))));
        System.out.println(po.getType());
        System.out.println(po.price());
    }
}
