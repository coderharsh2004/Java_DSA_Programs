public class prog2{
    Node root;
    static class Node{
        int data;
        Node left,right;
        public Node(int data) {
            this.data = data;
            this.left=this.right=null;
        }
    }
    public prog2() {
        this.root = root;
    }
    public Node insertData(Node root,int data){
        if(root==null)root=new Node(data);
        else if(data<root.data)root.left=insertData(root.left,data);
        else if(data>root.data)root.right=insertData(root.right,data);
        return root;
    }
    public void insert(int data){
        root=insertData(root,data);
    }
    //Height of the BST/Maximum Path of the BST
    public int getHeight(Node root){
        if(root==null)
            return 0;
        int lh=getHeight(root.left);
        int rh=getHeight(root.right);
        return (Math.max(lh,rh)+1);
    }
    //Inorder Traversal LDR(left -Data-Right)
    public void displayAS(Node root){
        if(root!=null){
            displayAS(root.left);
            System.out.print(root.data+" ");
            displayAS(root.right);
        }
    }
    // Display in Descending order(Right-Data-Left)
    public void displaydescending(Node root){
        if(root!=null){
            displaydescending(root.right);
            System.out.print(root.data+" ");
            displaydescending(root.left);
        }
    }
    //Search for an Element in a BST.
    public boolean searchKey(Node root, int key) {
        if (root == null)
            return false; // Return false if root is null
        if (root.data == key)
            return true;  // Return true if the key is found
        if (key > root.data)
            return searchKey(root.right, key);  // Search in the right subtree
        else
            return searchKey(root.left, key);   // Search in the left subtree
    }
    //Finding Maximum Element in a BST
    public int findMax(Node root){
        Node temp=root;int max= root.data;
        while(temp.right!=null){
            temp=temp.right;
            max=temp.data;
        }
        return max;
    }
    //Finding Minimum Element in a BST
    public int findMin(Node root){
        Node temp=root;int min=root.data;
        while(temp.left!=null){
            temp=temp.left;
            min=temp.data;
        }
        return min;
    }
    //Deletion in a BST.
    public Node deleteKey(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.data) {
            root.left = deleteKey(root.left, key);
        } else if (key > root.data) {
            root.right = deleteKey(root.right, key);
        } else {
            //Element is Found
            //1.The Node which is being deleted has 1 child or nochild(leaf node).
            //2.THe Node which is being deleted has 2 children.
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            root.data = findMax(root.left);
            root.left = deleteKey(root.left, root.data);
        }
        return root;
    }

    public static void main(String args[]){
        prog2 ob=new prog2();
        ob.insert(50);
        ob.insert(30);
        ob.insert(60);
        ob.insert(10);
        ob.insert(20);
        ob.insert(70);
        ob.insert(40);
        ob.insert(80);
        System.out.println();
        ob.displayAS(ob.root);
        System.out.println();
        ob.displaydescending(ob.root);
        System.out.println();
        System.out.println(ob.getHeight(ob.root));
        System.out.println(ob.searchKey(ob.root,60));
        System.out.println("Maximum Element in a BST="+ob.findMax(ob.root));
        System.out.println("Minimum Element in a BST="+ob.findMin(ob.root));
        ob.displayAS(ob.deleteKey(ob.root,60));
    }
}