package com.algo.idea.doubleIndex;

/**
 * 使用双指针判断链表是否有环
 *
 * */

public class IsHaveCycle {
    public static void main(String[] args) {

    }

    public static Boolean isHaveCycle(ListNode node){
        if(node == null){
            return false;
        }
        ListNode head = node;
        if(node.next == null || node.next.next == null){  // 注意空指针异常
            return false;
        }
        ListNode twoStepNode = node.next.next;
        while (head !=null & twoStepNode.next !=null & twoStepNode != null){
            if(head == twoStepNode){
                return true;
            }
            head = head.next;
            twoStepNode = twoStepNode.next.next; //注意空指针异常
        }
        return false;
    }



    static class ListNode{
        int val;
        ListNode next;
        public ListNode(int val){
            this.val = val;
        }
        public ListNode getNext() {
            return next;
        }
    }
}
