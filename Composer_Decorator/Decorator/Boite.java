package Composer_Decorator.Decorator;

import Composer_Decorator.Composant.Poisson;

public class Boite extends Decorateur{

    public Boite(Poisson poisson) {
        super(poisson);
    }

    @Override
    public String getType() {
        return poisson.getType()+" avec la boite";
    }

    public int price() {
        return 2+poisson.price();
    }
}
