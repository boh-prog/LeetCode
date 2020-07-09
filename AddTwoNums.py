class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        """String representation of ListNode Object"""
        String,values = "--->",[]
        while self != None:
            values.append(self.val)
            self = self.next

        return String.join([str(num) for num in values])

class Solution:
    def addTwoNumbers(l1, l2):
        num_1,num_2 = "",""
        while l1.next != None: ##create a string equivalent of number in ListNode
            num_1 += str(l1.val)
            l1 = l1.next ##move to next Node
        while l2.next != None:
            num_2 += str(l2.val)
            l2 = l2.next ##move to next Node
        Sum = eval(num_1[::-1]) + eval(num_2[::-1]) ##reverse the string to get the actual number and compute the sum
        Sum = str(Sum)[::-1] ##reverse order of numbers in sum for the ListNode

        Lsum = ListNode(int(Sum[0])) ##create list Node of sum and add first value in it
        current = Lsum ## create a current Node to traverse the ListNode
        for val in Sum[1:]:
            current.next = ListNode(val) ##add value to next node in Lsum
            current = current.next ##assign nextVal to current
        return Lsum ##return the ListNode of Sum

###Test
l1 = ListNode(8,ListNode(4, ListNode(1))) ##listnode 1
l2 = ListNode(1,ListNode(2,ListNode(3)))
sol = Solution.addTwoNumbers(l1,l2)
print(sol)

"""complete Later ...."""