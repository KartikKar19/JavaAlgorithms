import java.util.Scanner;

class Main {
    static class Node {
        int data;
        Node next, prev;
        Node(int data) { this.data = data; }
    }
    static Node reverse(Node head) {
        Node temp = null, current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        return (temp != null) ? temp.prev : head;
    }
    static Node merge(Node first, Node second) {
        if (first == null) return second;
        if (second == null) return first;

        if (first.data < second.data) {
            first.next = merge(first.next, second);
            if (first.next != null) first.next.prev = first;
            return first;
        } else {
            second.next = merge(first, second.next);
            if (second.next != null) second.next.prev = second;
            return second;
        }
    }
    static Node sort(Node head) {
        if (head == null || head.next == null) return head;

        Node middle = getMiddle(head);
        Node nextOfMiddle = middle.next;
        middle.next = null;
        if (nextOfMiddle != null) nextOfMiddle.prev = null;

        Node left = sort(head);
        Node right = sort(nextOfMiddle);

        return merge(left, right);
    }
    static Node getMiddle(Node head) {
        if (head == null) return head;
        Node slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static Node push(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        if (head != null) head.prev = newNode;
        return newNode;
    }
    static void printList(Node head) {
        if (head == null) {
            System.out.println("Doubly Linked List is empty");
            return;
        }
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Node head = null;
        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            head = push(head, data);
        }

        System.out.println("\nOriginal List:");
        printList(head);

        head = sort(head);
        System.out.println("\nSorted List:");
        printList(head);
        head = reverse(head);
        System.out.println("\nReversed List:");
        printList(head);
        scanner.close();
    }
}
