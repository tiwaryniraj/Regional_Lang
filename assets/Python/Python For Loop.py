#!/usr/bin/python

name = "Python Programming"

print "Loop 1"

for ch in name:
    print ch,

print ""

# iterate using sequence index
print "Loop 2"

len = len(name)

for i in range(len):
    print name[i],

print ""

# else statement with for loop
print "Loop 3"

for ch in name:
    print ch,
else :
        print ""
        print "Third loop completed."
