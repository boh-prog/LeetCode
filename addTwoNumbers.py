##Medium 
'''
You are given two non-empty linked lists representing two non-negative integers.
The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example 1:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.

'''


# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        carry = 0
        dummy = ListNode()
        curr = dummy
        
        while l1 or l2 or carry: ##while l1 and l2 are non empty
            ##get values to add from list 1 and 2
            v1 = l1.val if l1 else 0
            v2 = l2.val if l2 else 0
            
            ##get new added val
            Val = v1 + v2 + carry
            carry = Val // 10
            Val = Val % 10
            
            ##add to new linkedList and update curr pointer
            curr.next = ListNode(Val)
            curr = curr.next
            
            ##update list pointers
            l1 = l1.next if l1 else None
            l2 = l2.next if l2 else None
            
        return dummy.next
