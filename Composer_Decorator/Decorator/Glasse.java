package Composer_Decorator.Decorator;

import Composer_Decorator.Composant.Poisson;

public class Glasse extends Decorateur{

    public Glasse(Poisson poisson) {
        super(poisson);
    }

    @Override
    public String getType() {
        return poisson.getType()+" plus glasse";
    }

    public int price() {
        return 3+poisson.price();
    }
}
