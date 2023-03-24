package Composer_Decorator.Decorator;

import Composer_Decorator.Composant.Poisson;

public abstract class Decorateur extends Poisson {

    protected Poisson poisson;

    public Decorateur(Poisson poisson) {
        this.poisson = poisson;
    }
}
