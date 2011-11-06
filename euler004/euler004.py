#!/usr/bin/python
# 2009.04.02

# Find the largest palindrome made from the product of two 3-digit
# numbers.

trips = [];
for i in range (100,1000):
    for j in range(100,1000):
        trips.append(i*j);

revtrips = trips;
revtrips.reverse();

palin = [];
for i in trips:
    ilist = list(str(i));
    revlist = [];
    for j in ilist:
        revlist.append(j);
    revlist.reverse();
    if ilist == revlist:
        palin.append(i);

print max(palin);

