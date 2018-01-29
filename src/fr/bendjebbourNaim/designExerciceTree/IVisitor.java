package fr.bendjebbourNaim.designExerciceTree;

import fr.bendjebbourNaim.entityExerciceTree.TreeNode;

public interface IVisitor<T> {
    visit(TreeNode<T> node);
}
