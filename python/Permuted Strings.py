def is_permutation(str1, str2):
    str1_check = False
    str2_check = False
    if(len(str1) == len(str2)):
        for i in range(len(str1)):
            for j in range(len(str2)):
                if(str1[i] == str2[j]):
                    str1_check = True
                if(str2[i] == str1[j]):
                    str2_check = True
            if(str1_check != True or str2_check != True):
                return False
            str2_check = False
            str1_check = False
        return True
    return False
# if (sort str1 == sort str2) return true
def get_permutation_list(input_str, output_str):
    permutation = []
    counter = 0
    if(is_permutation(input_str,output_str)):
        for i in range(len(input_str)):
            for j in range(len(output_str)):
                if(input_str[i] == output_str[j]):
                    permutation.append(j)
        return permutation
    return "these 2 are not permutations"
    pass

print(get_permutation_list("ABBC","CBBA"))
