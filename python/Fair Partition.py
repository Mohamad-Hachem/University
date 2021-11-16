def partition(ratings):
    sum_team1 = 0
    sum_team2 = 0
    team1 = []
    team2 = []
    ratings.sort()
    team1.append(ratings[len(ratings)-1])
    sum_team1 += ratings[len(ratings)-1]
    for i in range(len(ratings)-2,-1,-1):
        if(abs((sum_team1+ratings[i])-sum_team2) <= abs(sum_team1-(sum_team2+ratings[i]))):
            sum_team1 += ratings[i]
            team1.append(ratings[i])
        else:
            team2.append(ratings[i])
            sum_team2+= ratings[i]
    return team1 , team2 , sum_team1-sum_team2
    pass
def fair_partition (myList):
    def helper(l,R,level,result):
        if level>=len(myList):
            result.append((l,R))
            return
        element = myList[level]
        helper(l+[element],R,level+1,result)
        helper(l,R+[element],level+1,result)

    result=[]
    helper([],[],0,result)
    print(result)

fair_partition([1,24,5,19])

rate2 = [1,2,3,4,5,6,7,9,19]
rate = [10,9,8,7,6,5,4,3,2,1]
print(partition(rate2))