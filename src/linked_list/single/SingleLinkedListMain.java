package linked_list.single;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        SingleLinkedList sll1 = new SingleLinkedList();
        sll1.insertRecursive(20);
        sll1.insertRecursive(30);
        sll1.insertRecursive(40);
        sll1.insertRecursive(50);
        System.out.println(sll1.getFirst());
//        sll1.display();
//        sll1.reverse();
//        System.out.println();
//        sll1.display();
    }
}
