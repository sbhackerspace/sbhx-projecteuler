#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2010.03.22
# 2011.07.16 (modified; removed crap)

def factors(x):
    factors = []
    for num in range(1, x/2 + 1):
        if x % num == 0:
            factors.append(num)
    factors.append(x)
    return factors

def factorial(x):
    return reduce(lambda x,y: x*y, range(2, x+1))

def is_prime(x):
    for num in range(2, x/2 + 1):
        if x % num == 0:
            return False
    return True
