import java.util.Scanner;

class ListNode{
    public int data;
    public ListNode next;
    ListNode(int data){
        this.data = data;
        next = null;
    }
}

public class MergeTwoLists {
    public static void main(String args[]){
        ListNode L1 = null, L2 = null;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sorted List 1: ");
        i = sc.nextInt();
        while( i != -1 ){
            L1 = addToList(L1, i);
            i = sc.nextInt();
        }
        System.out.print("Sorted List 2: ");
        i = sc.nextInt();
        while( i != -1 ){
            L2 = addToList(L2, i);
            i = sc.nextInt();
        }
        ListNode M = mergeLists(L1, L2);
        printList(M);
        sc.close();
    }
    public static ListNode addToList(ListNode h1, int data){
        ListNode temp = new ListNode(data);
        if(h1 == null)
            return temp;
        ListNode curr = h1;
        while(curr.next != null)
            curr = curr.next;
        curr.next = temp;
        return h1;
    }
    public static ListNode mergeLists(ListNode L1, ListNode L2){
        ListNode M, curr;
        M = curr = null;
        while(L1 != null && L2 != null){
            if(L1.data < L2.data){
                if(curr == null)
                    M = curr = L1;
                else{
                    curr.next = L1;
                    curr = curr.next;
                }
                L1 = L1.next;
            }
            else{
                if(curr == null)
                    M = curr = L2;
                else{
                    curr.next = L2;
                    curr = curr.next;
                }
                L2 = L2.next;
            }
        }
        if(L1 != null)
            curr.next = L1;
        if(L2 != null)
            curr.next = L2;
        return M;
    }
    public static void printList(ListNode L){
        if(L == null){
            System.out.print("\n");
            return;
        }
        System.out.print(L.data + " ");
        printList(L.next);
    }
}
