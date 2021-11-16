def rightTriangle(n):
    for i in range(n+1):
        for j in range(i):
            print("*",end="")
        print("")


rightTriangle(5)

def printEvenString(x):
    for i in range(0,len(x),2):
        print(x[i],end="")

x = "PYCHARM"
printEvenString(x)
print("")

def SumPrint(x):
    for i in range(x):
        if(i == 0):
            print("current number ", 0, "Previous number ", 0, "sum : ", 0)
        else:
            print("current number ", i , "Previous number ", i-1 , "sum : ", i + (i-1) )

SumPrint(5)

def recursive_sum(n):
    if n == 1:
        return 1
    return n + recursive_sum(n-1)
print(recursive_sum(5))


def count_digits(n):
    number = str(n)
    if n == "":
        return 0
    return 1 + count_digits(number[0:len(number)-1])

print(count_digits("1234"))

def reverse_digits(n):
    n2 = str(n)
    if n2 == "":
        return ""
    return n2[len(n2)-1:len(n2)] + reverse_digits(n2[0:len(n2)-1])
print(reverse_digits(0))

def palindrome(input_str):
    for i in range(len(input_str)//2):
      #  print(input_str[i]," ==== ",input_str[len(input_str)-i-1])
        if input_str[i] != input_str[len(input_str)-i-1]:
            return False
    return  True

def factorial(n):
    if n == 0:
        return 1
    return n * factorial(n-1)

print(factorial(3))

def palindrome(input_str):
    return input_str==input_str[::-1]
def max_sub_palindrome(input_str):
    subSize=len(input_str)
    while subSize>0:
        nbOfSubs=len(input_str)-subSize+1
        for start in range(0,nbOfSubs):
            sub=input_str[start:start+subSize]
            if palindrome(sub)==True:
                return sub
        subSize=subSize-1
    return ''