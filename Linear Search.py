arr=list(map(int, input("Enter the elements: ").split()))
Target=int(input("Enter the number: "))
Found=False
for i in range(len(arr)):
    if arr[i]==Target:
        print(f"Element {Target} is found in index {i}")
        Found=True
        break
if not Found:
    print("Element not found")
