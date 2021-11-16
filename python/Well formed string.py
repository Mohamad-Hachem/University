def well_formed(s):
    stack = []
    for i in s:
        if(i == "(" or i == "[" or i == "{"):
            stack.append(i)
        if(i == ")" or i == "]" or i == "}"):
            if(stack != []):
                temp = stack.pop()
                if(not((i==")"and temp=="(")or(i=="]" and temp == "[")or(i=="}"and temp =="{"))):
                    return False
            else:
                return False
    if(stack != []):
        return False
    return True

print(well_formed("this is([]{)test"))
# stack = []
# print(stack == [])