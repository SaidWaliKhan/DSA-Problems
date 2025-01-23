
package binarytreedemo;




//public class BinaryTree<T>
//{
//
//    class Node
//    {
//
//        T data;
//        Node left;
//        Node right;
//
//        Node(T data)
//        {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//
//    Node root;
//
//    public void insertRoot(T value)
//    {
//        if (root == null)
//        {
//            root = new Node(value);
//            System.out.println("Added root: " + value);
//        } else
//        {
//            System.out.println("Root already present");
//        }
//    }
//
//    public void insertLeft(T parentKey, T value)
//    {
//        Node parent = search(root, parentKey);
//        if (parent == null)
//        {
//            System.out.println("Parent not found");
//        } else if (parent.left != null)
//        {
//            System.out.println("Left node already present");
//        } else
//        {
//            parent.left = new Node(value);
//            System.out.println("Added left child: " + value + " to parent: " + parentKey);
//        }
//    }
//
//    public void insertRight(T key, T value)
//    {
//        Node parent = search(root, key);
//        if (parent == null)
//        {
//            System.out.println("Parent not found");
//        } else if (parent.right != null)
//        {
//            System.out.println("Right node already present");
//        } else
//        {
//            parent.right = new Node(value);
//            System.out.println("Added right child: " + value + " to parent: " + key);
//        }
//    }
//
//    public Node search(Node node, T key)
//    {
//        if (node == null)
//        {
//            return null;
//        }
//        if (node.data.equals(key))
//        {
//            return node;
//        }
//        Node leftResult = search(node.left, key);
//        if (leftResult != null)
//        {
//            return leftResult;
//        }
//        return search(node.right, key);
//    }
//    
//
//    public void preOrder(Node node)
//    {
//        if (node == null)
//        {
//            return;
//        }
//        System.out.print(node.data + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//    }
//
//    public void inOrder(Node node)
//    {
//        if (node == null)
//        {
//            return;
//        }
//        inOrder(node.left);
//        System.out.print(node.data + " ");
//        inOrder(node.right);
//    }
//
//    public void postOrder(Node node)
//    {
//        if (node == null)
//        {
//            return;
//        }
//        postOrder(node.left);
//        postOrder(node.right);
//        System.out.print(node.data + " ");
//    }
//}


//public class BinaryTree<T> {
//
//    Node rootNode;
//
//    public void insertRoot(T data) {
//        if (rootNode == null) {
//            Node newNode = new Node(data);
//            rootNode = newNode;
//            return;
//        }
//        System.out.println("Root already have filled");
//    }
//
//    public void insertLeft(T data, T parent) {
//        if (rootNode == null) {
//            System.out.println("Root is Not filled Yet");
//            return;
//        }
//        Node parentNode = search(rootNode, parent);
//
//        if (parentNode == null) {
//            System.out.println("Parent Node not founded");
//            return;
//        }
//
//        if (parentNode.left != null) {
//            System.out.println("left already Filled");
//            return;
//        }
//        Node newNode = new Node(data);
//        parentNode.left = newNode;
//    }
//
//    public void insertRight(T data, T parent) {
//        if (rootNode == null) {
//            System.out.println("Root is Not filled Yet");
//            return;
//        }
//
//        Node parentNode = search(rootNode, parent);
//
//        if (parentNode == null) {
//            System.out.println("Parent Node not founded");
//            return;
//        }
//
//        if (parentNode.right != null) {
//            System.out.println("Right already filled");
//            return;
//        }
//
//        Node newNode = new Node(data);
//        parentNode.right = newNode;
//    }
//
//    public Node search(Node root, T key) {
//        if (root == null) {
//            return null;
//        }
//
//        if (root.data.equals(key)) {
//            return root;
//        }
//        Node leftResult = search(root.left, key);
//        if (leftResult != null) {
//            return leftResult;
//        }
//
//        return search(root.right, key);
//    }
//
//    public void traversal(int option) {
//        if (option == 0) {
//            preOrder(rootNode);
//        } else if (option == 1) {
//            inOrder(rootNode);
//        } else if (option == 2) {
//            postOrder(rootNode);
//        } else {
//            System.out.println("Wrong Option");
//        }
//
//    }
//
//    public void preOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//        System.out.print(root.data + " ");
//        preOrder(root.left);
//        preOrder(root.right);
//    }
//
//    public void inOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//        inOrder(root.left);
//        System.out.print(root.data + " ");
//        inOrder(root.right);
//    }
//
//    public void postOrder(Node root) {
//        if (root == null) {
//            return;
//        }
//        postOrder(root.left);
//        postOrder(root.right);
//        System.out.print(root.data + " ");
//    }
//
//    class Node {
//        T data;
//        Node left;
//        Node right;
//
//        public Node(T data) {
//            this.data = data;
//            this.left = null;
//            this.right = null;
//        }
//    }
//}









public class BinaryTree {

    class Node {
        int data;
        Node left;
        Node right;
        
    }

    Node root;

    public void insertRoot(int value) {
        if (root == null) {
            Node n = new Node();
            n.data = value;
            root = n;
            System.out.println("Root Added");
        } else {
            System.out.println("Root already present");
        }
    }

    public Node search(Node n, int key) {
        if (n == null) {
            return null;
        } else if (n.data == key) {
            return n;
        }
        Node t = search(n.left, key);
        if (t == null) {
            t = search(n.right, key);
        }
        return t;
    }

    public void insertLeft(int parentVal, int val) {
        Node parent = search(root, parentVal);
        if (parent == null) {
            System.out.println("Parent not found");
        } else if (parent.left != null) {
            System.out.println("Node already present");
        } else {
            Node ne = new Node();
            ne.data = val;
            parent.left = ne;
        }
    }

    public void insertRight(int parentVal, int val) {
        Node parent = search(root, parentVal);
        if (parent == null) {
            System.out.println("Parent not found");
        } else if (parent.right != null) {
            System.out.println("Node already present");
        } else {
            Node ne = new Node();
            ne.data = val;  
            parent.right = ne;
        }
    }
    
    public void traversal(){
        preOrder(root);
    }

    public void preOrder(Node n) {
        if (n == null) {
            return;
        }
        System.out.print(n.data + " ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public void postOrder(Node n) {
        if (n == null) {
            return;
        }
        postOrder(n.left);
        postOrder(n.right);
        System.out.print(n.data + " ");
    }

    public void inOrder(Node n) {
        if (n == null) {
            return;
        }
        inOrder(n.left);
        System.out.print(n.data + " ");
        inOrder(n.right);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insertRoot(6);
        bt.insertRoot(4);
        bt.insertLeft(6, 4);
        bt.insertRight(6, 8);
        bt.search(bt.root, 4);
        bt.traversal();

    }
}


