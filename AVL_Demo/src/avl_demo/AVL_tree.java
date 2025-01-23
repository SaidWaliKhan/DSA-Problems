/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avl_demo;


    
//    public class AVL_tree {
//    Node rootNode;
//
//    public void insert(int data) {
//        rootNode = insert(data, rootNode);
//    }
//
//    private Node insert(int data, Node node) {
//        if (node == null) {
//            return new Node(data);
//        }
//        if (data < node.data) {
//            node.left = insert(data, node.left);
//        } else {
//            node.right = insert(data, node.right);
//        }
//
//        return balance(node);
//    }
//
//    public void traversal() {
//        preOrder(rootNode);
//    }
//
//    private void preOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//        System.out.print(node.data + " ");
//        inOrder(node.left);
//        inOrder(node.right);
//
//    }
//
//    private void inOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//        inOrder(node.left);
//        System.out.print(node.data + " ");
//        inOrder(node.right);
//    }
//
//    private Node balance(Node node) {
//        if (isBalance(node))
//            return node;
//        if (balanceFactor(node) > 1) {
//            if (balanceFactor(node) > 0) {
//                return rotateRight(node);
//            }
//            node.left = rotateLeft(node.left);
//            return rotateRight(node);
//        } else {
//            if (balanceFactor(node) < 0) {
//                return rotateLeft(node);
//            }
//            node.right = rotateRight(node.right);
//            return rotateLeft(node);
//        }
//    }
//
//    private boolean isBalance(Node node) {
//        return Math.abs(balanceFactor(node)) < 2;
//    }
//
//    private Node rotateLeft(Node node) {
//        Node rChild = node.right;
//        node.right = rChild.left;
//        rChild.left = node;
//        return rChild;
//    }
//
//    private Node rotateRight(Node node) {
//        Node lChild = node.left;
//        node.left = lChild.right;
//        lChild.right = node;
//        return lChild;
//    }
//
//    private int balanceFactor(Node node) {
//        return height(node.left) - height(node.right);
//    }
//
//    private int height(Node node) {
//        if (node == null) {
//            return -1;
//        }
//        return Math.max(height(node.right), height(node.left)) + 1;
//    }
//
//    private class Node {
//        int data;
//        Node left;
//        Node right;
//
//        public Node(int data) {
//            this.data = data;
//        }
//
//    }
//}







public class AVL_tree {
  private class Node {
    int data;
    Node left;
    Node right;
    int height;

    Node(int data) {
      this.data = data;
      this.height = 1;
    }

  }

  Node root;

  public void insert(int value) {
    root = insert(root, value);
  }

  public void delete(int key) {
    root = delete(root, key);
  }

  public boolean search(int k) {
    Node t = search(root, k);
    if (t != null) {
      return true;
    }
    return false;
  }

  public void traversal() {
    preOrder(root);
  }

  private Node insert(Node n, int value) {
    if (n == null) {
      return new Node(value);
    } else if (n.data > value) {
      n.left = insert(n.left, value);
    } else if (n.data < value) {
      n.right = insert(n.right, value);
    } 
    // Update height of the ancestor node
    n.height = 1 + Math.max(height(n.left), height(n.right));
    // Balance the node
    return balance(n);
  }
  
  private Node balance(Node n) {
    int balance = balanceFactor(n);
    // Left Left Case
    if (balance > 1 && balanceFactor(n.left) >= 0) {
      return rotateRight(n);
    }
    // Left Right Case
    if (balance > 1 && balanceFactor(n.left) < 0) {
      n.left = rotateLeft(n.left);
      return rotateRight(n);
    }
    // Right Right Case
    if (balance < -1 && balanceFactor(n.right) <= 0) {
      return rotateLeft(n);
    }
    // Right Left Case
    if (balance < -1 && balanceFactor(n.right) > 0) {
      n.right = rotateRight(n.right);
      return rotateLeft(n);
    }
    return n; // No rotation needed
  }


  private Node rotateRight(Node n) {
    Node t = n.left;
    Node t2 = t.right;

    t.right = n;
    n.left = t2;

    n.height = Math.max(height(n.left), height(n.right));
    t.height = Math.max(height(t.left), height(t.right));
    return t;
  }

  private Node rotateLeft(Node n) {
    Node t = n.right;
    Node t2 = t.left;

    t.left = n;
    n.right = t2;

    n.height = Math.max(height(n.left), height(n.right));
    t.height = Math.max(height(t.left), height(t.right));
    return t;
  }

  private int height(Node n) {
    if (n == null) {
      return -1;
    }
    return 1 + Math.max(height(n.left), height(n.right));
  }

  private int balanceFactor(Node n) {
    return height(n.left) - height(n.right);
  }

  private Node delete(Node n, int key) {
    if (n == null) {
      return n;
    } else if (n.data > key) {
      n.left = delete(n.left, key);
    } else if (n.data < key) {
      n.right = delete(n.right, key);
    } else {
      if (n.left == null) {
        return n.right;
      } else if (n.right == null) {
        return n.left;
      } else {
        n.data = minValue(n.right);
        n.right = delete(n.right, n.data);
      }
    }
    n.height = 1 + Math.max(height(n.left), height(n.right));

    return n;
  }

  private int minValue(Node n) {
    int number = n.data;
    while (n.left != null) {
      number = n.left.data;
      n = n.left;
    }
    return number;
  }

  private Node search(Node n, int key) {
    if (n == null) {
      return n;
    } else if (n.data == key) {
      return n;
    } else if (n.data > key) {
      return search(n.left, key);
    }
    return search(n.right, key);

  }

  private void preOrder(Node n) {
    if (n == null)
      return;
    System.out.print(n.data + " ");
    preOrder(n.left);
    preOrder(n.right);
  }
}

