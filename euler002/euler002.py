#!/usr/bin/python
# 2009.04.02

# Find the sum of all the even-valued terms in the Fibonacci sequence
# which do not exceed four million.

fib = [0, 1];
sum = 0;

# Create list of fibonacci numbers <= 4 million
for i in range(2,1000): # How do you know 1000 is enough?
    if fib[-1] <= 4000000:
        fib.append(fib[i-1] + fib[i-2]);

#print "\nfib\n", fib;
#print "\nfib[2:-2]\n", fib[2:-1];

for i in fib[2:-1]: # Skips 0, 1, and the last (which is > 4 million)
    if i % 2 == 0:  # Excludes odds
        sum += i;   # Adds evens

print sum;
