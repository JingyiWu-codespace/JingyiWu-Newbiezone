from pathlib import Path

path = Path('alice.txt')
contents = path.read_text().splitlines()
count = 0
for content in contents:
    count += content.lower().count('the')
print(count)