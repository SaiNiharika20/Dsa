nums = list(map(int, input("Enter numbers: ").split()))

if not nums:
    print("Empty list")
else:
    first = nums[0]
    unique_nums = list(set(nums))

    if len(unique_nums) < 2:
        second_largest = -1
    else:
        unique_nums.sort()
        second_largest = unique_nums[-2]

    print("First element:", first)
    print("Second largest element:", second_largest)

