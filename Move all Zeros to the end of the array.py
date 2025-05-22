arr = list(map(int, input("Enter the elements: ").split()))
result = [num for num in arr if num != 0]  # All non-zero elements
zeros = [0] * (len(arr) - len(result))     # The remaining zeros

print("Array after moving zeros to the end:", result + zeros)
