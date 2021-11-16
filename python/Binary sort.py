def sortL(L):
    NumberOfZero = 0
    NumberOfOne = 0
    for i in range(len(L)):
        if(NumberOfZero == 0):
            NumberOfZero += 1
        if(NumberOfOne == 1):
            NumberOfOne += 1
    for i in range(len(L)):
        if(i <= NumberOfZero):
            L[i] = 0
        else:
            L[i] = 1
    return L

L = [0,1,0,1,1,0,0]
print(sortL(L))