package fr.bendjebbourNaim.entityExerciceCommande;

import fr.bendjebbourNaim.designExerciceCommande.IVisitable;
import fr.bendjebbourNaim.designExerciceCommande.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Commande implements IVisitable{

    private String name;
    private List<Ligne> lignes;

    public Commande(String name)
    {
        this.name=name;
        this.lignes = new ArrayList<>();
    }

    public Commande(String name, String ligneName)
    {
        this.name=name;
        this.lignes=new ArrayList<>();
        this.lignes.add(new Ligne(ligneName));
    }

    @Override
    public void accept(IVisitor visitable) {
        visitable.visit(this);
        for(Ligne l : lignes)
        {
            l.accept(visitable);
        }
    }
}
