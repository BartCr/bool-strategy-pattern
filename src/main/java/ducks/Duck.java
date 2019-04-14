package ducks;

public abstract class Duck {

    String name;

    public String getName() {
        return name;
    }

    public Duck(String name) {
        this.name = name;
    }

    public String walk(){
        return name + " is walking around happy as a duck can be";
    }

    public String fly(){ return name + " is flying around happy as a duck can be";}

    public String swim(){
        return name + " is swimming around happy as a duck can be";
    }

    public String sleep(){return name + " is dreaming happy as a duck can be";}

    public String quack(){
        return  "quack quack my name is "+name;
    }
}
