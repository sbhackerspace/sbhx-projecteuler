#!/usr/bin/python
# 2009.04.02

# What is the smallest number that is evenly divisible by all of the
# numbers from 1 to 20?

def factorial(n):
    """Calculate and return n!"""
    product = 1;
    for i in range(1,n+1):
        product *= i;
    return product;
        
def factors(n):
    """Return a set containing the factors of n"""
    flist = [];
    for i in range(1,n+1):
        if n % i == 0:
            flist.append(i);
    return flist;

def coprime(set):
    """Return a set containing the prime factors of the numbers in the
    given set"""
    clist = []
    subfactors = []
    for elt in set:
        
