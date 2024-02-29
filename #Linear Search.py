#Linear Search
import random
from array import array

#random array random.sample(range, int(random.uniform))
#random number to look for random uniform
#for loop with range 0 to n 
#nested if look with arr[] being compared to the x value
#if found return the i
# otherwise return -1 

#driver code
#IF __NAME__ == "__MAIN__":
#setup random array
#setup number to find
#n will be arr len
# result will be equal to the index of where the element is located 
#if result is -1 then not in array 
#else it is and the result

def lin_search(arr, x, n):
    #arr.append(x)
    print("array before sorting: ", arr)
    print("Value to look for: ", x)

    for i in range(0, n):
        if (arr[i] == x):
            return i
    return -1



if __name__ == "__main__":
    arr = random.sample(range(0,101), int(random.uniform(5, 10)))
    x = int(random.uniform(0, 100))
    n = len(arr)

    result = lin_search(arr, x, n)

    if (result == -1):
        print("Element not found")
    else:
        print("Element found at: ", result)








