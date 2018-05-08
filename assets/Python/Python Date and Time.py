#!/usr/bin/python

import time;
import calendar

# Current local time
localtime = time.asctime(time.localtime(time.time()))
print "Current local time :", localtime

# Calender of a month
print "Calender of March, 2012 : "
print calendar.month(2012, 3)
