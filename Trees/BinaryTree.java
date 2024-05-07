package Trees;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

import javax.swing.tree.TreeNode;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }

}

class QueueNode {
    Node node;
    int horizontalDistance;

    public QueueNode(Node node, int horizontalDistance) {
        this.node = node;
        this.horizontalDistance = horizontalDistance;
    }
}

public class BinaryTree {
    static Node prev = null;

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.left = new Node(7);
        root.right.right = new Node(8);
        root.left.right.left = new Node(6);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);
        root.right.right.right.right = new Node(11);

        Node root1 = new Node(22);
        root1.left = new Node(6);
        root1.left.left = new Node(4);
        root1.left.right = new Node(2);
        root1.right = new Node(5);
        root1.right.left = new Node(1);
        root1.right.right = new Node(4);
        Node head = binaryTreeToDLL(root);
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.right;
        }
        System.out.println();

    }

    private static Node binaryTreeToDLL(Node root) {

        if (root == null)
            return null;

        Node head = binaryTreeToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            prev.right = root;
            root.left = prev;
        }
        prev = root;

        binaryTreeToDLL(root.right);

        while (root.right != null)
            root = root.right;
        root.right = null;

        return head;

    }

    private static Node lowestCommonAncestor(Node root, int a, int b) {
        if (root == null)
            return null;

        if (root.data == a || root.data == b)
            return root;

        Node l = lowestCommonAncestor(root.left, a, b);
        Node r = lowestCommonAncestor(root.right, a, b);

        if (l != null && r != null)
            return root;

        if (l != null)
            return l;
        if (r != null)
            return r;

        return null;
    }

    private static Boolean SumTree(Node root) {
        Boolean[] flag = new Boolean[] { true };
        sumTree(root, flag);
        return flag[0];
    }

    private static int sumTree(Node root, Boolean[] flag) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return root.data;

        int lsum = sumTree(root.left, flag);
        int rsum = sumTree(root.right, flag);

        if (root.data != lsum + rsum) {
            flag[0] = false;
        }
        return root.data + lsum + rsum;
    }

    private static Node invertBinaryTree(Node root) {
        if (root == null)
            return null;
        invert(root);
        return root;
    }

    private static void invert(Node root) {
        if (root == null) {
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        invert(root.left);
        invert(root.right);
    }

    private static Boolean symmetric(Node root) {
        if (root == null)
            return true;

        return mirror(root.left, root.right);
    }

    private static Boolean mirror(Node root, Node root1) {
        if (root == null && root1 == null)
            return true;

        if (root == null || root1 == null)
            return false;

        if (root.data != root1.data)
            return false;

        return mirror(root.left, root1.right) && mirror(root.right, root1.left);
    }

    private static Boolean identical(Node root, Node root1) {
        if (root == null && root1 == null)
            return true;
        if (root == null || root1 == null)
            return false;
        if (root.data != root1.data)
            return false;
        return identical(root.left, root1.left) && identical(root.right, root1.right);
    }

    private static Integer rootToLeafMaxPathSum(Node root, Integer curr_sum) {
        if (root == null)
            return 0;
        curr_sum += root.data;

        if (root.right == null && root.left == null) {
            return curr_sum;
        }
        int leftsum = rootToLeafMaxPathSum(root.left, curr_sum);
        int rightsum = rootToLeafMaxPathSum(root.right, curr_sum);

        return Math.max(leftsum, rightsum);

    }

    private static Boolean rootToLeafPathSum(Node root, Integer curr_sum, Integer sum, Boolean isFound) {
        if (root == null)
            return isFound;

        curr_sum += root.data;
        if (root.right == null && root.left == null && curr_sum == sum) {
            isFound = true;
        }
        Boolean leftFound = rootToLeafPathSum(root.left, curr_sum, sum, isFound);
        Boolean rightFound = rootToLeafPathSum(root.right, curr_sum, sum, isFound);

        return leftFound || rightFound;
    }

    private static void rootToLeafPath(Node root) {
        List<Integer> currPath = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        pathsUtil(root, currPath, res);
        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    private static void pathsUtil(Node root, List<Integer> currPath, List<List<Integer>> res) {
        if (root == null)
            return;
        currPath.add(root.data);
        if (root.left == null && root.right == null)
            res.add(new ArrayList<>(currPath));

        pathsUtil(root.left, new ArrayList<>(currPath), res);
        pathsUtil(root.right, new ArrayList<>(currPath), res);
        return;
    }

    private static void boundaryTraversal(Node root) {
        // Call three different functions which will bring you left boundary/ leaf
        // nodes/ right boundary
        if (root == null)
            return;
        List<Integer> res = new ArrayList<>();
        res.add(root.data);
        if (root.left == null && root.right == null) {
            System.out.println(res.get(0));
            return;
        }
        leftBoundary(root.left, res);
        leafNodes(root, res);
        rightBoundary(root.right, res);

        for (int i = 0; i < res.size(); i++) {
            System.out.println(res.get(i));
        }
    }

    private static void leafNodes(Node root, List<Integer> res) {
        if (root == null)
            return;
        leafNodes(root.left, res);
        if (root.left == null && root.right == null) {
            res.add(root.data);
        }
        leafNodes(root.right, res);
    }

    private static void rightBoundary(Node root, List<Integer> res) {
        if (root == null)
            return;
        if (root.right != null)
            rightBoundary(root.right, res);
        else if (root.left != null)
            rightBoundary(root.left, res);

        if (root.left != null || root.right != null) {
            res.add(root.data);
        }
    }

    private static void leftBoundary(Node root, List<Integer> res) {
        if (root == null)
            return;

        if (root.left != null || root.right != null) {
            res.add(root.data);
        }
        if (root.left != null)
            leftBoundary(root.left, res);
        else if (root.right != null)
            leftBoundary(root.right, res);

    }

    private static void bottomViewOfBinaryTree(Node root) {
        if (root == null)
            return;
        Queue<QueueNode> q = new LinkedList<>();
        Map<Integer, Integer> m = new TreeMap<>();

        q.offer(new QueueNode(root, 0));
        while (!q.isEmpty()) {
            QueueNode temp = q.poll();
            Node t = temp.node;
            int hd = temp.horizontalDistance;

            m.put(hd, t.data);

            if (t.left != null)
                q.offer(new QueueNode(t.left, hd - 1));
            if (t.right != null)
                q.offer(new QueueNode(t.right, hd + 1));
        }

        // Print the top view
        for (int value : m.values()) {
            System.out.print(value + " ");
        }

    }

    private static void topViewOfBinaryTree(Node root) {
        if (root == null)
            return;
        Queue<QueueNode> q = new LinkedList<>();
        Map<Integer, Integer> m = new TreeMap<>();

        q.offer(new QueueNode(root, 0));
        while (!q.isEmpty()) {
            QueueNode temp = q.poll();
            Node t = temp.node;
            int hd = temp.horizontalDistance;

            if (!m.containsKey(hd)) {
                m.put(hd, t.data);
            }

            if (t.left != null)
                q.offer(new QueueNode(t.left, hd - 1));
            if (t.right != null)
                q.offer(new QueueNode(t.right, hd + 1));
        }

        // Print the top view
        for (int value : m.values()) {
            System.out.print(value + " ");
        }

    }

    private static void rightViewOfBinaryTree(Node root) {

        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        Boolean isFirst = true;

        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                if (!q.isEmpty()) {
                    isFirst = true;
                    q.offer(null);
                } else {
                    return;
                }
            } else {
                if (isFirst) {
                    System.out.println(temp.data);
                    isFirst = false;
                }
                if (temp.right != null)
                    q.offer(temp.right);
                if (temp.left != null)
                    q.offer(temp.left);
            }

        }
    }

    private static void leftViewOfBinaryTree(Node root) {

        if (root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        q.offer(null);
        Boolean isFirst = true;

        while (!q.isEmpty()) {
            Node temp = q.poll();
            if (temp == null) {
                if (!q.isEmpty()) {
                    isFirst = true;
                    q.offer(null);
                } else {
                    return;
                }
            } else {
                if (isFirst) {
                    System.out.println(temp.data);
                    isFirst = false;
                }
                if (temp.left != null)
                    q.offer(temp.left);
                if (temp.right != null)
                    q.offer(temp.right);
            }

        }
    }

    private static int diameterOfBinaryTree(Node root, int[] d) {
        if (root == null)
            return 0;

        int lh = diameterOfBinaryTree(root.left, d);
        int rh = diameterOfBinaryTree(root.right, d);
        if (1 + lh + rh > d[0]) {
            d[0] = 1 + lh + rh;
        }

        return 1 + Math.max(lh, rh);
    }

    private static int checkIfBalancedTree(Node root) {
        if (root == null)
            return 0;

        int lh = checkIfBalancedTree(root.left);
        int rh = checkIfBalancedTree(root.right);
        if (Math.abs(lh - rh) > 1)
            return -1;

        return 1 + Math.max(lh, rh);

    }

    private static int height(Node root) {
        if (root == null)
            return 0;
        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh, rh) + 1;
    }

    private static void diagonalTraversal(Node root, Map<Integer, List<Integer>> m, int d) {
        if (root == null)
            return;
        if (m.containsKey(d)) {
            List<Integer> list = m.get(d);
            list.add(root.data);
            m.put(d, list);
        } else {
            List<Integer> li = new ArrayList<>();
            li.add(root.data);
            m.put(d, li);
        }
        diagonalTraversal(root.left, m, d + 1);
        diagonalTraversal(root.right, m, d);
    }

    // Vertical order traversal - possible with Pair Not implementing now
    private static void zigZagTraversal(Node root) {
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();

        s1.push(root);

        while (!s1.isEmpty() || !s2.isEmpty()) {

            while (!s1.isEmpty()) {
                Node temp = s1.pop();
                System.out.println(temp.data);
                if (temp.right != null)
                    s2.push(temp.right);
                if (temp.left != null)
                    s2.push(temp.left);
            }

            while (!s2.isEmpty()) {
                Node temp = s2.pop();
                System.out.println(temp.data);
                if (temp.left != null)
                    s1.push(temp.left);
                if (temp.right != null)
                    s1.push(temp.right);
            }
        }

    }

    private static void levelOrderTraversalLeftToRight(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data);
            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
        }
    }

    private static void levelOrderTraversalRightToLeft(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            System.out.println(temp.data);
            if (temp.right != null)
                q.offer(temp.right);
            if (temp.left != null)
                q.offer(temp.left);
        }
    }

    private static void levelOrderTraversalLeftToRightBottomToTop(Node root) {
        Queue<Node> s = new LinkedList<>();
        Stack<Node> st = new Stack<>();
        List<Integer> li = new ArrayList<>();

        s.offer(root);
        while (!s.isEmpty()) {
            Node temp = s.poll();
            st.push(temp);
            if (temp.right != null)
                s.offer(temp.right);
            if (temp.left != null)
                s.offer(temp.left);
        }
        while (!st.isEmpty()) {
            li.add(st.pop().data);
        }
        int left = 0;
        while (left <= li.size() - 1) {
            System.out.println(li.get(left));
            left++;
        }
    }

    private static void levelOrderTraversalRightToLeftBottomToTop(Node root) {
        Queue<Node> q = new LinkedList<>();
        Stack<Node> s = new Stack<Node>();
        List<Integer> li = new ArrayList<>();

        q.offer(root);
        while (!q.isEmpty()) {
            Node temp = q.poll();
            s.push(temp);
            if (temp.left != null)
                q.offer(temp.left);
            if (temp.right != null)
                q.offer(temp.right);
        }
        while (!s.isEmpty()) {
            li.add(s.pop().data);
        }

        int left = 0;
        while (left <= li.size() - 1) {
            System.out.println(li.get(left));
            left++;
        }
    }

    public static void preOrderTraversal(Node root) {
        if (root == null)
            return;

        System.out.println(root.data);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void inOrderTraversal(Node root) {
        if (root == null)
            return;

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public static void postOrderTraversal(Node root) {
        if (root == null)
            return;

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.println(root.data);
    }

    private static List<Integer> iterativePreorderTraversal(Node root) {
        Stack<Node> s = new Stack<Node>();
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;

        s.push(root);

        while (!s.isEmpty()) {
            root = s.pop();
            result.add(root.data);
            if (root.right != null) {
                s.push(root.right);

            }
            if (root.left != null) {
                s.push(root.left);
            }
        }
        return result;
    }

    private static List<Integer> iterativeInorderTraversal(Node root) {
        Stack<Node> s = new Stack<Node>();
        List<Integer> result = new ArrayList<>();
        Node temp = root;
        while (true) {
            if (temp != null) {
                s.push(temp);
                temp = temp.left;
            } else {
                if (s.isEmpty())
                    break;
                else {
                    temp = s.pop();
                    result.add(temp.data);
                    temp = temp.right;
                }
            }
        }
        return result;

    }

    private static List<Integer> iterativePostorderTraversal(Node root) {
        Stack<Node> s1 = new Stack<Node>();
        Stack<Node> s2 = new Stack<Node>();
        List<Integer> result = new ArrayList<>();

        if (root == null)
            return result;

        s1.push(root);
        while (!s1.isEmpty()) {
            root = s1.pop();
            s2.push(root);
            if (root.left != null)
                s1.push(root.left);
            if (root.right != null)
                s1.push(root.right);
        }

        while (!s2.isEmpty()) {
            result.add(s2.pop().data);
        }
        return result;

    }

    // Need to remember this not intuitive
    // We can appreciate the recursion when you have to implement this
    private static List<Integer> iterativePostOrderTraversalWithOneStack(Node root) {
        Node curr = root;
        Stack<Node> s = new Stack<Node>();
        List<Integer> result = new ArrayList<>();

        while (curr != null || !s.isEmpty()) {
            if (curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                Node temp = s.peek().right;
                if (temp == null) {
                    temp = s.peek();
                    s.pop();
                    result.add(temp.data);
                    while (!s.isEmpty() && temp == s.peek().right) {
                        temp = s.peek();
                        s.pop();
                        result.add(temp.data);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return result;
    }

    // This can be solved by level order traversal as well
    private static int maximumDepthOfBinaryTree(Node root) {
        if (root == null)
            return 0;

        int lh = maximumDepthOfBinaryTree(root.left);
        int rh = maximumDepthOfBinaryTree(root.right);

        return 1 + Math.max(lh, rh);
    }

}
