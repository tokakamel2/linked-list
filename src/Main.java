
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Node node = new Node("1",null);
        Node node1 = new Node("2",null);
        Node node2 = new Node("3",null);
        Node node3 = new Node("4",null);


        LinkedList linkedList = new LinkedList();
        linkedList.insertNode(node);
        linkedList.insertNode(node1);
        linkedList.insertNode(node2);
        linkedList.insertNode(node3);
        linkedList.printList();
        while (true){
        System.out.println("------Welcome to my linked list application------");
        System.out.println("Insert in the beginning -> press 1");
        System.out.println("Insert in the end -> press 2");
        System.out.println("Search for item -> press 3");
        System.out.println("Remove node -> press 4");
        System.out.println("Print linked list -> press 5");

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                System.out.println("Insert the value you want to store");
                String valueBegin = scanner.nextLine();
                Node newNodeBegin = new Node(valueBegin,null);
                linkedList.insertInTheBeginning(newNodeBegin);
                break;
            case "2":
                System.out.println("Insert the value you want to store");
                String valueEnd = scanner.nextLine();
                Node newNodeEnd = new Node(valueEnd,null);
                linkedList.insertNode(newNodeEnd);
                break;
            case "3":
                System.out.println("Insert the value you want to search for");
                String searchItem = scanner.nextLine();
                linkedList.searchForItem(searchItem);
                break;
            case "4":
                System.out.println("Insert the value you want to remove");
                String removeItem = scanner.nextLine();
                linkedList.removeItem(removeItem);
                break;
            case "5":
                linkedList.printList();
                break;

        }


    }
    }




}
