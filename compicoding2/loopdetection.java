import java.util.*;

class Main {
    Node head;

    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; }
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    boolean detectLoop() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true; // Loop detected
        }
        return false;
    }

    public static void main(String[] args) {
        Main list = new Main();
        list.push(20);
        list.push(4);
        list.push(15);
        list.push(10);

        list.head.next.next.next.next = list.head; // Creating a loop

        System.out.println(list.detectLoop() ? "Loop Exists" : "No Loop");
    }
}
