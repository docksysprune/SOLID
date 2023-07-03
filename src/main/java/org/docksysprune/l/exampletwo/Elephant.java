package org.docksysprune.l.exampletwo;

public class Elephant extends Animal{
    @Override
    public void jumpHole(Animal animal) throws Exception {
        throw new Exception("An elephant cannot jump");
    }
}
