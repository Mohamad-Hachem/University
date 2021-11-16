def findCombinationsOf(number):
    list = [1,3,9,27]
    max = 0
    for i in range(len(list)):
        max = max + list[i]
        if(max >= number):
            max = i
            break
    sign = [0,0,0,0]
    number = number - list[max]
    sign[max] = 1
    if(number == 0):
        return list[max]
    while(number != 0):
        if(number == 0):
            break
        elif(number < 0 and  abs(number) >= 5):
            number = number + list[2]
            sign[2] = -1
        elif(number > 0 and  abs(number) >= 5):
            number = number - list[2]
            sign[2] = 1
        elif(number < 0 and 2 <= abs(number) <= 4):
            number = number + list[1]
            sign[1] = -1
        elif (number > 0 and 2 <= abs(number) <= 4):
            number = number - list[1]
            sign[1] = 1
        elif (number < 0 and abs(number) == 1):
            number = number + list[0]
            sign[0] = -1
        elif (number > 0 and abs(number) == 1):
            number = number - list[0]
            sign[0] = 1
    string = ""
    string = string + str(list[max])
    for i in range(max-1,-1,-1):
        if(sign[i] == 1):
            string = string + " + " + str(list[i])
        elif (sign[i] == -1):
            string = string + " - " + str(list[i])

    return string
def all():
    for i in range(41):
        print((findCombinationsOf(i)))
all()