m = [
    [1,2,5],
    [20,30,50],
    [21,35,100]
    ]
def sorted_matrix_search(matrix, integer):
    for i in range(len(matrix)):
        if(matrix[i][len(matrix)-1] >= integer):
            for j in range(len(matrix)-1,-1,-1):
                if(matrix[i][j] <= integer):
                    if(matrix[i][j] == integer):
                        return (i,j)
                    else:
                        for k in range(i,len(matrix)):
                            if(matrix[k][j] == integer):
                                return (k,j)
                            elif(matrix[k][j] > integer):
                                break




def search_matrix(matrix,integer):
    for i in range(len(matrix)):
        for j in range(len(matrix)):
            if(matrix[i][j] == integer):
                return i,j



print(sorted_matrix_search(m,21))
print(search_matrix(m,21))