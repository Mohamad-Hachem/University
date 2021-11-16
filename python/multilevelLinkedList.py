# #Everything was built from scracth
# couldn't finish the logic was to create 2 Queues one to take the linked list
# and the other to receive the children / once the first queues finishes send the children to the queues and check if the nodes have
# children / repeat until it finishes.
class Node:
    def __init__(self, data=None, next_node=None, child = None):
        self.data = data
        self.next = next_node
        self.child = child

    def __str__(self):
        return str(self.data)

class LinkedList:
    def __init__(self):
        self.length = 0
        self.head = None

    def print_list(self):
        node = self.head
        while node is not None:
            print(node, end=' ')
            node = node.next
        print('')
    def print_list_with_child(self):
        node = self.head
        while node is not None:
            print(node,end=' ')
            temp = node.child
            if(temp is not None):
                while(temp is not None):
                    print(temp,end=' ')
                    temp = temp.next
            node = node.next
        print('')
    def add_at_head(self, node):
        node.next = self.head
        self.head = node
        self.length += 1

    def add_child_linkedlist(self, target, linkedlist):
        node = self.head
        while node is not None:
            if(node.data == target):
                node.child = linkedlist.head
                break
            node = node.next


#
# def search(node, Target):
#     # if(node):
#     #     if(node.data == Target):
#     #         return node
#     #     search(node.next,Target)
#     #     search(node.child,Target)
#
#     if(node is None):
#         return
#     elif(node.data == Target):
#         return node.data
#     else:
#         print("we passing by ",node.data)
#         return search(node.next,Target) ,search(node.child,Target)
class Queue:
    def __init__(self):
        self.head = None
        self.end = None
        self.length = 0
    def add_Node_data(self,data):
        self.length += 1
        temp = Node(data)
        if(self.head is None):
            self.head = temp
            self.end = self.head
        else:
            self.end.next = temp
            self.end = self.end.next
    def add_Node(self,node):
        self.length += 1
        temp = node
        if(self.head is None):
            self.head = temp
            self.end = self.head
        else:
            self.end.next = temp
            self.end = self.end.next
    def dequeue(self):
        if(self.length == 0):
            return None
        else:
            temp = self.head
            self.head = self.head.next
            self.length -= 1
            return temp
    def print(self):
        temp = self.head
        while(temp is not None):
            print(temp.data,end=' ')
            temp = temp.next
        print(' ')
def multi_to_single_level(linkedlist):
    finalLinkedList = LinkedList()
    CurrentLinkedList = Queue()
    Children = Queue()
    temp = Node()
    temp = linkedlist.head
    while(temp is not None):
        CurrentLinkedList.add_Node(temp)
        if(temp.child):
            Children.add_Node(temp.child)
        temp = temp.next
    while(CurrentLinkedList.length > 0 ):
        finalLinkedList.add_at_head(CurrentLinkedList.dequeue())
    while(Children.length > 0):
        temp = Children.dequeue()
        if(temp is not None):
            CurrentLinkedList.add_Node(temp)
        if(temp.child is not None):
            Children.add_Node(temp.child)
    while (CurrentLinkedList.length > 0):
        finalLinkedList.add_at_head(CurrentLinkedList.dequeue())
    finalLinkedList.print_list()
    Children.print()
    CurrentLinkedList.print()

ll = LinkedList()
ll.add_at_head(Node(5))
ll.add_at_head(Node(4))
ll.add_at_head(Node(3))
ll.add_at_head(Node(2))
ll.add_at_head(Node(1))
#ll.print_list()
#print("this is 1")
#ll.print_list_with_child()
l2 = LinkedList()
l2.add_at_head(Node(7))
l2.add_at_head(Node(6))
# #l2.print_list()
ll.add_child_linkedlist(1,l2)
# #print("this is 2")
# ll.print_list_with_child()
l3 = LinkedList()
l3.add_at_head(Node(9))
l3.add_at_head(Node(8))
# #l3.print_list()
# #print("this is 3")
ll.add_child_linkedlist(3,l3)
# #ll.print_list_with_child()
# l5 = LinkedList()
# l5.add_at_head(Node(11))
# l5.add_at_head(Node(10))
# #print("this is 4")
# l2.add_child_linkedlist(7,l5)
# #l2.print_list_with_child()
# #ll.print_list_with_child()
# #print("this is final")
ll.print_list_with_child()
multi_to_single_level(ll)

