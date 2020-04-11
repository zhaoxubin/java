class Node{  //写一个节点类
    public char val;
    public Node left;
    public Node right;

    public Node(char val) {
        this.val = val;
    }
}
 public class TestTree2 {
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
   
     public static int leafSize(Node root){
         if (root == null){  //如果为空树就返回0
             return 0;
         }
         if(root.right == null && root.left == null){ //如果当前根节点的左右子树为空即为叶子节点
             return 1;
         }
         return leafSize(root.left) + leafSize(root.right); //递归求树的根结点左右子树的叶子节点
     }
     public static void main(String[] args) {
         Node tree = buildTree();
         System.out.println(leafSize(tree));
     }
 }