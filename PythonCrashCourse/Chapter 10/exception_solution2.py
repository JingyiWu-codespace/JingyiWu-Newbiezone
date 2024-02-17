from pathlib import Path
filenames = ["cats.txt","dos.txt"]
def readfiles(filenames):
    for filename in filenames:
        print(f"\n Reading file: {filename}")
        path = Path(filename)
        try:
            content = path.read_text()
        except FileNotFoundError:
            pass
        else:
          print(content)

readfiles(filenames)