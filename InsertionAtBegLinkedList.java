import java.util.*;

class Node {
    int value;
    Node next;
}

class Link {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        Node curr = null;
        int val = 0;
        for (int i = 0; i < 5; i++) {
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
        curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }

    }
}