package fr.bendjebbourNaim.designExerciceCommande;

import fr.bendjebbourNaim.entityExerciceCommande.Client;
import fr.bendjebbourNaim.entityExerciceCommande.Commande;
import fr.bendjebbourNaim.entityExerciceCommande.GroupeClient;
import fr.bendjebbourNaim.entityExerciceCommande.Ligne;

public interface IVisitor {

    void visit(Commande obj);

    void visit(Ligne obj);

    void visit(Client obj);

    void visit(GroupeClient obj);
}
