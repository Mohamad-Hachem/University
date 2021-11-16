def permutation_cycle_length(permutation):
    original = permutation[:]
    temp = permutation[:]
    counter = 0
    while(True):
        print("this is a new cycle")
        for i in range(len(permutation)):
            permutation[i] = temp[original[i]]
        temp = permutation[:]
        counter += 1
        if(permutation == original):
            return counter

list = [4,3,2,0,1]
perm = [0,2,1]

print(permutation_cycle_length(perm))

