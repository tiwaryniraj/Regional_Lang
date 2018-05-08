#!/usr/bin/python

class Books:
    totalBooks = 0

    def __init__(self, name, id):
        self.name = name
        self.id = id
        Books.totalBooks += 1

    def totalNumberOfBooks(self):
        print "Total Books : ", Books.totalBooks

    def bookInformation(self):
        print "Book name : ", self.name, ", Book id : ", self.id



book1 = Books("ABC", 12);
book2 = Books("BCD", 07);

book1.bookInformation()
book2.bookInformation()

print "Total number of Books : ", Books.totalBooks
