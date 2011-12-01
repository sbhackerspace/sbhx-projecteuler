for a in range(1,1001):
    for b in range(a+1,1001):
        for c in range(b+1,1001):
            if a**2 + b**2 == c**2 and a + b + c == 1000:
                print "%d^2 + %d^2 == %d^2" % (a, b, c)
                print "%d + %d + %d == %d" % (a, b, c, a+b+c)
                print "%d*%d*%d == %d" % (a, b, c, a*b*c)
                import sys
                sys.exit()

# --------------- ptone -------------------
# based on original here: http://www.s-anand.net/euler.html
# improved 4.5x through optimization and understanding of the problem through 
# http://anshu-manymoods.blogspot.com/2009/11/solving-project-euler-problem-9-no-code.html

def solve9():
    for a in xrange(1, 500):
        for b in xrange(a, 500):
            c = 1000 - a - b
            if c > 0 and (c*c == a*a + b*b):
                return a*b*c
solve9()
