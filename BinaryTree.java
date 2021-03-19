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

public class BinaryTree {
    public static void main(String args[]){
        bnode root = null;
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while( i != -1 ){
            root = insertNode(root, i);
            i = sc.nextInt();
        }
        System.out.println("Inorder Print: ");
        inOrder(root);
        System.out.print("\n");
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
    public static void inOrder(bnode root){
        if(root == null)
            return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }   
}
