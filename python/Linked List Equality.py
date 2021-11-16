class Node:
    def __init__(self, data=None, next_node=None):
        self.data = data
        self.next = next_node

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

    def add_at_head(self, node):
        node.next = self.head
        self.head = node
        self.length += 1

    def remove_node_after(self, node):
        if node.next is not None:
            temp = node.next
            node.next = node.next.next
            temp.next = None
            self.length -= 1

    def remove_first_node(self):
        if self.head is None:
            return
        temp = self.head
        self.head = self.head.next
        temp.next = None
        self.length -= 1

    def print_backward(self):
        def print_nodes_backward(node):
            if node.next is not None:
                print_nodes_backward(node.next)
            if node is not None:
                print(node, end=' ')

        if self.head is not None:
            print_nodes_backward(self.head)

        print('')


def equal_linked_lists(linked_list_1, linked_list_2):
    if (linked_list_1.head == None and linked_list_2.head != None or linked_list_1.head != None and linked_list_2.head == None):
        return False
    while(linked_list_1.head != None and linked_list_2.head != None):
        if(linked_list_1.head.data != linked_list_2.head.data):
            return False
        linked_list_1.head = linked_list_1.head.next
        linked_list_2.head = linked_list_2.head.next
        if(linked_list_1.head == None and linked_list_2.head != None or linked_list_1.head != None and linked_list_2.head == None):
            return False
    return True

n = Node(5,None)
m = Node(6,None)
c = Node(4,None)
k = Node(3,None)
b = Node(1,None)
a = Node(8,None)
d = Node(9,None)
ll = LinkedList()
ll.add_at_head(m)
ll.add_at_head(c)
ll.add_at_head(n)
ll.add_at_head(k)
ll.add_at_head(a)
ll.add_at_head(d)
ll.add_at_head(b)
print(ll.head)