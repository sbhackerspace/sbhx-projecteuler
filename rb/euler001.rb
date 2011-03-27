#!/usr/bin/env ruby
# Steve Phillips / elimisteve

# 2011.03.18 @ 2338
sum = 0
puts (0...1000).find_all {|num| num % 3 == 0 || num % 5 == 0}.map {|num| sum += num}.last

# 2011.03.18 @ 2341
puts (0...1000).find_all {|num| num % 3 == 0 || num % 5 == 0}.inject {|sum, n| sum + n}

# 2011.03.18 @ 2342
puts (0...1000).find_all {|num| num % 3 == 0 || num % 5 == 0}.reduce(0, :+)

# 2011.03.23 @ 0103
puts (0...1000).select {|n| n%3 == 0 || n%5 == 0}.inject(0) {|sum, n| sum + n}

# 2011.03.23 @ 0112
puts (0...1000).select {|n| n%3 == 0 || n%5 == 0}.reduce(:+)
