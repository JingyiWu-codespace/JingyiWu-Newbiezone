from pathlib import Path
path = Path("guest_book.txt")
guest_names = []
while (True):

    guest_name = input("Welcome, What's your name: ")
    if guest_name=='q':
        break

    print(f"Thanks {guest_name},we'll add you to the guest book.")
    guest_names.append(guest_name)

file_string =''
for guest_name in guest_names:
    file_string += f"{guest_name}\n"

path.write_text(file_string)


