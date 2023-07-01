package org.example.l.exampletwo.refactored;

public class LightweightAnimal extends Animal {
    public void jump(){}

    @Override
    public void walk() {
        System.out.println("Lightweight animal walks");
    }

    public void jumpHole(LightweightAnimal animal) throws Exception {
        super.walk();
        jump();
        super.walk();
    }
}
