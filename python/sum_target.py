# def sum_Target(L,T):
#     for i in range(len(L)):
#         for j in range(i,len(L)):
#             if(L[i]+L[j] == T):
#                 return True
#     return False

L = [1,3,5,6]

def sum_Target(L,T):
    i = 0
    j = len(L)-1
    while(i<=j and j >= 0):
        if(L[i] + L[j] == T):
            return True
        elif(L[i] + L[j] >= T):
            j -= 1
        else:
            i+=1
    return False

print(sum_Target(L,7))