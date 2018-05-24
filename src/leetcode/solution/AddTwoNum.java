package leetcode.solution;

import java.awt.List;

public class AddTwoNum {
	

	/**
	 *  Question : 2	Add Two Numbers    
	 * 	Level : 	Medium
	 * 	Result: 	Accepted 
	 * 	Author: 	Yang Liu (referenced from official solution)
	 * */
	class ListNode{
		
		int val;
		ListNode next;
		
		public ListNode(int x){
			this.val=x;
		}
		
	}
	
	class Solution{
		public ListNode addTwoNum(ListNode l1, ListNode l2) {
			ListNode dummy = new ListNode(0);
			ListNode p=l1,q=l2,curr = dummy;
			int carry=0;
			while(p!=null || q!=null){
				
				int x= (p!=null)?p.val:0;
				int y= (q!=null)?q.val:0;
				int sum=carry+x+y;
				carry =sum/10;
				
				curr.next = new ListNode(sum%10);
				curr= curr.next;
				
				if(p!=null) p=p.next;
				if(q!=null) q=q.next;
				
			}
			if(carry >0){
				curr.next= new ListNode(carry);
			}
			return dummy.next;
			
		}
	}
	

}
