def generateString(n,S):
    listOfNumbers = []
    result = []
    for i in range(n):
        listOfNumbers.append(0)
    result = PrepareListOfResults(listOfNumbers,S)
    return result

def PrepareListOfResults(listOfNumbers,S):
    result = []
    string = ""
    for i in range(len(listOfNumbers)):
        string = string + str(S)
    maxNumber = int(string)
    counter = 0
    while(counter <= maxNumber):
        listOfNumbers = parse(listOfNumbers,counter)
        if(checkCond(listOfNumbers,S)):
            string = stringConstruct(listOfNumbers)
            result.append(string)
        counter += 1
    return result

def parse(listOfNumbers,counter):
    counterNumbers = len(listOfNumbers)-1
    while(counter >= 0):
        nb = counter % 10
        counter = counter//10
        listOfNumbers[counterNumbers] = nb
        counterNumbers -= 1
        if(counter == 0):
            break
    return listOfNumbers
def checkCond(listOfNumbers,S):
    length = len(listOfNumbers)
    if(length < 3):
        return
    else:
        for i in range(len(listOfNumbers)):
            for j in range(i,len(listOfNumbers)):
                 if(j+2 <= len(listOfNumbers)-1):
                    if(not(listOfNumbers[j]+listOfNumbers[j+1]+listOfNumbers[j+2] <= S)):
                        return False
    return True
def stringConstruct(listOfNumbers):
    string = ""
    for i in range(len(listOfNumbers)):
        string = string + str(listOfNumbers[i])
    return string
n = 4
s = 2
l =[0,0,0,0]
counter = 50
#print(parse(l,counter))
#print(PrepareListOfResults(l,s))
#print(generateString(4,2))
print(generateString(5,3))