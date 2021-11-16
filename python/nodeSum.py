class TreeNode():
    def __init__(self,data = None , parent = None , Left = None , Right = None):
        self.data = data
        self.parent = parent
        self.Left = Left
        self.Right = Right
    def transform(self):
        self = None
    def search(self,value):
        if(self.data == None):
            return None
        elif(self.data == value):
            return self.data
        elif(value < self.data ):
            if(self.Left is None):
                return
            else:
                self.Left.search(value)
        else:
            if(self.Right is None):
                return
            else:
                self.Right.search(value)

    def insert(self,value):
        if(self.data is None):
            self.data = value
        elif(value < self.data):
            if(self.Left is None):
                self.Left = TreeNode(value,self)
            else:
                self.Left.insert(value)
        else:
            if(self.Right is None):
                self.Right = TreeNode(value,self)
            else:
                self.Right.insert(value)
    def normal_print(self):
        if(self is None):
            return
        else:
            if(self.Right is not None and self.Left is not None):
                return self.Left.normal_print(), self.data, self.Right.normal_print()
            elif(self.Right is None and self.Left is not None):
                return self.Left.normal_print(),self.data
            elif(self.Left is None and self.Right is not None):
                return self.data,self.Right.normal_print()
            else:
                return self.data
def NodeSum(tree):
    if(tree is None):
        return 0
    return NodeSum(tree.Right) + Check(tree.data) + NodeSum(tree.Left)

def Check(data):
        if(data % 3 == 0):
            return data
        return 0
root = TreeNode(20)
root.insert(23)
root.insert(18)
root.insert(24)
root.insert(21)
root.insert(19)
root.insert(14)
root.insert(12)
root.insert(15)
print(root.normal_print())
print(NodeSum(root))