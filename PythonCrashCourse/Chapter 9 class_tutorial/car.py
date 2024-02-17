class Car:
    """A simple attempt to represent a car"""
    def __init__(self, make, model, year):
        """Initialize attributes to describe a car"""
        self.make = make
        self.model  = model
        self.year = year
        self.odometer_reading = 0
    def get_description_name (self):
        """Return a neatly formatted descriptive name"""
        long_name = f"{self.year} {self.make} {self.model}"
        return long_name
    def read_odometer(self):
        """print a statement showing the car's mileage"""
        print(f"This car has {self.odometer_reading} miles on it")

    def update_odometer(self,mileage):
        """Set the odometer reading to the given value
        Reject the change if it attempts to roll the odometer back"""
        if mileage >=self.odometer_reading:
            self.odometer_reading = mileage
        else:
            print("You can not roll back an odometer")

    def increment_odometer(self,miles):
        """Add the given amount to the odometer reading"""
        self.odometer_reading+=miles

my_new_car = Car('audi','A4',2024)
print(my_new_car.get_description_name())
my_new_car.read_odometer()

my_new_car.odometer_reading = 23
my_new_car.read_odometer()
my_new_car.get_description_name()
my_new_car.update_odometer(40)
my_new_car.read_odometer()

my_new_car.update_odometer(20_500)
my_new_car.read_odometer()
my_new_car.increment_odometer(100)
my_new_car.read_odometer()

class Battery:
    """A simple attempt to model a vattery for an electric car."""
    def __init__(self, battery_size = 40):
        """Initialize the battery's attribute"""
        self.battery_size = battery_size

    def describe_battery(self):
        """Print a statement describing the battery size"""
        print(f"This car has a {self.battery_size} -KWH battery")



    def get_range(self):
        """Print a statement about the range this battery provides"""
        if self.battery_size == 40:
            range = 150
        elif self.battery_size ==65:
            range = 225
        print (f"This car can go about {range} miles on a full charge")

    def upgrade_battery(self):
        if self.battery_size!=65:
            self.battery_size=65


class ElectricCar(Car):
    """Represent aspects of car, specific to electric vehicles"""
    def __init__(self,make,model,year):
        """Initialize zttributes of the parent class"""
        super().__init__(make, model, year)
        self.battery = Battery()


    def fill_gas_tank(self):
        """Electric cars don't hava gas tanks."""
        print("This car does not hava a gas tank!")
my_leaf = ElectricCar('nissan','leaf',2024)
print(my_leaf.get_description_name())
my_leaf.battery.describe_battery()
my_leaf.battery.get_range()
my_leaf.battery.upgrade_battery()
my_leaf.battery.get_range()
