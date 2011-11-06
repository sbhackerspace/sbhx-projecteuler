#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2011.11.05

# Calculate 100!
factorial = reduce(lambda x,y: x*y, range(2,101))

# Sum of digits in str(100!) after converted to ints
print sum([ int(num) for num in str(factorial) ])
