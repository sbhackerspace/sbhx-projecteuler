#!/usr/bin/python
# 2009.04.02

# What is the largest prime factor of the number 600851475143 ?

def find_divisors(n):
    divs = [];
    for i in range(1,n+1):
        if n % i == 0:
            divs.append(i);
    return divs;

def isprime(n):
    if find_divisors(n) == [1, n]:
        return True;
    else:
        return False;

def find_primes(n):
    primes = [];
    for i in find_divisors(n):
        if isprime(i):
            primes.append(i);
    return primes;

print find_primes(600851475143)[-1];
