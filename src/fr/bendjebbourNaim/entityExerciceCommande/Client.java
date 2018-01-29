package fr.bendjebbourNaim.entityExerciceCommande;

import fr.bendjebbourNaim.designExerciceCommande.IVisitable;
import fr.bendjebbourNaim.designExerciceCommande.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class Client implements IVisitable{

    private String name;
    private List<Commande> commandes;

    public Client(){
        this.commandes = new ArrayList<>();
        this.name="Unknow";
    }

    public Client(String name)
    {
        this.name=name;
        this.commandes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCommande(Commande c){
        this.commandes.add(c);
    }

    @Override
    public void accept(IVisitor visitable)
    {

        visitable.visit(this);
        for(Commande c : commandes)
        {
            c.accept(visitable);
        }
    }
}
