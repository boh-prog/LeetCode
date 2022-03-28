/**
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4]
Output: [1,4,2,3]
Example 2:


Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]

**/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public void reorderList(ListNode head) 
    {
       //get mid node
        ListNode midHead = getMid(head);
        //reverse linkedList from midle node
        ListNode reversed = reverseList(midHead);
        
        //instantiate new reOrdered list
        ListNode reOrdered = new ListNode();
        //
        reOrdered = mergeList(head, reversed);
        head = reOrdered;
        //return reOrdered
        
    }

    //Merge two linkedLists
    public ListNode mergeList(ListNode head1, ListNode head2)
    {
        ListNode l1 = head1;
        ListNode l2 = head2;
            
        while(l1 !=null &&  l2 != null)
        {
            //get current heads in list 1 and 2
            ListNode l1head = l1;
            ListNode l2head = l2;
            
            //move list 1 and 2 to new heads in their corresponding lists
            l1 = l1.next;
            l2 = l2.next;
            
            //link the two previos heads
            l1head.next = l2head;
            
            l2head.next = l1; //point l2head to the new l1 head
        }
        return head1;
    }
    
    public ListNode reverseList(ListNode head)
    {
        //reverse linked List
        //instantiate previos node
       ListNode prev = null;
        
        while (head != null)
        {
            //take next node in linkedList
            ListNode next_node = head.next;
            //point head to prev
            head.next = prev;
            //move prev to head
            prev = head;
            //assign new head of linkedList
            head = next_node;
        }
        
        return prev;
    }
    
    //get middle node
    public ListNode getMid(ListNode head)
    {
        //instantiate fast and slow pointers
        ListNode fast = head; ListNode slow = head;
        
        //
        while(fast.next != null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
