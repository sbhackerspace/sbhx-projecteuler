#!/usr/bin/env python
# Author: gholms

import operator, sys
print sum([int(c) for c in str(reduce(operator.mul, range(1, int(sys.argv[1]) + 1)))])
