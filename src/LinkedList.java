public class LinkedList {

    Node head;

    public LinkedList() {
    }
    void insertInTheBeginning(Node newNode){
        newNode.setNextNode(head);
        head = newNode;
    }

    void insertNode(Node newNode){
        if(head == null){
            head= newNode;
        }else{
            Node currentNode = head;
            while(currentNode.getNextNode() != null ){
                currentNode = currentNode.getNextNode();
            }

            currentNode.setNextNode(newNode);

        }

    }
    void searchForItem(String item){
        Node currentNode = head;
        int index = 0;
        while (currentNode != null){
            if(currentNode.getValue().equals(item)){
                System.out.println("Item found and it's index is: "+ index);
                break;
            }
            currentNode = currentNode.getNextNode();
            index = index+1;
        }
        if (currentNode == null) {
            System.out.println("Item not found!!");
        }
    }
    void removeItem(String item){
        Node currentNode = head;
        int index = 0;
        boolean found = false;
        if(head.getValue().equals(item)){
            head = head.getNextNode();
            found = true;
        }
        while (currentNode.getNextNode() != null){
            if(currentNode.getNextNode().getValue().equals(item)){
                found = true;
                if(currentNode.getNextNode().getNextNode() == null){
                    currentNode.setNextNode(null);

                }else {
                    currentNode.setNextNode(currentNode.getNextNode().getNextNode());
                }
                break;
            }
            currentNode = currentNode.getNextNode();
            index = index+1;
        }
        if (found == false) {
            System.out.println("Item not found!!");
        }
    }
     void printList(){
        Node currentNode = head;
        while(currentNode.getNextNode() != null){
            System.out.println(currentNode.getValue());
            currentNode = currentNode.getNextNode();
        }
         System.out.println(currentNode.getValue());

    }


}
