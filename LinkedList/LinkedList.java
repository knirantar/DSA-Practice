package LinkedList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class LinkedList {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Node head = new Node(arr[0], null);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            mover.next = temp;
            mover = mover.next;
        }

        // traverseLinkedList(head);

        // int length = lengthOfLinkedList(head);
        // System.out.println(length);

        // Boolean out = searchLinkedList(head, 11);
        // System.out.println(out);

        // Node head2 = insertAtHead(head, 0);
        // traverseLinkedList(head2);

        // Node head2 = insertAtTail(head, 20);
        // traverseLinkedList(head2);

        // Node head2 = insertAtPosition(head, 6, 20);
        // traverseLinkedList(head2);

        // Node head2 = deleteHead(head);
        // traverseLinkedList(head2);

        // Node head2 = deleteTail(head);
        // traverseLinkedList(head2);

        // Node head2 = deleteAtPosNode(head, 6);
        // traverseLinkedList(head2);

        // Node head2 = deleteAValue(head, 1);
        // traverseLinkedList(head2);

        int[] arr1 = new int[] { 1, 2, 3, 4, 6 };
        int[] arr2 = new int[] { 1, 2, 2, 4, 4, 5, 6 };
        Node head1 = new Node(arr1[0], null);
        Node mover1 = head1;
        for (int i = 1; i < arr1.length; i++) {
            Node temp = new Node(arr1[i], null);
            mover1.next = temp;
            mover1 = mover1.next;
        }
        Node head2 = new Node(arr2[0], null);
        Node mover2 = head2;
        for (int i = 1; i < arr2.length; i++) {
            Node temp = new Node(arr2[i], null);
            mover2.next = temp;
            mover2 = mover2.next;
        }

        // Node head1 = new Node(arr1[0], null);
        // Node head2 = new Node(arr2[0], null);
        // head1.next = new Node(1, null);
        // head1.next.next = new Node(4, null);
        // head1.next.next.next = new Node(6, null);
        // head1.next.next.next.next = new Node(2, null);

        // head2.next = new Node(1, null);
        // head2.next.next = new Node(2, null);
        // head2.next.next.next = new Node(4, null);
        // head2.next.next.next.next = new Node(5, null);
        // head2.next.next.next.next.next = head1.next.next;
        // head2.next.next.next.next.next.next = head1.next.next.next;
        // head2.next.next.next.next.next.next.next = head1.next.next.next.next;
        // traverseLinkedList(head1);
        // traverseLinkedList(head2);

        // System.out.println();
        // Node head3 = addTwoLinkedLists(head1, head2);
        // traverseLinkedList(head3);

        // Node head2 = getOddEvenLinkedList(head);
        // traverseLinkedList(head2);

        // Node head2 = sortLinkedList012(head);
        // traverseLinkedList(head2);

        // Node head2 = removeNthNodeFromEnd(head, 5);
        // traverseLinkedList(head2);

        // Node head2 = reverseLinkedList(head);
        // traverseLinkedList(head2);

        // Boolean result = checkIfLinkedListIsPallindrome(head);
        // System.out.println(result);

        // Node head2 = addOneToLinkedList(head);
        // traverseLinkedList(head2);

        // Node head3 = findIntersectionPointOfTwoLinkedLists(head1, head2);
        // traverseLinkedList(head3);

        // Node mid = findMiddleElementOfLinekdList(head);
        // System.out.println(mid.data);

        // Node head1 = new Node(7, null);
        // head1.next = new Node(12, null);
        // head1.next.next = new Node(1, null);
        // head1.next.next.next = new Node(4, null);
        // head1.next.next.next.next = head1.next.next;
        // Boolean result = detectLoopInLinkedList(head1);
        // System.out.println(result);

        // Integer result = findLengthOfLoopLinkedList(head1);
        // System.out.println(result);

        // Node head2 = deleteMiddleElement(head);
        // traverseLinkedList(head2);

        // Node head2 = findTheStartingPointOfLoop(head1);
        // System.out.println(head2.data);

        // Node head2 = reverNodesInKGroup(head, 3);
        // traverseLinkedList(head2);

        // Node head2 = rotateLinkedList(head, 3);
        // traverseLinkedList(head2);

        // Node head3 = mergeTwoSortedLinkedList(head1, head2);
        // traverseLinkedList(head3);

    }

    public static void traverseLinkedList(Node head) {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static int lengthOfLinkedList(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static boolean searchLinkedList(Node head, int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key)
                return true;
            temp = temp.next;
        }
        return false;
    }

    public static Node insertAtHead(Node head, int x) {
        Node temp = new Node(x, null);
        temp.next = head;
        head = temp;
        return head;
    }

    public static Node insertAtPosition(Node head, int pos, int x) {
        Node newNode = new Node(x, null);
        if (head == null) {
            head = newNode;
            return head;
        }
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            if (count == pos - 1) {
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static Node insertAtTail(Node head, int x) {
        Node newNode = new Node(x, null);
        if (head == null) {
            head = newNode;
            return head;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    public static Node deleteHead(Node head) {
        if (head == null)
            return head;
        head = head.next;
        return head;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null)
            return null;
        Node temp = head;
        while (temp.next.next != null)
            temp = temp.next;
        temp.next = null;
        return head;
    }

    public static Node deleteAtPosNode(Node head, int pos) {
        if (head == null)
            return head;
        if (pos == 1) {
            head = head.next;
            return head;
        }
        int i = 0;
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (i == pos) {
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
            i++;
        }
        return head;
    }

    public static Node deleteAValue(Node head, int val) {
        if (head == null)
            return head;
        if (head.data == val) {
            head = head.next;
            return head;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.data == val) {
                prev.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    public static Node addTwoLinkedLists(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1, null);
        Node newHead = dummyNode;
        int carry = 0;
        while (temp1 != null || temp2 != null) {
            int sum = carry;
            if (temp1 != null)
                sum = sum + temp1.data;
            if (temp2 != null)
                sum = sum + temp2.data;
            carry = sum / 10;

            Node newNode = new Node(sum % 10, null);
            newHead.next = newNode;
            newHead = newHead.next;

            if (temp1 != null)
                temp1 = temp1.next;
            if (temp2 != null)
                temp2 = temp2.next;
        }
        if (carry > 0) {
            Node newNode = new Node(carry, null);
            newHead.next = newNode;
        }
        return dummyNode.next;
    }

    public static Node getOddEvenLinkedList(Node head) {
        if (head == null || head.next == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    public static Node sortLinkedList012(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node temp = head;
        Node zeroHead = new Node(-1, null);
        Node oneHead = new Node(-1, null);
        Node twoHead = new Node(-1, null);
        Node zero = zeroHead;
        Node one = oneHead;
        Node two = twoHead;
        while (temp != null) {
            if (temp.data == 0) {
                zero.next = temp;
                zero = zero.next;
            } else if (temp.data == 1) {
                one.next = temp;
                one = one.next;
            } else {
                two.next = temp;
                two = two.next;
            }
            temp = temp.next;
        }
        if (oneHead.next != null)
            zero.next = oneHead.next;
        else
            zero.next = twoHead.next;
        one.next = twoHead.next;
        two.next = null;
        return zeroHead.next;
    }

    public static Node removeNthNodeFromEnd(Node head, int n) {

        Node fast = head;
        int i = 0;
        while (i != n) {
            fast = fast.next;
            i++;
        }
        if (fast == null)
            return head.next;

        Node slow = head;
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;

    }

    public static Node reverseLinkedList(Node head) {
        // We can do it with stack - pushing and poppping - requires external space

        // Iterative solution
        // Node prev = null;
        // Node temp = head;

        // while (temp != null) {
        // Node front = temp.next;
        // temp.next = prev;
        // prev = temp;
        // temp = front;
        // }
        // return prev;

        // Recusrsive solution
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseLinkedList(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }

    public static Boolean checkIfLinkedListIsPallindrome(Node head) {

        // Again similarly we can use stack - but it will be O(N) space
        // Tortoise and hare to the rescue

        if (head == null || head.next == null)
            return true;
        Node fast = head;
        Node slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        Node newHead = reverseLinkedList(slow.next);
        Node first = head;
        Node second = newHead;
        while (second != null) {
            if (first.data != second.data)
                return false;
            first = first.next;
            second = second.next;
        }
        return true;

    }

    public static Node addOneToLinkedList(Node head) {

        // Using reversal method - you cannot do this withour reversal in iterativeway
        Node newHead = reverseLinkedList(head);
        Node temp = newHead;
        while (temp != null) {
            temp.data = temp.data + 1;
            if (temp.data % 10 != 0) {
                break;
            }
            temp.data = 0;
            temp = temp.next;
        }
        head = reverseLinkedList(newHead);
        if (temp == null) {
            Node newHeadNode = new Node(1, head);
            head = newHeadNode;
        }
        return head;
    }

    public static Node findIntersectionPointOfTwoLinkedLists(Node head1, Node head2) {
        if (head1 == null || head2 == null)
            return null;

        // HashMap<Node, Integer> myMap = new HashMap<>();

        Node temp1 = head1;
        Node temp2 = head2;
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;

            if (temp1 == temp2)
                return temp1;

            if (temp1 == null) {
                temp1 = head2;
            }
            if (temp2 == null) {
                temp2 = head1;
            }
        }
        return null;
    }

    public static Node findMiddleElementOfLinekdList(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast.next == null)
            return slow;
        else
            return slow.next;
    }

    public static Boolean detectLoopInLinkedList(Node head) {
        // We can use hasmap and store nodes and compare if exists

        Node slow = head;
        Node fast = head;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;

    }

    public static Integer findLengthOfLoopLinkedList(Node head) {
        // again can be solved by map
        // but optimal approach is tortoise and hare algorithm

        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow, fast);
            }
        }
        return 0;
    }

    public static int findLength(Node slow, Node fast) {
        int count = 1;
        fast = fast.next;
        while (slow != fast) {
            count++;
            fast = fast.next;
        }
        return count;
    }

    public static Node deleteMiddleElement(Node head) {
        Node slow = head;
        Node fast = head;
        fast = fast.next.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }

    public static Node findTheStartingPointOfLoop(Node head) {
        // How does this algorithm work ??
        //
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // loop detected
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }

        return null;
    }

    public static Node reverNodesInKGroup(Node head, int k) {
        Node temp = head, nextNode = null, prevNode = null;
        while (temp != null) {
            Node kthNode = findKthNode(temp, k);
            if (kthNode == null) {
                if (prevNode != null)
                    prevNode.next = temp;
                break;
            } else {
                nextNode = kthNode.next;
                kthNode.next = null;
                reverseLinkedList(temp);
                if (temp == head) {
                    head = kthNode;
                } else {
                    prevNode.next = kthNode;
                }
                prevNode = temp;
                temp = nextNode;
            }
        }
        nextNode = temp;
        temp.next = null;
        return head;
    }

    public static Node findKthNode(Node temp, int k) {
        k--;
        while (k > 0 && temp != null) {
            temp = temp.next;
            k--;
        }
        return temp;
    }

    public static Node rotateLinkedList(Node head, int k) {
        Node temp = head;
        Node tail = head;
        int len = 0;
        while (tail.next != null) {
            len++;
            tail = tail.next;
        }
        tail.next = head;
        int rotations = k % len;
        if (rotations == 0)
            return head;
        rotations--;
        while (rotations != 0) {
            rotations--;
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }

    public static Node mergeTwoSortedLinkedList(Node head1, Node head2) {
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummyNode = new Node(-1, null);
        Node temp = dummyNode;

        while (temp1 != null && temp2 != null) {
            if (temp1.data > temp2.data) {
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            } else {
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
        }
        if (temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }

        return dummyNode.next;
    }

    public static Node sortLinkedList(Node head) {
        Node temp = head;
        List<Integer> li = new ArrayList<Integer>();
        while (temp != null) {
            li.add(temp.data);
            temp = temp.next;
        }
        Collections.sort(li);
        if (li.isEmpty()) {
            return null;
        }
        head = new Node(li.get(0), null);
        temp = head;
        for (int i = 1; i < li.size(); i++) {
            temp.next = new Node(li.get(i), null);
            temp = temp.next;
        }
        return head;
    }
}
