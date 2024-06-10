interface Flight {
    void fly();
}

interface Strength {
    void superStrength();
}

class SuperHero implements Flight, Strength {
    String name;

    public SuperHero(String name) {
        this.name = name;
    }

    @Override
    public void fly() {
        System.out.println(name + " flies through the sky!");
    }

    @Override
    public void superStrength() {
        System.out.println(name + " demonstrates super strength!");
    }

    public void useAbility() {
        System.out.println(name + " uses super abilities!");
    }
}


public class MultipleInh {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman");
        superman.useAbility(); 
        superman.fly(); 
        superman.superStrength(); 
    }
}
