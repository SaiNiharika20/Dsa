def longest_subarray_with_sum_k(arr, k):
    left = 0
    curr_sum = 0
    max_len = 0

    for right in range(len(arr)):
        curr_sum += arr[right]

        while curr_sum > k:
            curr_sum -= arr[left]
            left += 1

        if curr_sum == k:
            max_len = max(max_len, right - left + 1)

    return max_len


