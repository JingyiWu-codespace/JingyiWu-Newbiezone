from random import randint
class Die:
    def __init__(self,count):
        self.count = count
        self.sides = 6
    def roll_die(self):
        for num in range(1,self.count+1):
            print(f"roll times: {randint(1,self.sides)}")

    def update_slides(self,side):
        self.sides = side



