package codecarl.P02BinaryTree;

import java.util.*;

public class TranverseI {
    // 前序遍历顺序：中-左-右，入栈顺序：中-右-左
    private void preorder(BinTreeNode root, List<Integer> result) {
        if (root == null)
            return;
        Stack<BinTreeNode> workStack = new Stack<>();
        workStack.push(root);
        while (!workStack.empty()) {
            BinTreeNode btn = workStack.pop();
            result.add(btn.val);
            if (btn.rch != null)
                workStack.push(btn.rch);
            if (btn.lch != null)
                workStack.push(btn.lch);
        }
    }

    // 中序遍历顺序: 左-中-右 入栈顺序： 左-右
    private void inorder(BinTreeNode root, List<Integer> result) {
        if (root == null)
            return;
        Stack<BinTreeNode> workStack = new Stack<>();
        BinTreeNode pBtn = root; // 工作指针
        while (pBtn != null || !workStack.empty()) {
            if (pBtn != null) {
                workStack.push(pBtn); // 根节点入栈(随后访问)
                pBtn = pBtn.lch; // 查看是否有左孩子
            } else {
                pBtn = workStack.pop(); // 说明栈顶元素无左孩子, 可以访问栈顶
                result.add(pBtn.val);
                pBtn = pBtn.rch; // 再访问右孩子
            }
        }
    }

    // 非递归的后序遍历: 修改前序遍历入栈顺序, 入栈顺序：中-左-右, 出栈顺序：中-右-左, 最后翻转结果
    private void postorder(BinTreeNode root, List<Integer> result) {
        if (root == null)
            return;
        Stack<BinTreeNode> workStack = new Stack<>();
        workStack.push(root);
        while (!workStack.empty()) {
            BinTreeNode btn = workStack.pop();
            result.add(btn.val);
            if (btn.lch != null)
                workStack.push(btn.lch);
            if (btn.rch != null)
                workStack.push(btn.rch);
        }
        Collections.reverse(result);
    }
    
    public List<Integer> tranverse(BinTreeNode root, String method) {
        List<Integer> result = new ArrayList<>();
        if (method.equals("pre")) {
            preorder(root, result);
        } else if (method.equals("in")) {
            inorder(root, result);
        } else if (method.equals("post"))
            postorder(root, result);
        return result;
    }
}

class Solution {
    public List<Integer> preorderTraversal(BinTreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<BinTreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (!st.empty()) {
            BinTreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.rch != null)
                    st.push(node.rch); // 添加右节点（空节点不入栈）
                if (node.lch != null)
                    st.push(node.lch); // 添加左节点（空节点不入栈）
                st.push(node); // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop(); // 将空节点弹出
                node = st.peek(); // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }

    public List<Integer> inorderTraversal(BinTreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<BinTreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (!st.empty()) {
            BinTreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                if (node.rch != null)
                    st.push(node.rch); // 添加右节点（空节点不入栈）
                st.push(node); // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。

                if (node.lch != null)
                    st.push(node.lch); // 添加左节点（空节点不入栈）
            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop(); // 将空节点弹出
                node = st.peek(); // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }

    public List<Integer> postorderTraversal(BinTreeNode root) {
        List<Integer> result = new LinkedList<>();
        Stack<BinTreeNode> st = new Stack<>();
        if (root != null)
            st.push(root);
        while (!st.empty()) {
            BinTreeNode node = st.peek();
            if (node != null) {
                st.pop(); // 将该节点弹出，避免重复操作，下面再将右中左节点添加到栈中
                st.push(node); // 添加中节点
                st.push(null); // 中节点访问过，但是还没有处理，加入空节点做为标记。
                if (node.rch != null)
                    st.push(node.rch); // 添加右节点（空节点不入栈）
                if (node.lch != null)
                    st.push(node.lch); // 添加左节点（空节点不入栈）

            } else { // 只有遇到空节点的时候，才将下一个节点放进结果集
                st.pop(); // 将空节点弹出
                node = st.peek(); // 重新取出栈中元素
                st.pop();
                result.add(node.val); // 加入到结果集
            }
        }
        return result;
    }
}
