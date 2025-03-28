package com.s1t11.leetcode.addtwonumbers;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode currNode = l1;
		ListNode currNode2 = l2;

		while (currNode.next != null & currNode2.next != null) {

			if (currNode.next != null & currNode2.next == null) {
				
				

			} else if (currNode.next == null & currNode2.next != null) {

			} else {

				currNode.val = currNode.val + currNode2.val;
				System.out.println(currNode.val);
				currNode = currNode.next;

				currNode2 = currNode2.next;
			}

		}
		

		return currNode;

	}

	public static void main(String[] args) {

		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);

		// Initialize second linked list: 4 -> 5 -> 6 -> null
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);

		AddTwoNumbers obj = new AddTwoNumbers();
		ListNode result = obj.addTwoNumbers(list1, list2);

		System.out.println(result.val);

	}

}