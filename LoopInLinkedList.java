class ListNode{
    public int data;
    public ListNode next;
    ListNode(int data){
        this.data = data;
    }
}

public class LoopInLinkedList{
    public static void main(String args[]){
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(1);
        ListNode C = new ListNode(1);
        ListNode D = new ListNode(1);
        ListNode E = new ListNode(1);
        ListNode F = new ListNode(1);
        ListNode G = new ListNode(1);
        A.next = B; B.next = C; C.next = D; D.next = E; E.next = F; F.next = G; G.next = C;
        System.out.println("Case 1: ");
        findLoop(A);
        System.out.println("Case 2: ");
        A.next = B; B.next = C; C.next = D; D.next = E; E.next = F; F.next = G; G.next = null;
        findLoop(A);
    }
    public static void findLoop(ListNode head){
        ListNode slow, fast;
        slow = fast = head;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                System.out.println("Loop Found");
                ListNode A = head;
                findStart(A, slow);
                return;
            }
        }
        System.out.println("Loop Not Found");
    }
    public static void findStart(ListNode head, ListNode meet){
        while(head != meet){
            head = head.next;
            meet = meet.next;
        }
        System.out.println("Loop starts at " + head.data);
    }
}