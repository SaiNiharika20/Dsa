arr=list(map(int, input("Enter the elements: ").split()))
n=len(arr)+1
total=n*(n+1)//2 #sum of 1 to n
missing=total-sum(arr)
print("The missing number is: ", missing)
