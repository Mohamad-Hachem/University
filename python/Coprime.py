def coprime(a, b):
    for i in range (2, a+1 , 1):
        if(a%i == 0 and b%i == 0):
            return False
    return True
def count_coprimes(n):
    counter = 0
    for i in range(1,n+1):
        if(coprime(i,n)):
            counter = counter + 1
    return counter
# def coprimes(a,b):
#     while b!=0:
#         tmp=a
#         a=b #a is the gcd
#         b=tmp % b
#     if a==1:
#         return True
#     return False
print(coprime(12,7))
print(count_coprimes(86))
print(3%5)