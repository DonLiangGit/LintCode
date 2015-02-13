/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    /**
     * @param head: the List
     * @param k: rotate to the right k places
     * @return: the list after rotation
     */
    public ListNode rotateRight(ListNode head, int k) {
        // write your code here
        if(head == null || k == 0) {
            return head;
        }
        
        ListNode dummyNode = head;
        ListNode kthNode = head;
        ListNode flag = head;
        int listLength = 1;
        while(listLength <= k && flag.next != null) {
            flag = flag.next;
            listLength++;
        }
        
        if(listLength <= k) {
            k = k % listLength;
            if(k == 0) {return head;}
            flag = head;
            listLength = 1;
            while(listLength <= k && flag.next != null) {
                flag = flag.next;
                listLength++;
            }
        }
        
        while(flag.next != null) {
            kthNode = kthNode.next;
            flag = flag.next;
        }
        flag.next = head;
        dummyNode = kthNode.next;
        kthNode.next = null;
        
        return dummyNode;
    }
}