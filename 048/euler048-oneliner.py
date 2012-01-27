#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2012.01.27

# Problem: http://projecteuler.net/problem=48
# Print last 10 digits of the sum 1**1 + 2**2 + 3**3 + ... + 10**10

# Only works of summation is at least 10 digits long
print str(sum(x**x for x in range(1, 11)))[-10:]
