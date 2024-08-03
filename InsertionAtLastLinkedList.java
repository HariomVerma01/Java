import java.util.Scanner;

class Node {
    int value;
    Node next;
}

public class InsertionAtLastLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int val = 0;
        Node head = null;
        Node curr = null;
        for (int i = 0; i < 3; i++) {
            Node obj = new Node();
            val = sc.nextInt();
            obj.value = val;
            if (head == null) {
                head = obj;
                curr = obj;
                curr.next = null;
                continue;
            }
            curr.next = obj;
            curr = obj;
            curr.next = null;
        }
        // insert At Last
        Node newObj = new Node();
        System.out.println("New Value Inserted");
        newObj.value = 20;
        curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newObj;
        curr = newObj;
        curr.next = null;
        Node a = new Node();
        a = head;
        while (a != null) {
            System.out.println(a.value);
            a = a.next;
        }
        sc.close();
    }
}
