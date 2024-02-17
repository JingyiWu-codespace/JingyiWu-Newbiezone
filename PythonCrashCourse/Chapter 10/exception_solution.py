def calcuator(first_number,second_number):

    try:
        sum = int(first_number)+int(second_number)
    except ValueError:
        print("Sorry, I really needed a number.")
    else:
        print(sum)

print("Enter 'q' at any time to quit.\n")

while (True):
    first_number = input("Input first number: ")
    if first_number == 'q':
        break
    second_number = input("Input second number: ")
    if second_number == 'q':
        break

    calcuator(first_number,second_number)