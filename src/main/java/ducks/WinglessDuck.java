package ducks;

public class WinglessDuck extends Duck {

    public WinglessDuck(String name) {
        super(name);
    }

    @Override
    public String swim() {
        return name + " is swimming like Michael Phelps";
    }

    @Override
    public String fly() {
        return "flying without wings, they are numb so i don't feel a thing";
    }
}
