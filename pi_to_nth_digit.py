import math

print("Enter how many digits of pi you want: ", end = "")
n = int(input())

print(f"Pi to the {n}th digit: ")

pi = "3.1415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679"

arr = list(pi)

final = arr[:n+2]


for i in final:
	print(i, end = "")


