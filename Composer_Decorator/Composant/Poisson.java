package Composer_Decorator.Composant;

public abstract class Poisson {

    protected String type;

    public String getType(){
       return type;
    }
    public abstract int price();
}
