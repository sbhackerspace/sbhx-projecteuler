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

def coprime(list):
    newlist = [];
    for i in list:
        newlist.append(i);
    for i in list:
        for j in newlist:
            if j % i != 0:
                newlist.remove(j);
    return newlist;

def smalldiv():
    number = int(raw_input("Number: "));
#range(1,number+1);
    for i in range(1,number+1): # 1 2 3
        for j in biglist: # 1 2 3 4 5 6
            if j % i != 0:
                biglist.remove(j);
    return biglist;

#print smalldiv();
