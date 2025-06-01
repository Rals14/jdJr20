package binarytree;

public class BinarySearchTree {
    // Definimos la raíz del árbol
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Tarea ver como mostrar el árbol recorrido: inorder, preorder, postorder.

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insertar nodos en el árbol
        // El primer debería será la raíz
        tree.root = new TreeNode(50);

        // Insertar nodos a la izquierda
        tree.root.left = new TreeNode(30);
        tree.root.left.left = new TreeNode(20);
        tree.root.left.right = new TreeNode(40);

        // Insertar nodos a la derecha
        tree.root.right = new TreeNode(70);
        tree.root.right.left = new TreeNode(60);
        tree.root.right.right = new TreeNode(80);

        // Mensaje de arbol creado
        System.out.println("Árbol binario de búsqueda creado.");
    }
}
