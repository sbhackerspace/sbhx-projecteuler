#!/usr/bin/env python
# Steve Phillips / elimisteve
# 2011.11.05

print sum([ int(num) for num in str( reduce(lambda x,y: x*y, range(2,101)) ) ])
