def lowest(l,k):
    q = []
    counter = 0
    for i in range(k):
        #min = min(q)
        #p.remove(min)
        #q.append(min) then return
        q.append(l[i])
        counter+=1
    for i in range(counter,len(l)):
        if(q[biggest(q)] > l[i]):
            q[biggest(q)] = l[i]
    return q

def biggest(q):
    max = -999
    index = 0
    for i in range(len(q)):
        if(max < q[i]):
            max = q[i]
            index = i
    return index

l = [-2,3,1,-5,-6,7,-10]
print(lowest(l,3))