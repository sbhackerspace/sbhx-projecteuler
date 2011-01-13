#!/usr/bin/python
# 2009.04.02

# Find the sum of all the multiples of 3 or 5 below 1000.

## First try when I was first learning Python

set = []
mysum = 0

for i in range(1000):
    if i % 3 == 0 or i % 5 == 0:
        set.append(i)

for i in set:
    mysum += i

print mysum

####

## Idiomatic, functional solution

print sum([x for x in range(1000) if x % 3 == 0 or x % 5 == 0])
