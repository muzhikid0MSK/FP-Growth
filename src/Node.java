import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;

public class Node implements Cloneable{
    public int item = 0;   //项
    public int sup = 0;          //支持度
    public int supInCFP ;       //在条件FP树中的支持度
    public Node nextSimilar; //下一个相似项
    public Hashtable<Integer,Node> children;
    public Node father;
    public Node(int item,int sup){
        this.item = item;
        this.sup = sup;
        children = new Hashtable<>();
        nextSimilar = null;
        father = null;
        supInCFP = 0;
    }

    protected Node clone()  throws CloneNotSupportedException{
        Node copyNode = (Node) super.clone();
        if(this.nextSimilar!=null)
            copyNode.nextSimilar = this.nextSimilar.clone();
        if(this.father!=null)
            copyNode.father = this.father.clone();
//        if(this.children!=null){
//            for(int key:this.children.keySet()){
//                copyNode.children.put(key,this.children.get(key).clone());
//            }
//        }
        return copyNode;
    }
}
