from pathlib import Path

path = Path("pi_digits.txt")
contents = path.read_text().rstrip()
print(contents)

lines = contents.splitlines()

pi_string = ''

for line in contents.splitlines():
    pi_string+=line.lstrip()
print(pi_string)
