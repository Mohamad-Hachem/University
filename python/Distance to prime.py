def Distance_to_prime(n):
    if(prime(n)):
        return 0
    counter_below = 0
    counter_above = 0
    for i in range(n-1,1,-1):
        if(prime(i)):
            counter_below += 1
            break
        counter_below+=1
    isPrime = False
    above_n = n+1
    while(isPrime == False):
        if(prime(above_n)):
            counter_above += 1
            break
        counter_above+=1
        above_n += 1
    return min(counter_above,counter_below)

def prime(n):
    for i in range(2,n):
        if(n%i == 0):
            return False
    return True

print(Distance_to_prime(7))
print(Distance_to_prime(6))
print(Distance_to_prime(25091))