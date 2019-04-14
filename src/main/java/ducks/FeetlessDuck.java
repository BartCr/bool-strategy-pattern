package ducks;

public class FeetlessDuck extends Duck {
    public FeetlessDuck(String name) {
        super(name);
    }

    @Override
    public String walk() {
        return "no walks in the park for me";
    }

    @Override
    public String swim() {
        return name + " is floating like rubber a duck";
    }

}
