#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2011.01.12

def gcd(x, y):
    if y == 0:
        return x
    else:
        return gcd(y, x%y)

def lcm(x, y):
    return x*y / gcd(x, y)

print reduce(lcm, range(1, 21))
