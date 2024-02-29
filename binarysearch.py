#binary search
from array import array
import random

def b_search(arr, l, r, x):
    while 1 <= r:
        mid = l + (r - 1) // 2

        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            l = mid + 1
        else:
            r = mid - 1

    return -1


if __name__ == "__main__":
    arr = random.sample(range(0,101), int(random.uniform(5,10)))
    x = int(random.uniform(0, 101))

    result = b_search(arr, 0, len(arr) -1 , x)
    if result != -1:
        print("Element is present at index: ", result)
    else:
        print("Element is not present in array")

    