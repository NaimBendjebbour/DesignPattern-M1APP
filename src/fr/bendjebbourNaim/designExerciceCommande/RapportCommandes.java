package fr.bendjebbourNaim.designExerciceCommande;

import fr.bendjebbourNaim.entityExerciceCommande.Client;
import fr.bendjebbourNaim.entityExerciceCommande.Commande;
import fr.bendjebbourNaim.entityExerciceCommande.GroupeClient;
import fr.bendjebbourNaim.entityExerciceCommande.Ligne;

public class RapportCommandes implements IVisitor {


    @Override
    public void visit(Commande obj) {
        obj.accept(this);
    }

    @Override
    public void visit(Ligne obj) {
        obj.accept(this);
    }

    @Override
    public void visit(Client obj) {
        obj.accept(this);
    }

    @Override
    public void visit(GroupeClient obj) {

    }

    void afficherCommandes()
    {

    }
}
