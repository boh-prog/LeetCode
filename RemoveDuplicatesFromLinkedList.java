/**
 * Problem:
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once.
 * Return the linked list sorted as well.
 *
 * Input: head = [1,1,2]
 * Output: [1,2]
 *
 * Input: head = [1,1,2,3,3]
 * Output: [1,2,3]
**/
// * Definition for singly-linked list.
class ListNode
{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution
{
    public ListNode deleteDuplicates(ListNode head)
    {

        ListNode curr = head;
        //while there is a next value in List
        while(curr != null)
        {
            //compare current val with value in next node
            while((curr.next != null) && (curr.val == curr.next.val))
            {
                //move curr's pointer to next next node
                curr.next = curr.next.next;
            }
            //move curr to next node
            curr = curr.next;
        }
        return head;
    }
}