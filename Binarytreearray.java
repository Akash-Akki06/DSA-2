
import java.util.Scanner;

class Binarytreearray {

    static int[] tree = new int[50];
    static int n = 0;

    // Create Tree
    static void createTree() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            tree[i] = sc.nextInt();
        }
    }

    // Level Order Display
    static void display() {
        if (n == 0) {
            System.out.println("Tree is empty");
            return;
        }
        System.out.print("Level Order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    // Inorder Traversal
    static void inorder(int i) {
        if (i >= n) return;

        inorder(2 * i + 1);
        System.out.print(tree[i] + " ");
        inorder(2 * i + 2);
    }

    // Preorder Traversal
    static void preorder(int i) {
        if (i >= n) return;

        System.out.print(tree[i] + " ");
        preorder(2 * i + 1);
        preorder(2 * i + 2);
    }

    // Postorder Traversal
    static void postorder(int i) {
        if (i >= n) return;

        postorder(2 * i + 1);
        postorder(2 * i + 2);
        System.out.print(tree[i] + " ");
    }

    // Height of Tree
    static int height(int i) {
        if (i >= n) return 0;

        int left = height(2 * i + 1);
        int right = height(2 * i + 2);

        return Math.max(left, right) + 1;
    }

    // Count Leaf Nodes
    static int countLeaf(int i) {
        if (i >= n) return 0;

        if (2 * i + 1 >= n && 2 * i + 2 >= n)
            return 1;

        return countLeaf(2 * i + 1) + countLeaf(2 * i + 2);
    }

    // Main Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Create Binary Tree");
            System.out.println("2. Display Level Order");
            System.out.println("3. Inorder Traversal");
            System.out.println("4. Preorder Traversal");
            System.out.println("5. Postorder Traversal");
            System.out.println("6. Height of Tree");
            System.out.println("7. Count Total Nodes");
            System.out.println("8. Count Leaf Nodes");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createTree();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    System.out.print("Inorder: ");
                    inorder(0);
                    System.out.println();
                    break;
                case 4:
                    System.out.print("Preorder: ");
                    preorder(0);
                    System.out.println();
                    break;
                case 5:
                    System.out.print("Postorder: ");
                    postorder(0);
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Height of Tree: " + height(0));
                    break;
                case 7:
                    System.out.println("Total Nodes: " + n);
                    break;
                case 8:
                    System.out.println("Leaf Nodes: " + countLeaf(0));
                    break;
                case 9:
                    System.out.println("Exited");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 9);
    }
}

