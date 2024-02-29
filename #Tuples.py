#Tuples
import random
#Concatentation
"""
def concate_Tuple(tuple1, tuple2):

    print("Tuple 1 before: ", tuple1)
    print("Tuple 2 before: ", tuple2)

    print("Concatenation of both: ", (tuple1 + tuple2))

"""

#Nesting tuple
"""
def nest_Tuple(tuple1, tuple2):
    print("Tuple 1 before: ", tuple1)
    print("Tuple 2 before: ", tuple2)

    print("Nesting of both: ", (tuple1, tuple2))

"""

#Repitition

"""
tuple3 = ('check1',)*4
print(tuple3)
"""

#Slicing Tuple

"""

def slice_Tuple(tuple1, tuple3):
    index1 = int(input("From what value of the tuple(s) index would u like to slice: "))


    sliced = (tuple1[index1:])

    print("Sliced tuple1: ", (sliced))
    print("Sliced tuple3(random tuple): ", (tuple3[index1:]))


"""

#lenth of Tuple

"""
def ln_Tuple(tuple1, tuple2, tuple3):
    print(len(tuple1))
    print(len(tuple2))
    print(len(tuple3))
"""





#driver code

tuple1 = (0, 1 ,2 ,3)
tuple2 = ('check1', 'check2')
tuple3 = tuple(random.sample(range(1, 101), 5))

#ln_Tuple(tuple1, tuple2, tuple3)


#(tuple1, tuple3)
#print("og tuple1: ", tuple1)
print("og random tuple", tuple3)



