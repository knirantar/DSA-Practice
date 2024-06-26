package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

}

public class BinarySearchTree {
    public static void main(String[] args) {
        Node root = new Node(100);
        root.left = new Node(80);
        root.left.left = new Node(60);
        root.left.right = new Node(90);
        root.right = new Node(120);
        root.right.left = new Node(110);
        root.right.right = new Node(130);

        int[] arr = new int[] { 4, 10, 12, 15, 28, 202 };
        Node root1 = constructBSTFromArray(arr, 0, arr.length - 1);
        inOrderTraversal(root1);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    private static Boolean binarySearch(Node root, int k) {
        if (root == null)
            return false;

        if (root.data == k)
            return true;

        if (root.data < k)
            return binarySearch(root.right, k);

        return binarySearch(root.left, k);

    }

    private static List<Integer> findMinMax(Node root) {
        if (root == null)
            return null;
        List<Integer> li = new ArrayList<Integer>();
        Node temp = root;
        while (temp.left != null) {
            temp = temp.left;
        }
        li.add(temp.data);
        temp = root;
        while (temp.right != null) {
            temp = temp.right;
        }
        li.add(temp.data);
        return li;
    }

    private static Node insertionInBST(Node root, int x) {
        if (root == null) {
            Node temp = new Node(x);
            return temp;
        }
        if (root.data == x) {
            return root;
        }

        if (root.data > x) {
            root.left = insertionInBST(root.left, x);
        } else {
            root.right = insertionInBST(root.right, x);
        }
        return root;
    }

    private static Node deletionInBST(Node root, int x) {
        if (root == null)
            return root;

        if (root.data == x) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left != null && root.right != null) {
                Node temp = util(root.left);
                root.data = temp.data;
                root.left = deletionInBST(root.left, temp.data);
                return null;
            }
            if (root.left != null) {
                return root.left;
            }
            if (root.right != null) {
                return root.right;
            }
        }

        if (root.data > x) {
            root.left = deletionInBST(root.left, x);
        }
        if (root.data < x) {
            root.right = deletionInBST(root.right, x);
        }

        return root;
    }

    private static Node util(Node root) {
        Node current = root;
        // Loop down to find the rightmost leaf
        while (current.right != null) {
            current = current.right;
        }
        return current;
    }

    private static void binaryTreeToBST(Node root) {
        // Use inorder traversal
        // Collect data from all nodes
        // Sort the data

        List<Integer> li = new ArrayList<>();
        int[] i = new int[] { 0 };
        retrieve(root, li);
        Collections.sort(li);
        change(root, li, i);
        inOrderTraversal(root);
    }

    private static void change(Node root, List<Integer> li, int[] i) {
        if (root == null)
            return;
        change(root.left, li, i);
        root.data = li.get(i[0]);
        i[0]++;
        change(root.right, li, i);
    }

    private static void retrieve(Node root, List<Integer> li) {
        if (root == null)
            return;
        retrieve(root.left, li);
        li.add(root.data);
        retrieve(root.right, li);
    }

    private static Boolean checkIfBST(Node root) {
        List<Integer> li = new ArrayList<>();
        inorderTraversalWithList(root, li);
        int j = 0;
        while (j < li.size() - 1) {
            if (li.get(j) > li.get(j + 1)) {
                return false;
            }
            j++;
        }
        return true;

    }

    private static void inorderTraversalWithList(Node root, List<Integer> li) {
        if (root == null)
            return;

        inorderTraversalWithList(root.left, li);
        li.add(root.data);
        inorderTraversalWithList(root.right, li);
    }

    private static Node constructBSTFromArray(int[] arr, int l, int r) {
        if (l > r)
            return null;

        int mid = (l + r) / 2;
        Node root = new Node(arr[mid]);
        root.left = constructBSTFromArray(arr, l, mid - 1);
        root.right = constructBSTFromArray(arr, mid + 1, r);
        return root;

    }

}
