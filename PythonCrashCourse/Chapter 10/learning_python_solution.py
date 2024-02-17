from pathlib import Path
path = Path('learning_python.txt')
content = path.read_text().rstrip()
print(content)
lines = content.splitlines()
for line in lines:
    print(line.replace("Python","Java"))

message = "I really like dogs."
print(message.replace("dogs","cats"))
print(message)

