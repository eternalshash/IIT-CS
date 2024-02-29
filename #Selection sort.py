#Selection sort


def selectSort(array, size):

    for s in range(size):
        min_idx = s

        for i in range(s + 1, size):
            #Sorting in desending order
            #For mimimum element in each loop
            if array[i] < array[min_idx]:
                min_idx = i

        #arranging min at the correct position
        (array[s], array[min_idx]) = (array[min_idx], array[s])


#driver code

arr = [1 , 9, 8, 12, 94, 19, 24, 82]
size = len(arr)

selectSort(arr, size)
print(arr)

