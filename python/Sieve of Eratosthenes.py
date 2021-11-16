# def sieve_of_eratosthenes(n):
#     prime = []
#     isprime = True
#     for i in range(2,n+1):
#         for j in range(2,i):
#             if(i%j == 0):
#                 isprime = False
#                 break
#         if(isprime):
#             prime.append(i)
#         isprime = True
#     return prime
# print(sieve_of_eratosthenes(10))
def sieve_of_eratosthenes(n):
    TrueList = ["true"] * (n+1)
    prime = []
    for i in range(2,n+1):
        if(TrueList[i] == "true"):
            prime.append(i)
            for j in range(i,n+1):
                if(j%i == 0):
                    TrueList[j] = "false"
    return prime

print(sieve_of_eratosthenes(16))