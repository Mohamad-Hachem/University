def list_jumps(jumps):
    index = 0
    while(jumps[index] != "visited"):
            number = jumps[index]
            jumps[index] = "visited"
            index = index + number
            if (index >= len(jumps) or index < 0):
                 return "this is not a cycle"
    return "cycle"

# list = []
# list.append("test")
# list = list + ["test"]

list = [1,1,2,2,1,3,-5]
print(list_jumps(list))