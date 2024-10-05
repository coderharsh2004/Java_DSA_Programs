public class prog1 {
    Node root;
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }
    prog1(){
        this.root = null;
    }
    public Node insertData(Node root, int data) {
        if(root==null)
            root=new Node(data);
        if(data<root.data)
            root.left=insertData(root.left,data);
        if(data>root.data)
            root.right=insertData(root.right,data);
        return root;
    }
    public void insert(int data){
        root=insertData(root,data);
    }
    public int getHeight(Node root){
        if(root==null)
            return 0;
        int leftHeight=getHeight(root.left);
        int rightHeight=getHeight(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }
    public void display(Node root) {
        if(root!=null) {
            display(root.left);
            System.out.println(root.data);
            display(root.right);
        }
    }
    public static void main(String[] args) {
        prog1 obj=new prog1();
        obj.insert(10);
        obj.insert(40);
        obj.insert(60);
        obj.insert(50);
        obj.insert(70);
        obj.insert(30);
        obj.insert(20);
        obj.display(obj.root);
        System.out.println(obj.getHeight(obj.root));
    }
}