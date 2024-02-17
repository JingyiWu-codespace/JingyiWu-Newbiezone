from pathlib import Path
import json

def get_stored_username(path):
    """get stored username if avaliable"""

    if path.exists():
        contents = path.read_text()
        user_dict = json.loads(contents)
        return user_dict
    else :
        return None

def get_new_username(path):

    username = input("What is your name? ")
    age = input("How old are you? ")
    user_dict = {
        'name':username,
        'age':age,
    }
    contents = json.dumps(user_dict)
    path.write_text(contents)
    return user_dict

def greet_user():
    """Greet the user by name"""
    path = Path('user_info.json')
    user_dict = get_stored_username(path)
    if user_dict:
        verify = input(f"It's your correct name {user_dict['name']}?  y/n \n")
        if verify == 'y':
            print(f"WELCOME BACK,{user_dict['name']}{user_dict['age']}")
            return



    user_dict = get_new_username(path)
    msg = f"We'll remember you when you return, {user_dict['name']}!"
    print(msg)





greet_user()