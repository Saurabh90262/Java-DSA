public class TreeBuilding {

    // Define the Node class
    public static class Node {
        int data;
        Node left;
        Node right;

        // Constructoriss
        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // In-order Traversal (Left, Root, Right)
    public static void printTree(Node root) {
        if (root == null)
            return;
        printTree(root.left);
        System.out.print(root.data + " ");
        printTree(root.right);
    }

    public static void main(String[] args) {
        // Build the tree manually
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        // Display the tree using in-order traversal
        System.out.println("In-order Traversal of the Tree:");
        printTree(root);
    }
}
