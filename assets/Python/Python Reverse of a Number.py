#!/usr/bin/python

def Reverse(num):
    sum = 0
    while (num > 0):
        rem = num % 10
        num = num / 10
        sum = (sum * 10) + rem

    return sum


print "Reverse of 12345 : ", Reverse(12345)
print "Reverse of 1947 : ", Reverse(1947)
print "Reverse of 4321 : ", Reverse(4321)
print "Reverse of 24689 : ", Reverse(24689)
print "Reverse of 76543 : ", Reverse(76543)
