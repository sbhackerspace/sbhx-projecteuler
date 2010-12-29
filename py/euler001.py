#!/usr/bin/python
# 2009.04.02

# Find the sum of all the multiples of 3 or 5 below 1000.

set = [];
sum = 0;

for i in range(1000):
    if i % 3 == 0 or i % 5 == 0:
        set.append(i);

for i in set:
    sum += i;

print sum;
