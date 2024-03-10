def is_good_array(nums: list):
    max_num = nums[0]
    min_num = nums[-1]
    for num in nums[1:]:
        if num >= max_num or num <= min_num:
            return False
        max_num = num
    return True


N = int(input())
nums = list(map(int, input().split()))
first = nums[0]
last = nums[-1]
if first > last:
    print("Yes")
else:
    if is_good_array(nums):
        print("Yes")
    else:
        print("No")
