public class RemoveDuplicatesFromLinkedList
{
//     * Definition for singly-linked list.
      public class ListNode
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
            if(head == null) return head;

            ListNode dummy = new ListNode();
            ListNode curr = dummy;

            while(head != null)
            {
                int val = head.val;
                try
                {
                    if (head.next != null)
                    {
                        int adjVal = head.next.val;

                        if(val != adjVal)
                        {
                            curr.val = val; curr.next = new ListNode(adjVal);

                            curr = curr.next; head = head.next;
                        }
                        else if (val == adjVal) head = head.next;
                    }
                }
                catch(NullPointerException e) //if head.next is null
                {
                    head = null; //head.next is null
                }

                // if(val != adjVal)
                // {
                //     curr = ListNode(val, adjVal);
                //     curr = crr.next; head = head.next;
                // }
                // else if (val == adjVal) head = head.next;

            }

            return dummy;
        }
    }
}
