import java.util.Scanner;

class TreeNode{
    public char val;
    TreeNode left;
    TreeNode right;

    public TreeNode(char val) {
        this.val = val;
    }
}
public class BuildTreeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.next();
            TreeNode root = build(str); //写一个方法根据输入先构建一棵树
            inOrder(root); //前序遍历这颗树
            System.out.println();
        }
    }
    private static int index = 0;
    private static TreeNode build(String str){
        index = 0;//使用一个变量来记录一下
        //index 是为了后面递归过程中能知道访问到哪个节点了
        //通过下面的方法辅助完成
        return creatTreePreOrder(str);
    }
    private static TreeNode creatTreePreOrder(String str) {
        char cur = str.charAt(index);
        if (cur == '#') {
            return null;
        }
        TreeNode root = new TreeNode(cur); //当前字符不是'#'就创建一个新的结点
        index++;  //准备处理下一个节点, 下一个结点开始就是root的左子树的先序遍历结点
        root.left = creatTreePreOrder(str);
        index++; //准备处理下一个节点, 下一个结点开始就是root的右子树的先序遍历结点
        root.right = creatTreePreOrder(str);
        return root;
    }
    private  static  void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + "  ");
        inOrder(root.right);
    }
}