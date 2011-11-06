#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2011.08.03

total = 0
for number in range(1000): # Integers 0 through 999
    if number % 3 == 0 or number % 5 == 0:
        total += number  # Equivalent to:  total = total + number

print total
