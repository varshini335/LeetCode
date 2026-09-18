# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:

    def addTwoNumbers(self, l1: ListNode | None, l2: ListNode | None) -> ListNode | None:

        a = []
        while l1:
            a.append(l1.val)
            l1 = l1.next

        p = "".join(map(str, a))
        rev = int(str(p)[::-1])

        b = []
        while l2:
            b.append(l2.val)
            l2 = l2.next

        t = "".join(map(str, b))
        q = int(str(t)[::-1])

        r = rev + q
        y = list(map(int, str(r)))

        head = ListNode(y[-1])
        temp = head

        for i in range(len(y) - 2, -1, -1):
            temp.next = ListNode(y[i])
            temp = temp.next

        return head