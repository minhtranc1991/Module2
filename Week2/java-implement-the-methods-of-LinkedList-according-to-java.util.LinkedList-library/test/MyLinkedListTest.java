public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<Integer>();

        myLinkedList.add(0,11);
        myLinkedList.add(1,12);
        myLinkedList.add(2,13);
        myLinkedList.add(3,14);
        myLinkedList.add(4,15);

        System.out.println("before remove: ");
        myLinkedList.printList();
        System.out.print("Size =");
        System.out.println(myLinkedList.Size());
        System.out.print("Check contain:");
        System.out.println(myLinkedList.contains(3)+" "+"at index ="+" "+myLinkedList.indexOf(3));

        myLinkedList.remove(2);

        System.out.println("After remove: ");
        myLinkedList.printList();
        System.out.print("Size =");
        System.out.println(myLinkedList.Size());

        System.out.println("Clone:");
        MyLinkedList<Integer> newList = (MyLinkedList<Integer>) myLinkedList.clone();
        newList.printList();
    }
}