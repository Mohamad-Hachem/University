def sort_V_shape(L):
    L.sort()
    i , j = 0 , len(L)//2
    while(i<j):
        temp = L[i]
        L[i] = L[j]
        L[j] = temp
        i += 1
        j -= 1
    return L
L = [4, 5, 10, 3, 2, 8, 1,9]
print(sort_V_shape(L))