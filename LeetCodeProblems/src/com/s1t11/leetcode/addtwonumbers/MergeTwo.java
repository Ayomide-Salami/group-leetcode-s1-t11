package com.s1t11.leetcode.addtwonumbers;

public class MergeTwo {

	
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	
	 ListNode holder1= list1;
     ListNode holder2=list2;
while ((holder1 != null && holder1.next != null) || (holder2 != null && holder2.next != null)) {
		System.out.println(list1.val);
		 holder1 = list1.next;
		list1.next =list2;
		 holder2 = list2.next;
		list1.next.next = holder1;
     list1.next.next.next = holder2;

		list1 = list1.next;
		list2 = list2.next;
		
	}
	
	
	return list1;
        
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
