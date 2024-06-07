package LinkedList;

import java.util.ArrayList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 6, 10, 10, 10 };
        Node head = new Node(arr[0], null, null);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = prev.next;
        }
        // traverseLinkedList(head);

        // Node head2 = deleteHead(head);
        // traverseLinkedList(head2);

        // Node head2 = deleteTail(head);
        // traverseLinkedList(head2);

        // Node head2 = deleteKthElement(head, 6);
        // traverseLinkedList(head2);

        // Node head2 = insertAtHead(head, 9);
        // traverseLinkedList(head2);

        // Node head2 = insertAtTail(head, 20);
        // traverseLinkedList(head2);

        // Node head2 = insertAtKthPosition(head, 30, 8);
        // traverseLinkedList(head2);

        // Node head2 = reverseDoublyLinkedList(head);
        // traverseLinkedList(head2);

        // Node head2 = deleteAllOccurrencesOfKey(head, 1);
        // traverseLinkedList(head2);

        // ArrayList<int[]> result = findPairsWithGivenSum(head, 5);
        // for (int[] pair : result) {
        // System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        // }

        Node head2 = removeDuplicatesFromDoublyLinkedList(head);
        traverseLinkedList(head2);

    }

    public static void traverseLinkedList(Node head) {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static Node deleteHead(Node head) {
        if (head == null)
            return head;
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null)
            return null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node back = temp.prev;
        back.next = null;
        temp.prev = null;
        return head;
    }

    public static Node deleteKthElement(Node head, int k) {
        if (head == null)
            return null;
        Node temp = head;
        int count = 0;
        while (temp.next != null) {
            count++;
            if (count == k)
                break;

            temp = temp.next;
        }
        if (temp.prev == null && temp.next == null) {
            return null;
        } else if (temp.prev == null) {
            head = deleteHead(head);
        } else if (temp.next == null) {
            head = deleteTail(head);
        } else {
            Node back = temp.prev;
            back.next = temp.next;
            temp.next.prev = back;
        }
        return head;
    }

    public static Node insertAtHead(Node head, int x) {
        Node newNode = new Node(x, null, null);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    public static Node insertAtTail(Node head, int x) {
        Node newNode = new Node(x, null, null);
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

        return head;
    }

    public static Node insertAtKthPosition(Node head, int x, int k) {
        Node newNode = new Node(x, null, null);
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            if (count == k)
                break;
            temp = temp.next;
        }
        if (k == 1) {
            return insertAtHead(head, x);
        }
        Node back = temp.prev;
        back.next = newNode;
        newNode.prev = back;
        newNode.next = temp;
        return head;
    }

    public static Node reverseDoublyLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node current = head;
        Node temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        return temp.prev;
    }

    public static Node deleteAllOccurrencesOfKey(Node head, int key) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                if (temp == head) {
                    head = head.next;
                } else {
                    Node nextNode = temp.next;
                    temp.prev.next = nextNode;
                    nextNode.prev = temp.prev;
                }
            }
            temp = temp.next;
        }
        return head;
    }

    public static ArrayList<int[]> findPairsWithGivenSum(Node head, int sum) {
        // Nested temp pointers can be a solution but we wont be using DLL advantage
        // there
        // But there is one left and right pointer approach similar to arrays

        Node left = head;

        Node right = findTail(head);
        ArrayList<int[]> pairs = new ArrayList<>();
        while (left.data < right.data) {
            System.out.println(left.data);
            System.out.println(right.data);
            if (left.data + right.data == sum) {
                pairs.add(new int[] { left.data, right.data });
                left = left.next;
                right = right.prev;
            } else if (left.data + right.data > sum) {
                right = right.prev;
            } else {
                left = left.next;
            }
        }
        return pairs;
    }

    public static Node findTail(Node head) {

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    public static Node removeDuplicatesFromDoublyLinkedList(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            Node nextNode = temp.next;
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }
            temp.next = nextNode;
            if (nextNode != null) {
                nextNode.prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
}
