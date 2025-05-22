arr = list(map(int, input("Enter the elements: ").split()))

# Left rotate by one
first = arr.pop(0)
arr.append(first)

print("Array after left rotation:", arr)
