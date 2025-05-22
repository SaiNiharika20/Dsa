arr = list(map(int, input("Enter the elements: ").split()))

unique = 0
for num in arr:
    unique ^= num  # XOR cancels out duplicates

print("The number that appears once is:", unique)
