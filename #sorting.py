#sorting

import random
from array import array

def sort_Way(list1):
    n = len(list1)

    for i in range(n):
        for j in range(0, n - i -1):
            if list1[j] > list1[j + 1]:
                (list1[j], list1[j + 1]) = (list1[j + 1], list1[j])
    
    print("Sorted list: ", list1)



list1 = random.sample(range(0,101), int(random.uniform(5,10)))
size = len(list1)

print("List before sorting: ", list1)
sort_Way(list1)





#Bubble Sort
"""
    n = len(list1)

    for i in range(n):
        for j in range(0, n - i - 1):
            if list1[j] > list1[j + 1]:
                (list1[j], list1[j + 1]) = (list1[j + 1], list1[j])
    
    print("Sorted list(least to greatest: )", list1)
"""

#insertion sort
""""

    for i in range(1, len(list1)):
        a = list1[i]

        j = i - 1

        while j >= 0 and a < list1[j]:
            list1[j + 1] = list1[j]
            j -= 1 
        
        list1[j + 1] = a

    print(list1)
    #outer loop from range 1 to lenght of the list
    # a value will be the list[i]
    # move elements of list1[0 to i -1]
    # j value is the i - 1
    # while loop with j >= 0 and a < list[j]
    # list1[j + 1 ] = list1[j]
    # j -= 1
    #set the list value j + 1 = a
    # return the list

"""