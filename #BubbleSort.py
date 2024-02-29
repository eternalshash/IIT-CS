#BubbleSort

def bubbleSort(arr):
    
    n = len(arr)
# For loop to traverse through all elements of the array
    for i in range(n):
        for j in range(0, n - i -1):

            # Range of the array is from 0 to n - i -1
            #Swap the elements if/when they are found
            #is greater than the adjacent element
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

#driver

arr = [1 , 9, 8, 12, 24, 19]

bubbleSort(arr)

print("Sorted array is: ")
print(arr)





