package Composer_Decorator.Composant;

public class Creuvette extends Poisson{
    @Override
    public String getType() {
        return "Creuvette";
    }

    public int price() {
        return 95;
    }
}
