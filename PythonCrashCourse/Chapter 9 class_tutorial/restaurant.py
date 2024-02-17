class Restaurant:
    def __init__(self,name,cuisine_type):
        self.name = name
        self.cuisine_type = cuisine_type
        self.name_served = 0
    def describe_restaurant(self):
        print(f"Our restaurant name is: {self.name},and our cuisin type is {self.cuisine_type}")
    def open_restaurant(self):
        print(f"Our restaurant is open!!")
    def set_number_served(self,counts):
        self.name_served = counts
    def incre_number_served(self,counts):
        self.name_served +=counts