# this code is inspired by the Radix_sort() https://www.geeksforgeeks.org/radix-sort/
def performant_sort(L):
    maxnb = max(L)
    Digital_Degree = 1
    while(maxnb // Digital_Degree > 0):
        L = sort_by_digit(L,Digital_Degree)
        Digital_Degree *= 10
def sort_by_digit(L,Digit_Degree):
    output = [0]*len(L)
    count = [0]*10
    for i in range(len(L)):
        nb = L[i]//Digit_Degree
        count[nb%10] += 1
    for i in range(1,10):
        count[i] += count[i-1]
    i = len(L) - 1
    while(i>=0):
        nb = L[i]//Digit_Degree
        output[count[nb%10]-1] = L[i]
        count[nb%10] -= 1
        i -= 1
    for i in range(len(L)):
        L[i] = output[i]
    return L

def print2(L):
    for i in range(len(L)):
        print(L[i], end=None)
arr = [1,5,9,2,8,3,29,23,98,7,100]


performant_sort(arr)
print2(arr)
