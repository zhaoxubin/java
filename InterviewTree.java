import java.util.ArrayList;
import java.util.List;

class TreeNode{
     public int val;
     TreeNode left;
     TreeNode right;
     public TreeNode(int val) {
         this.val = val;
     }
 }
public class InterviewTree {
     public List<Integer> preorderTraversal(TreeNode root){  //用链表保存树的前序遍历结果
         List<Integer> result = new ArrayList<>();
         if(root == null){   //如果是空树就返回链表
             return result;
         }
         result.add(root.val); //将根节点放入链表
         result.addAll(preorderTraversal(root.left)); //递归遍历左子树的元素放入List
         result.addAll(preorderTraversal(root.right));//递归遍历右子树的元素放入List
         return result;
     }
}