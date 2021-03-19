import java.util.Scanner;

class bnode{
    public int data;
    public bnode left;
    public bnode right;
    bnode(int data){
        this.data = data;
        left = right = null;
    }
}

public class LeafNodes {
    public static void main(String args[]){
        bnode root = null;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while( i != -1 ){
            root = insertNode(root, i);
            i = sc.nextInt();
        }
        int count = countLeaves(root);
        System.out.println("Leaf Node = " + count);
        sc.close();
    }
    public static bnode insertNode(bnode root, int data){
        if(root == null){
            bnode temp = new bnode(data);
            return temp;
        }
        else{
            bnode cur = root;
            if(cur.data > data)
                cur.left = insertNode(cur.left, data);
            else
                cur.right = insertNode(cur.right, data);
            return cur;
        }
    }
    public static int countLeaves(bnode root){
        if(root == null)
            return 0;
        if(root.left == null && root.right == null)
            return 1;
        return countLeaves(root.left) + countLeaves(root.right);
    } 
}
