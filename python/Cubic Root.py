def cubic_root(n):
    maxCubeNumber = 0
    temp = 0
    for numberGrowing in range(n + 1):
        temp = cubic_check(numberGrowing)
        if (temp > maxCubeNumber and temp > n):
            print(str(maxCubeNumber) + ', not exact with difference ' + str(n - cubic_check(maxCubeNumber)))
            break
        elif (temp >= maxCubeNumber and temp == n):
            maxCubeNumber = numberGrowing
            print(str(maxCubeNumber) + ', exact!')
            break
        elif (temp > maxCubeNumber and temp < n):
            maxCubeNumber = numberGrowing
    pass
def cubic_check(x):
    cube = 1
    for i in range(3):
        cube = cube * x
    return cube

cubic_root(99)