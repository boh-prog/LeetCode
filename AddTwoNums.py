class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        sum = ListNode()##initialize the listNode for the sum
        while l1.val != None: ##if there are still numbers in linked list
            if sum.val == : ##
                if l2.val == None: rslt = l1.val + 0 ##if l2 has None object
                else: rslt = l1.val + l2.val ##add the values in linked list and assign to rslt
                if rslt > 9:
                    carry = 1
                    sum.val = rslt - 10
                else: sum.val = rslt ##if rslt < 10
                l1, l2 = l1.next, l2.next
            else:
'''Very Incomplete'''