import java.util.Scanner;

public class Garrett_Burr_Lab6 
{
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search the tree for: ");
        int input = scanner.nextInt();
        if (bst.contains(input)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}