class Node{  //写一个节点类
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
 public class TestTree {
     public static Node buildTree() {   //构造出一棵树
         Node a = new Node('A');   //创建树的结点
         Node b = new Node('B');
         Node c = new Node('C');
         Node d = new Node('D');
         Node e = new Node('E');
         Node f = new Node('F');
         Node g = new Node('G');
         Node h = new Node('H');
         a.left = b;      //把各个结点按照树的结构链接起来
         a.right = c;
         b.left = d;
         b.right = e;
         e.left = g;
         g.right = h;
         c.right = f;
         return a;  //返回树的根节点
     }
     public static int size(Node root){
         if(root == null){
             return 0;
         }
         return 1 + size(root.left) + size(root.right);
     }

     public static void main(String[] args) {
         Node tree = buildTree();
         System.out.println(size(tree));
     }
 }
