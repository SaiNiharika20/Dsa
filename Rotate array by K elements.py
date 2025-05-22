arr = list(map(int, input("Enter the elements: ").split()))
k = int(input("Enter the number of positions to right rotate: "))

k = k % len(arr)
rotated = arr[-k:] + arr[:-k]

print("Array after right rotation:", rotated)
