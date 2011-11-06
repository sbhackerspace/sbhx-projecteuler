for x in range(1000-4):
    product = int(numster[x])*int(numster[x+1])*int(numster[x+2])*int(numster[x+3])*int(numster[x+4])
    if product > max:
        max = product
        

print max
