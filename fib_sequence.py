import math

n = int(input("How many digits of the fibonacci sequence: "))

arr = [0, 1]

for i in range(n-2):
	arr.append(arr[i] + arr[i+1])
	i+=1


for i in arr:
	print(i, end = ", ")
