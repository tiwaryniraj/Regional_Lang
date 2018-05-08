#!/usr/bin/python

def PrimeOrNot(num):

    # prime numbers are greater than 1
    if num > 1:
       # check if it is divisible by a smaller number
       for i in range(2,num):
           if (num % i) == 0:
               print num,"is not a prime number"
               break
       else:
           print num,"is a prime number"
           
    # if num<=1, it is not prime
    else:
       print num,"is not a prime number"



#Call method PrimeOrNot(num)
PrimeOrNot(17)
PrimeOrNot(31)
PrimeOrNot(20)
PrimeOrNot(21)
PrimeOrNot(97)
