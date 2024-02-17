from restaurant import Restaurant
from Admin import Admin
class Dog:
    """A simple attempt to model a dog"""

    def __init__(self,name,age):
        """Initialize name and get attributes"""
        self.name = name
        self.age = age
    def sit(self):
        """Simulate a dog sitting in response to a command"""
        print(f"{self.name} is now sitting")
    def roll_over (self):
        """Simulate rolling over in response to a command"""
        print(f"{self.name} rolled over!")

my_dog = Dog('Will',6)
my_dog.sit()



restaurant = Restaurant("Yuki","Chinese")
print(restaurant.cuisine_type)
print(restaurant.name)
restaurant.describe_restaurant()
restaurant.open_restaurant()
print(restaurant.name_served)
restaurant.set_number_served(100)
print(restaurant.name_served)
restaurant.incre_number_served(50)
print(restaurant.name_served)

res1 = Restaurant("1","India")
res2 = Restaurant("2","Meridian")
res3 = Restaurant("3","Africa")
res1.describe_restaurant()
res2.describe_restaurant()
res3.describe_restaurant()

class IceCreamStand(Restaurant):
    def __init__(self,name,cuisine_type):
        self.flavour = ["chocolate", "cream", "melon"]
        super().__init__(name,cuisine_type)

    def get_flavor(self):
        for flavour in self.flavour :
            print(flavour)
ice_cream_stand = IceCreamStand("happy stand","dessert")
ice_cream_stand.get_flavor()
ice_cream_stand.describe_restaurant()
print(ice_cream_stand.name_served)


admin1 = Admin("admin","1")
admin1.privileges.show_pribileges()



