import sys

def add_two_numbers() -> int:
    line = sys.stdin.readline()
    if not line:
        return 0
    a, b = line.strip().split(',')
    return int(a) + int(b)

# do not modify below this line
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())
print(add_two_numbers())