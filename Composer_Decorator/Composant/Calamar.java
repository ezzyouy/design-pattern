package Composer_Decorator.Composant;

public class Calamar extends Poisson{
    @Override
    public String getType() {
        return "Calamar";
    }

    public int price() {
        return 12;
    }
}
