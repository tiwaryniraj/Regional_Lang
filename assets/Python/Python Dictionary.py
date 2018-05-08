#!/usr/bin/python

#Python dictionary

dict = {
    'Age': 30,
    'Name': 'Tim',
    'Place': 'Earth'
};

print "dict['Name']: ", dict['Name']
print "dict['Age']: ", dict['Age']
print "dict['Place']: ", dict['Place']

# Update dictionary
dict['Place'] = 'Pluto'

print "dict (after update) : ", dict

# delete an entry from dictionary
del dict['Age']

print "dict (after deletion of an entry) : ", dict

# string representation of a dictionary
print "String representation : ", str(dict)

# print all keys
print "All keys : ", dict.keys()

# print all values
print "All values : ", dict.values()
