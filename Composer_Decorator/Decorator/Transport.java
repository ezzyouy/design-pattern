package Composer_Decorator.Decorator;

import Composer_Decorator.Composant.Poisson;

public class Transport extends Decorateur{

    public Transport(Poisson poisson) {
        super(poisson);
    }

    @Override
    public String getType() {
        return poisson.getType()+" et livraison ";
    }

    @Override
    public int price() {
        return 50+poisson.price();
    }
}
