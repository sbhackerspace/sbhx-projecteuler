#!/usr/bin/python
# 2009.04.02

# What is the smallest number that is evenly divisible by all of the
# numbers from 1 to 20?

def factorial(n):
    product = 1;
    for i in range(1,n+1):
        product *= i;
    return product;
        
def factors(n):
    flist = [];
    for i in range(1,n+1):
        if n % i == 0:
            flist.append(i);
    return flist;

def smalldiv():
    number = int(raw_input("Number: "));
    #number = 3;
    #biglist = factors(factorial(number))
    biglist = range(1,factorial(number)+1);
    for i in biglist:
        for j in biglist:
            if j % i != 0:
                biglist.remove(j);
    return biglist;

print smalldiv();
