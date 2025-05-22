arr=list(map(int, input("Enter the elements: ").split()))
unique=[]
for num in arr:
    if not unique or unique[-1]!= num:
        unique.append(num)
print("Resulting array = ", unique)

