from pathlib import Path
import json
path = Path('colors.json')
def write_color():
    colors = input("What is your favorite color? ")
    contents = json.dumps(colors)
    path.write_text(contents)

def read_color():
    if path.exists():
        contents = path.read_text()
        colors = json.loads(contents)

        print(f"I know your favorite color!! it's {colors}")

read_color()