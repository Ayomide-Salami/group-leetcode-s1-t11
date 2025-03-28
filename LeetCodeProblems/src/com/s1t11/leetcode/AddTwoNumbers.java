package com.s1t11.leetcode;

class ListNode {
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

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode list1 = new ListNode(2);
		list1.next = new ListNode(4);
		list1.next.next = new ListNode(3);
		// Initialize second linked list: 5 -> 6 -> 4 -> null
		ListNode list2 = new ListNode(5);
		list2.next = new ListNode(6);
		list2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(list1, list2);
		while (result != null) {
			System.out.print(result.val + "");
			result = result.next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carryOver = 0;// CarryOver value

		// Declare the Node that points to the root node of the list
		ListNode resultPointer = new ListNode();

		// Declare the node that builds and traverses the list
		ListNode currentNode = resultPointer;

		//Traverse the lists as long as there are number in either list and the carryover exists
		while (l1 != null || l2 != null || carryOver != 0) {
			//Declare integers for the summation 
			int val1 = 0;
			int val2 = 0;
			
			//Check if the l2 Node has a value
			if (l1 != null) {
				//Set the value of the l1 node to the integer used for summation
				val1 = l1.val;
				
				//Traverse to the next node of the l1 list
				l1 = l1.next;
			}

			//Check if the l2 Node has a value
			if (l2 != null) {
				//Set the value of the l2 node to the integer used for summation
				val2 = l2.val;
				
				//Traverse to the next node of the l1 list
				l2 = l2.next;
			}

			//Sum for the node
			int sum = val1 + val2 + carryOver;
			
			//carryOver for the next node
			carryOver = sum / 10;

			//Create the next node and set its value 
			currentNode.next = new ListNode(sum % 10);
			
			//Traverse to the next node of the result list
			currentNode = currentNode.next;

		}

		// return the root node of the list
		return resultPointer.next;
	}
}
