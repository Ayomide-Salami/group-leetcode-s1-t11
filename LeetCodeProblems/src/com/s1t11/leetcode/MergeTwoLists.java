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

public class MergeTwoLists {

	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		//Declare the Node that points to the root node of the list
		ListNode resultPointer = new ListNode();

		// Declare the node that builds and traverses the list
		ListNode currentNode = resultPointer;
		
		//Loops until both lists have been traversed
		while(list1 != null || list2 != null) {
			
			//If list 1 has ended, add the rest of list 2 to the resulting list
			if(list1 == null) {
				currentNode.next = new ListNode(list2.val);
				currentNode = currentNode.next;
				list2 = list2.next; 
			} 
			
			//If list 2 has ended, add the rest of list 1 to the resulting list
			else if(list2 == null) {
				currentNode.next = new ListNode(list1.val);
				currentNode = currentNode.next;
				list1 = list1.next; 
			} 
			
			//If both list haven't ended
			else {
				
				//If list 1 has a lesser or equal value to list 2 add that to the resulting list
				if(list1.val <= list2.val) {
					currentNode.next = new ListNode(list1.val);
					currentNode = currentNode.next;
					list1 = list1.next; 
				}
				
				//If list 2 has a lesser value than list 1 add that to the resulting list
				else {
					currentNode.next = new ListNode(list2.val);
					currentNode = currentNode.next;
					list2 = list2.next;
				}
			}	
		}
		// return the root node of the resulting list
		return resultPointer.next;
	}
}
