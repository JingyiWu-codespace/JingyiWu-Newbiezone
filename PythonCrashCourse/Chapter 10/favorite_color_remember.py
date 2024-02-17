from pathlib import Path
import json
path = Path('colors.json')
def write_color():
    colors = input("What is your favorite color? ")
    contents = json.dumps(colors)
    path.write_text(contents)
    return colors

def read_color():
    if path.exists():
        contents = path.read_text()
        colors = json.loads(contents)

        return colors



def color_remember():
    if read_color():
        color = read_color()
        print(f"I Knwo your favorite color {color}")
    else:
        color = write_color()
        print(f"I store your favorite color {color}")

color_remember()