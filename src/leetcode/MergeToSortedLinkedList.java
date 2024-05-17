package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class MergeToSortedLinkedList {
	 public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		 
		 ListNode dummyHead = new ListNode(0);
		 ListNode current =dummyHead;
		 List<Integer> arraylistResult = new ArrayList<Integer>();
		 while(list1 !=null) {
			 arraylistResult.add(list1.val);
			 list1=list1.next;
			 
		 }
		 while(list2 !=null) {
			 arraylistResult.add(list2.val);
			 list2=list2.next;
			 
		 }
	        Collections.sort(arraylistResult);
	        for(int i =0; i<arraylistResult.size();i++) {
	        	ListNode newNode = new ListNode(arraylistResult.get(i));
	        	
	        	

	        	
	        	current=newNode;
	        	System.out.println(current.val);
	        	
	        	
	        	
	        	
	        	
	        }


	        System.out.print(arraylistResult);

	        


		 
		 
		 
		 
		 
		 
		 
		return dummyHead.next;
	        
	    }
	 public static void  main(String args[]) {
	        ListNode list1 = new ListNode(1);
	        list1.next = new ListNode(2);
	        list1.next.next = new ListNode(4);

	       
	        ListNode list2 = new ListNode(1);
	        list2.next = new ListNode(3);
	        list2.next.next = new ListNode(4);
		 
		 mergeTwoLists( list1,  list2);
		





		 
		 
		 
	 }
	
	

}


