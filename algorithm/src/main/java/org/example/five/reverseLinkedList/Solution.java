package org.example.five.reverseLinkedList;

import java.util.List;

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
    public ListNode (int[] arr){
        if (arr == null || arr.length ==0){
            throw new IllegalArgumentException("arr can not be empty");
        }
        this.val = arr[0];
        ListNode curNode = this;
        for (int i = 1; i < arr.length ; i++) {
            curNode.next = new ListNode(arr[i]);
            curNode = curNode.next;
        }
    }
    // 返回以当前ListNode为头结点的链表信息字符串
    @Override
    public String toString(){

        StringBuilder s = new StringBuilder("");
        ListNode curNode = this;
        while(curNode != null){
            s.append(Integer.toString(curNode.val));
            s.append(" -> ");
            curNode = curNode.next;
        }
        s.append("NULL");
        return s.toString();
    }
}

public class Solution {
    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1,2,3});
        System.out.println(head);
        head = new Solution().reverseList(head);
        System.out.println(head);
    }
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode curr = head;
        while (curr!=null){
         ListNode next = curr.next;
//----------------从前往后读-------------------
         curr.next = pre;
         pre = curr;
         curr = next;
        }

        return pre;
    }
}
