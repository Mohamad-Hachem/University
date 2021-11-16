def palindrome(input_str):
    return input_str==input_str[::-1]
def max_sub_palindrome(input_str):
    subSize=len(input_str)
    while subSize>0:
        nbOfSubs=len(input_str)-subSize+1
        for start in range(0,nbOfSubs):
            sub=input_str[start:start+subSize]
            if palindrome(sub)==True:
                return sub
        subSize=subSize-1
    return ''