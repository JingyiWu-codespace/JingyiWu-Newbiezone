class User:
    def __init__(self,first_name,last_name):
        self.first_name = first_name
        self.last_name = last_name
        self.age = None
        self.gender = None
        self.login_attempts = 0

    def describe_user(self):
        print(f"here is information: {self.first_name} {self.last_name} {self.age} {self.gender}")
    def greet_user(self):
        print(f"hello {self.last_name} {self.first_name}")

    def incre_login_attempts(self,counts):
        self.login_attempts += counts
    def reset_login_attempts(self):
        self.login_attempts = 0
