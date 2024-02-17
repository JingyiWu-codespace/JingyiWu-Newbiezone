def display_message():
    print("i am learning the chapter 8 of python crash course")

def favorite_book( title):
    print(f"my favorite book {title.title()}")

def t_shirt(size="LARGE",msg="I love python"):
    print(f"your size is: {size},the message is: {msg}")

t_shirt("M","I AM GOOD")
t_shirt(size="M",msg="I AM VERY GOOD")
t_shirt(size="M")

def describe_city(city,county="CHINA"):
    print(f"{city} in {county}")
describe_city("Peking")
describe_city("Tokoy","Japan")

def city_country(city,country):
    return city+", "+country

us = city_country("Santiago","Chile")
cn = city_country("Shanghai","China")
uk = city_country("London","UK")
cities = [us,cn,uk]
#flag = 3
#while flag:
#    print("\n Please tell me the city and country")
#    city = input("the city:")
#    country = input ("the country:")
#    print(city_country(city.title(),country.title()))
#    flag -=1

def make_album(artist_name,album_title,num_songs = None):
    albums = {"artist_name":artist_name,    "album_title":album_title,}
    if num_songs:
        albums["num_songs"]=num_songs
    return albums

albums_dict = []
num = 0
#while True:
    #artist_name = input("please input th artist_name:")
    #if artist_name == "q":
        #break;
    #album_title = input("please input th album_title:")
    #if album_title == "q":
        #break;
    #num_songs = input("please input th num_song:")
    #if num_songs == "q":
        #break;
    #if num > 2:
        #break
    #album = make_album(artist_name, album_title, num_songs)
    #albums_dict.append(album)
    #num += 1
    #print(f"已经添加{num}首",albums_dict,)
    #if num > 2:
        #break

msg=['hello everyone','love you','you are so excellent']
def show_message(msg_list):
    for i in msg_list:
        print(i)

show_message(msg)

def send_message(msg_list):
    send_msg = []
    for i in msg_list:
        send_msg.append(i)
    for h in send_msg:
        print(h)
send_message(msg[:])

def sandwiched(*topping):
    print(topping)
sandwiched("鸡肉三明治","火腿三明治")

def build_profile(first,last,**user_info):
    user_info['name']=first
    user_info['surname'] = last
    return user_info

print(build_profile("Jennie","Wu",location='be',field='CS'))
