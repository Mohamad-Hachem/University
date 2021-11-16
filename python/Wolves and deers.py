def wolves_and_dear(deer_0, wolves_0, deer_growth, deer_predation, wolves_predation, wolves_decay, dt, n):
    max = 0
    wolves = wolves_0
    deer = deer_0
    for i in range(n):
        wolves = wolves + dt*(wolves_predation*wolves*deer-wolves_decay*wolves)
        deer = deer + dt*(deer_growth*deer-deer_predation*wolves*deer)
        if(wolves>max):
            max = wolves
        dt=dt+0.001
        print (wolves)
    return max
    pass
wolves_and_dear(1.5,1.5,2/3,4/3,1,1,0.001,3)