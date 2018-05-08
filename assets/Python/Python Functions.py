#!/usr/bin/python

def SumValue(a, b):
    sum = a + b
    return sum


def HelloFunction(Name):
    print "Hello ", Name, ", how are you?"
    return

def PrintNameAndAge(Name, Age = 30):
    print "Name : ",Name,", Age : ",Age
    return

sum = SumValue(12, 7)
print "Sum is : ", sum

HelloFunction("Tim")

PrintNameAndAge("Tim", 25)
PrintNameAndAge("Tim")
