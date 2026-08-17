from typing import List

def read_integers() -> List[int]:
    line = input()
    string_list = line.split(",")
    return [int(x) for x in string_list]

# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())