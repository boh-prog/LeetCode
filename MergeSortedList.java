/**
##Problem ##Difficulty - Easy
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.


**/
class Solution 
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) 
    {
        /// Make A listnode to insert elemnts from both lists to it's next position
        ListNode current = new ListNode();
        /// since First element is gonna be empty we will point to Head.next which will be the actual head with a value in it
        ListNode Head  = current; 
        
        /// Compare values while both lists are empty using the nodes. At first they will  be ///the heads and we will move on to the next element. l1=head l2=head then we move
        while(l1!=null && l2!=null)
        {
            
            if(l1.val<=l2.val)
            {
                /// asign the first value to the list then move to the next node in the list
                current.next=l1;
                l1=l1.next;
            }
            else
            {
                current.next=l2;
                l2=l2.next;
            }
            /// move the next node in out new merge list
            current=current.next;
        }
        /// Since one of the list will be null before the other we have to assign the last position to which ever one is not null 
        if(l1!=null)
        {
            current.next=l1;
        }
        if(l2!=null)
        {
            current.next=l2;
        }
        
        ///// now return the sorted merge list which is a reference node in Head, as delcared above
        
        return Head.next;
        
            
    }
        
}
