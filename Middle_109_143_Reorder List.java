public class Solution {
    public void reorderList(ListNode head) {
        List<Integer> list = new ArrayList<Integer>();
        for(ListNode node = head;node!=null;node=node.next) 
        	list.add(node.val);
        int i = 0,j = list.size()-1;
        ListNode node = head;
        boolean addi = true;
        while (i <= j) {
            node.val = addi?list.get(i++):list.get(j--);
        	addi=!addi;
        	node=node.next;
        }
    }
}
