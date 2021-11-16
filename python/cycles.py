def cycles(indices):
    result = []
    cycle = []
    index = 0
    for i in range(len(indices)):
        cycle = []
        index = i
        while (indices[index] != "marked"):
            cycle.append(indices[index])
            number = indices[index]
            indices[index] = "marked"
            index = number
            if (indices[index] == "marked"):
                result.append(cycle)
                break
    return result
    pass


print(cycles([2, 0, 1, 4, 3, 5]))
