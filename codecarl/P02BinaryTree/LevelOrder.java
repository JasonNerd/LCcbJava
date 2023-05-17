package codecarl.P02BinaryTree;
import java.util.*;

public class LevelOrder{
    public List<List<Integer>> resList = new ArrayList<List<Integer>>();
    // 层序遍历
    
    // DFS--递归方式, 使用 index 记录层数
    public void dfsLevelOrder(BinTreeNode root, int layer){
        if(root == null)
            return ;
        if(resList.size() <= layer){
            List<Integer> item = new ArrayList<>();
            resList.add(item);
        }
        resList.get(layer).add(root.val);
        dfsLevelOrder(root.lch, layer+1);
        dfsLevelOrder(root.rch, layer+1);
    }

    // BFS--借助队列实现
    public void bfsLevelOrder(BinTreeNode root, int layer){
        Queue<BinTreeNode> workQueue = new LinkedList<>();
        if (root != null) workQueue.add(root);
        while(!workQueue.isEmpty()){
            List<Integer> itemList = new ArrayList<>();
            int len = workQueue.size();
            while(len>0){
                BinTreeNode btn = workQueue.poll();
                itemList.add(btn.val);
                if (btn.lch != null) workQueue.add(btn.lch);
                if (btn.rch != null) workQueue.add(btn.rch);
                len--;
            }
            resList.add(itemList);
        }
    }
}