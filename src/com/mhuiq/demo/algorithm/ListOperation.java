package com.mhuiq.demo.algorithm;

import java.util.ArrayList;

public class ListOperation {

	public static class ListNode {
		int val;
		ListNode next = null;
		ListNode(int val) {
			this.val = val;
		}
	}
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if (listNode == null) {
			return new ArrayList<Integer>();
		}
        ListNode head = listNode, tail = listNode.next;
        while (tail != null) {
        	ListNode tmp = tail.next;
			listNode.next = tmp;
        	tail.next = head;
        	head = tail;
        	tail = tmp;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        while (head != null) {
        	result.add(head.val);
        	head = head.next;
        }
		return result;
    }
	
	public static void main(String[] args) {
		ListOperation lo = new ListOperation();
		ListNode tail = null;
		ListNode root = null;
		for (int i=0; i<109; ++i) {
			if (tail == null) {
				tail = new ListNode(i);
				root = tail;
				continue;
			}
			tail.next = new ListNode(i);
			tail = tail.next;
		}
		tail = root;
		/*while (tail != null) {
			System.out.println(tail.val);
			tail = tail.next;
		}*/
		
		ArrayList<Integer> result = lo.printListFromTailToHead(root);
		for (int i=0; i<result.size(); ++i) {
			System.out.println(result.get(i));
		}
		
	}
}
