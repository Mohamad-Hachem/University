def find_Target(L,Target):
    index = -1
    for i in range(len(L)):
        if(L[i] <= Target):
            if(L[i] == Target):
                index = i
        else:
            break
    return index

L = [2 , 3, 5 , 7, 9 , 23]
L2 =[2 , 3, 5, 5, 7, 9 , 23]
L3 = [ 2 , 5 , 6, 7 ,9 , 43]
print(find_Target(L,5))
print(find_Target(L2,5))
print(find_Target(L3,33))