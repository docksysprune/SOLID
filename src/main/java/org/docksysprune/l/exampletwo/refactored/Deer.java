package org.docksysprune.l.exampletwo.refactored;

public class Deer extends LightweightAnimal{
    @Override
    public void jump() {
        System.out.println("Deer jumps");
    }

    @Override
    public void jumpHole(LightweightAnimal animal) throws Exception {
        super.jumpHole(animal);
    }
}
