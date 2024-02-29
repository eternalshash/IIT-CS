#insertion sort

import random

def insertion_sort(list1):
    #outer loop to traverse on len(list1)
    for i in range(1, len(list1)):
        
        a = list1[i]

        # Move elements of list2[0 to i - 1]
        # move the greater ones to the one position
        # ahead of current position


        j = i - 1

        while j >= 0 and a < list1[j]:
            list1[j + 1] = list1[j]
            j -= 1

        list1[j + 1] = a

    return list1


#random_unsorted_list = random.sample(range(1, 101), 10)

list1 = random.sample(range(1, 101), 10)

print("Unsorted list: ", list1)

print("Sorted list", insertion_sort(list1))

        