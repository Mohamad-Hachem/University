def model(l):
    temp = []
    max = 0
    item = 0
    for i in l:
        if(search(i,temp) == -1):
            temp.append([i,1])
        else:
            temp[search(i,temp)][1] += 1
    #print(temp)
    for i,j in temp:
        if(j>max):
            max=j
            item = i
    return item
def search(item,temp):
    for i in range(len(temp)) :
        if temp[i][0] == item:
            return i
    return -1

l = [2,4,6,20,1,6,6]
print(model(l))