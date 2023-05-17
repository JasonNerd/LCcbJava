package codecarl.P02BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class TranverseR {
    // 递归的前序遍历
    private void preorder(BinTreeNode root, List<Integer> result){
        if (root == null){
            return ;
        }
        result.add(root.val);
        preorder(root.lch, result);
        preorder(root.rch, result);
    }
    // 递归的中序遍历
    private void inorder(BinTreeNode root, List<Integer> result){
        if (root == null){
            return ;
        }
        inorder(root.lch, result);
        result.add(root.val);
        inorder(root.rch, result);
    }
    // 递归的后序遍历
    private void postorder(BinTreeNode root, List<Integer> result){
        if (root == null){
            return ;
        }
        postorder(root.lch, result);
        postorder(root.rch, result);
        result.add(root.val);
    }

    public List<Integer> tranverse(BinTreeNode root, String method){
        List<Integer> result = new ArrayList<>();
        if(method.equals("pre")){
            preorder(root, result);
        }else if(method.equals("in")){
            inorder(root, result);
        }else if(method.equals("post"))
            postorder(root, result);
        return result;
    }
}
