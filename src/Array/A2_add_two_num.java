package Array;

public class A2_add_two_num {
	/**
	 * Definition for singly-linked list.
	 * public class ListNode {
	 *     int val;
	 *     ListNode next;
	 *     ListNode(int x) { val = x; }
	 * }
	 * 考虑各种情况：
	 * 首先是最后面
	 */
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode sumlist = new ListNode(0);
        ListNode p1 = l1,p2 = l2, curr = sumlist;
        int carry = 0;
        while(p1 != null || p2 != null) {
        	int x = (p1!=null)?p1.val:0;//判断是否为值得方式
        	int y = (p2!=null)?p2.val:0;
        	int sum = x + y + carry;
        	carry = sum/10;
        	curr.val = sum%10;
        	curr.next = new ListNode(curr.val);//创建一个新节点的方式。
        	curr = curr.next;
        	if(p1!=null) p1 = p1.next;
        	if(p2!=null) p2 = p2.next;
        }
        if(carry > 0) {
        	curr.next = new ListNode(carry);
        }
        return sumlist.next;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
