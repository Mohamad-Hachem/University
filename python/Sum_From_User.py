def sum_From_user():
    val = int(input("Enter the number you would like to add (-1 to exit):"))
    sum = 0
    while(val != -1):
        sum = sum + val
        val = int(input("Enter the number you would like to add (-1 to exit):"))
    return sum

print(sum_From_user())