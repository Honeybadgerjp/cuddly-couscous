filename = 'pi_million_digits.txt'

with open(filename) as file_object:
    lines = file_object.readlines()

"""
for line in lines:
    print(line.rstrip())
"""

p1_string = ''
for line in lines:
    p1_string += line.strip()

birthday = input("Enter your birthday, in the form mmddyy: ")
if birthday in p1_string:
    print("Your birthday appears in the first million digits of pi!")
else:
    print("Your birthday does not appear in the first million digits of p1.")

"""
print(f"{p1_string[:52]}...")
print(len(p1_string))
"""
