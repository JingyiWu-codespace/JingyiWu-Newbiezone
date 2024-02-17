from user import User
class Privileges():
    def __init__(self):
        self.privilege = ["can add post","can delete post","can ban user"]

    def show_pribileges(self):
        for privilege in self.privilege:
            print(privilege)

class Admin(User):
    def __init__(self,first_name,last_name):
        super().__init__(first_name,last_name)
        self.privileges = Privileges()

