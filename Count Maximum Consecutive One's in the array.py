arr = list(map(int, input("Enter the binary array: ").split()))

max_count = 0
current_count = 0

for num in arr:
    if num == 1:
        current_count += 1
        max_count = max(max_count, current_count)
    else:
        current_count = 0

print("Maximum consecutive 1's:", max_count)
