class Rocket:
    def __init__(self,x = 0 ,y = 0):
        self.x = x
        self.y = y
    def move_rocket(self,movex,movey = 1):
        self.y += movey
        self.x += movex
    def print_position(self):
        print("position",(self.x,self.y))
    def get_distance(self,rocket1,rocket2):
        return


l = Rocket(3,5)
l2 = Rocket()
l.move_rocket(1)
print(l2.x)