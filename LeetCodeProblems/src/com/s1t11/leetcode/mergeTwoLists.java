package com.s1t11.leetcode;

public class mergeTwoLists {
	public ListNode mergeTwoLists1(ListNode list1, ListNode list2) {
		
		if(list1 == null) {
			return list2;
		}
		if(list2 == null) {
			return list1;
		}
		
		ListNode head,pointer;
		if(list1.val< list2.val) {
			head = new ListNode(list1.val);
			pointer = head;
			head.next = new ListNode(list2.val);
		}else {
			head = new ListNode(list2.val);	
			pointer = head;

			head.next = new ListNode(list1.val);

		}
		
		head = head.next;
		list1 =list1.next;
		list2 =list2.next;

		
		while ((list1 != null && list1.next != null) || (list2 != null && list2.next != null)) {
			
			if (list1 != null && list2 != null && list1.val < list2.val) {
				head = new ListNode(list1.val);
				head.next = new ListNode(list2.val);
				
			}else {
				head = new ListNode(list2.val);	
				head.next = new ListNode(list1.val);
				
			}
			
			head = head.next;
			list1 =list1.next;
			list2 =list2.next;
		}
		
		
		
		

		return pointer;
		
		
       
	}


}
