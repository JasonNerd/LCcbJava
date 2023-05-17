package codecarl.P02BinaryTree;

public class BinTreeNode {
    int val;                // 节点权重
    BinTreeNode lch, rch;   // 左孩子 lch, 右孩子 rch
    BinTreeNode(){}         // 构造器 1
    BinTreeNode(int val){this.val = val;}   // 构造器2
    BinTreeNode(int val, BinTreeNode lch, BinTreeNode rch){ // 构造器3
        this.val = val;
        this.lch = lch;
        this.rch = rch;
    }
}
