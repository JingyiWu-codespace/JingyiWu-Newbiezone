from pathlib import Path
import json

number = [2,3,5,7,11,13]
path = Path('number.json')
contents = json.dumps(number)
path.write_text(contents)