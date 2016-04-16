public class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return head;
        ListNode oddHead = head,evenHead =head.next;
        ListNode prevOdd = oddHead,prevEven = evenHead;

        while(prevOdd.next != null && prevEven.next != null){
            prevOdd.next = prevEven.next;
            prevOdd = prevOdd.next;

            prevEven.next = prevOdd.next;
            prevEven = prevEven.next;
        }
        prevOdd.next = evenHead;

        return oddHead;
    }
}
