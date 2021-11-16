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


def merge_linked_lists(linked_list_1, linked_list_2):
    linked_list_3 = LinkedList()
    temp1 = linked_list_1.head
    temp2 = linked_list_2.head
    while(temp1 is not None and temp2 is not None):
        if(temp1.data > temp2.data):
            now = Node(temp2.data,None)
            linked_list_3.add_at_head(now)
            temp2 = temp2.next
        else:
            now = Node(temp1.data, None)
            linked_list_3.add_at_head(now)
            temp1 = temp1.next
        print("passing by ")
    if (temp2 == None):
        while(temp1 != None):
            now = Node(temp1.data, None)
            linked_list_3.add_at_head(now)
            temp1 = temp1.next
    if (temp1 == None):
        while(temp2 != None):
            now = Node(temp2.data, None)
            linked_list_3.add_at_head(now)
            temp2 = temp2.next
    return reverse(linked_list_3)
def reverse(ll):
    l3 = LinkedList()
    temp = ll.head
    while(temp is not None):
        n = Node(temp.data,None)
        l3.add_at_head(n)
        temp = temp.next
    return l3

# n = Node(4,None)
# m = Node(5,None)
# c = Node(6,None)
# k = Node(1,None)
# b = Node(3,None)
# a = Node(7,None)
# d = Node(9,None)
# ll = LinkedList()
# ll2 = LinkedList()
# ll.add_at_head(c)
# ll.add_at_head(n)
# ll.add_at_head(m)
# ll2.add_at_head(k)
# ll2.add_at_head(b)
# ll2.add_at_head(a)
# ll2.add_at_head(d)
ll1=LinkedList()
ll1.add_at_head(Node(5))
ll1.add_at_head(Node(5))
ll1.add_at_head(Node(3))
ll1.add_at_head(Node(3))
ll1.add_at_head(Node(3))
ll1.add_at_head(Node(1))
ll2= LinkedList()
ll2.add_at_head(Node(6))
ll2.add_at_head(Node(5))
ll2.add_at_head(Node(5))
ll2.add_at_head(Node(3))
ll2.add_at_head(Node(3))
print(ll2.print_list())
print(ll1.print_list())
ll3 = LinkedList()
ll3 = merge_linked_lists(ll,ll2)
ll3.print_list()
