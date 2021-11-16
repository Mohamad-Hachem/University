class time:
    def __init__(self,hour = 0,minute=0):
        self.hour = hour
        self.minute = minute
    def display_time(self):
        print("hours : ",self.hour," minutes : ",self.minute)
    def display_minute(self):
        print("total minutes is :",self.hour*60 + self.minute)
    def addtime(self,time1, time2):
        hours = time1.hour + time2.hour
        minutes = time2.minute + time1.minute
        if (minutes >= 60):
            hours += minutes // 60
            minutes = minutes % 60
        t3 = time(hours,minutes)
        print("total is :", hours, "hours and ", minutes, "minutes")
        return t3



time1 = time(1,30)
time2 = time(1,30)
time1.display_time()
time1.display_minute()
t3 = time()
t3.addtime(time1,time2)