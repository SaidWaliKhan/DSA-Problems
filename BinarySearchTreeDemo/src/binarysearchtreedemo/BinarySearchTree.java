package binarysearchtreedemo;

public class BinarySearchTree
{

    class Node
    {

        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            Node left = null;
            Node right = null;
        }
    }

    Node root;

//    public void insertRoot(int value){
//        if(root == null){
//            root = new Node(value);
//            
//        }else{
//            System.out.println("Already shty");
//        }
//    }
//    public void insert(int value)
//    {
//        root = insert(root, value);
//    }
//    
//    public void traverse(){
//        preOrder(root);
//    }
//    
//    public void delete(int k){
//        deleteNode(root,k);
//    }
    
    
    
    
    public void insert(int value){
        root = insertRec(root ,value);
    }
    
    
    private Node insertRec(Node root, int value)
    {
        if (root == null)
        {
            root = new Node(value);
            return root;
        }

        if (value < root.data)
        {
            root.left = insertRec(root.left, value);
        }

        if (value > root.data)
        {
            root.right = insertRec(root.right, value);
        }

        return root;
    }
    
    
    public Node search(int key){
        return  searchRec(root, key);
    }

    private Node searchRec(Node root, int key)
    {

        if (root == null || root.data == key)
        {
            return root;

        } else if (key < root.data)
        {
            root.left = searchRec(root.left, key);

        } else if (key > root.data)
        {
            root.right = searchRec(root.right, key);
        }
        return root;
    }

    
    public void inOrder(){
        inOrderRec(root);
    }
    private void inOrderRec(Node root)
    {
        if (root == null)
        {
            return;
        } else
        {
            inOrderRec(root.left);
            System.out.print(root.data + " ");
            inOrderRec(root.right);
        }
    }

    public void preOrder(){
        preOrderRec(root);
    }
    private void preOrderRec(Node root)
    {
        if (root == null)
        {
            return;
        } else
        {
            System.out.print(root.data + " ");
            preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
    
    
    public void postOrder(){
        postOrderRec(root);
    }
    
        private void postOrderRec(Node root)
    {
        if (root == null)
        {
            return;
        } else
        {
            postOrderRec(root.left);
            postOrderRec(root.right);
            System.out.print(root.data + " ");

        }
    }

        
  
        
        
    private Node deleteNode(Node root, int key)
    {
        if (root == null)
        {
            return null;
            
        } else if (root.data > key)
        {
            root.left = deleteNode(root.left, key);
            
        } else if (root.data < key)
        {
            root.right = deleteNode(root.right, key);
            
        } 
        else
        {
            if (root.left == null)
            {
                return root.right;
            } else if (root.right == null)
            {
                return root.left;
            }

            root.data = minVal(root.right);

            root.right = deleteNode(root.right, root.data);

        }
        return root;
    }

    
    private int minVal(Node root)
    {
        int nu = root.data;
        while (root.left != null)
        {
            root = root.left;
           nu = root.data;

        }
        return nu;
    }

    public static void main(String[] args)
    {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insert(34);
        bt.insert(20);
        bt.insert(25);
                bt.insert(43);
        bt.insert(54);
        bt.insert(12);
        bt.preOrder();

         
        
        
    }

}
