package fr.bendjebbourNaim.entityExerciceCommande;

import fr.bendjebbourNaim.designExerciceCommande.IVisitable;
import fr.bendjebbourNaim.designExerciceCommande.IVisitor;

import java.util.ArrayList;
import java.util.List;

public class GroupeClient implements IVisitable{

    private String name;
    private List<Client> customers;

    public GroupeClient(String name)
    {
        this.name=name;
        this.customers = new ArrayList<>();
    }

    public void addClient(Client c )
    {
        this.customers.add(c);
    }

    public String getName() {
        return name;
    }

    @Override
    public void accept(IVisitor visitable) {
        visitable.visit(this);
        for(Client c : customers)
        {
            c.accept(visitable);
        }

    }
}
