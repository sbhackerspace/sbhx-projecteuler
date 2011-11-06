for a in range(1,1001):
    for b in range(a+1,1001):
        for c in range(b+1,1001):
            if a**2 + b**2 == c**2 and a + b + c == 1000:
                print "%d^2 + %d^2 == %d^2" % (a, b, c)
                print "%d + %d + %d == %d" % (a, b, c, a+b+c)
                print "%d*%d*%d == %d" % (a, b, c, a*b*c)
                import sys
                sys.exit()
