arr1=list(map(int, input("Enter the elements: ").split()))
arr2=list(map(int, input("Enter the elements: ").split()))
union=list(set(arr1+arr2))
print("The sorted union array : ", union)
