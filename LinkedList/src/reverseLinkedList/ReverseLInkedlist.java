package reverseLinkedList;

public class ReverseLInkedlist {

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
	class Solution {
		public ListNode reverseList(ListNode head) {
			ListNode curr = head;
			ListNode prev = null;
			while(curr != prev) {
				ListNode ahead = curr.next;
				curr.next = prev;
				prev = curr;
				curr = ahead;
			}
			return prev;
		}
	
}
}
