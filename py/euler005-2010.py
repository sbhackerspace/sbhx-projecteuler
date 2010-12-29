#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2010.03.22

import sys

def lcm_one_through(x):
    f = factorial(x)
    for num1 in factors(f):
        for num2 in factors(f):
            if f % num1 == 0 and f % num2 == 0:
                pass

def gcd(x, y):
    xf = set(factors(x))
    yf = set(factors(y))
    uniq = list(xf.union(yf))
    return reduce(lambda x,y: x*y, uniq)

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

def is_even(x):
    return not x % 2

#print factors(int(sys.argv[1]))

#print lcm_one_through(10) # Should print 2520
