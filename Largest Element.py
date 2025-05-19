# Take input from user
numbers = list(map(int, input("Enter numbers separated by spaces: ").split()))

# Find the largest element
largest = numbers[0]
for num in numbers:
    if num > largest:
        largest = num

print("The largest element is:", largest)
