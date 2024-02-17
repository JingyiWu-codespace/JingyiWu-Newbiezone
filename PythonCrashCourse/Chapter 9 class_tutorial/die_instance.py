from die import Die
from random import choice
die = Die(20)
print(die.sides)
die.update_slides(10)
print(die.sides)
die.roll_die()


lottery_list = (3, 6, "w", 5, 6, 2, 6, 68, 357, 24, 67, "q", "h", "y")

first_up = []
for _ in range(0,4):
    first_up.append(choice(lottery_list))
print(first_up)
