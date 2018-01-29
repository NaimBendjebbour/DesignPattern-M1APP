package fr.bendjebbourNaim.entityExerciceCommande;

import fr.bendjebbourNaim.designExerciceCommande.IVisitable;
import fr.bendjebbourNaim.designExerciceCommande.IVisitor;

public class Ligne implements IVisitable{

    private String name;

    public Ligne(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IVisitor visitable) {
        visitable.visit(this);
    }
}
