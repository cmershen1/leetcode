public class Solution {
    public ListNode sortList(ListNode h){
        if(h == null || h.next == null)
            return h;
    
        /*split into three list*/
        ListNode fakesmall = new ListNode(0), small = fakesmall;
        ListNode fakelarge = new ListNode(0), large = fakelarge;
        ListNode fakeequal = new ListNode(0), equal = fakeequal;
    
        ListNode cur = h; // pivot is h.
        while(cur != null){
            if(cur.val < h.val){
                small.next = cur;
                small = small.next;
            }
            else if(cur.val == h.val){
                equal.next = cur;
                equal = equal.next;
            }
            else{
                large.next = cur;
                large = large.next;
            }
    
            cur = cur.next;
        }
    
        // put an end.
        small.next = equal.next = large.next = null;
        // merge them and return . merge reusing below one. merge for quicksort should be simplified. 
        return merge(merge(sortList(fakesmall.next), sortList(fakelarge.next)),fakeequal.next) ;
    }
    private ListNode merge(ListNode h, ListNode m){
        ListNode fake = new ListNode(0), cur = fake;
    
        while(h != null && m != null){
    
            if(h.val < m.val){
                cur.next = h;
                h = h.next;
            }
            else{
                cur.next = m;
                m = m.next;
            }
            cur = cur.next;
        }
    
        cur.next = (h == null ? m : h);
    
        return fake.next;
    }
}
