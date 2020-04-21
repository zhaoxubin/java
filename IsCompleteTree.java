package java20200421;

import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int value = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int value) {
        this.value = value;
    }
}
//解决思路主要是依靠层序遍历
//将整个遍历过程分为两个阶段  注：入队列只在第一阶段，如果进入第二阶段不再入队列，直接对队列中节点挨个判定
//第一阶段分为四个判定：有左有有-》左右子树入队列  ；有左无右-》左子树入队列；有右无左-》直接认为不满足；无左无右-》直接进入第二阶段
//第二阶段判断第一阶段入队列的元素是否有左右子树，如果有即不满足
public class IsCompleteTree {
    public static boolean isCompleteTree(TreeNode root){
        if(root == null){  //如果是空树就之直接返回true，认为是完全二叉树
            return true;
        }
        boolean isSecondStep = false;  //定义一个进入阶段的标志
        Queue<TreeNode> queue = new LinkedList<>(); //创建一个队列
        queue.offer(root); //将根节点入队列
        while(!queue.isEmpty()){  //当队列不为空就一直层序遍历数组
            TreeNode cur = queue.poll();//取出队首元素
            if(!isSecondStep){  //在第一阶段的条件下进行层序遍历
                if(cur.left != null && cur.right != null){ //如果该节点左右子树都不为空，将左右子树入队列
                    queue.offer(cur.left);
                    queue.offer(cur.right);
                } else if(cur.left == null && cur.right != null){ //如果该节点的左子树为空，右子树不为空，就一定不是完全二叉树
                    return false;
                } else if(cur.left != null && cur.right == null){ //如果该节点的左子树不为空，右子树为空，就进入第二阶段进行判定
                    isSecondStep = true;  //设置为第二阶段，即第一阶段结束，后面层序遍历根据的二阶段的条件进行判定
                    queue.offer(cur.left);//再将左子树入队列
                }else {
                    isSecondStep = true;  //如果左右子树都为空，就进入直接第二阶段
                }
            }else {
                if(cur.left != null || cur.right != null){ //在第二阶段中只要节点有左子树或者右子树即为不满足完全二叉树
                    return false;
                }
            }
        }
        //整个树都遍历完了，也没找到反例，就认为是完全二叉树
        return true;
    }
}
