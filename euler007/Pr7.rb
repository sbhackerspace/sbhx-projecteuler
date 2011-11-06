def is_prime(number)
	if number == 1
		return false
	elsif number < 4
		return true
	elsif number%2 == 0
		return false
	elsif number<9
		return true
	elsif number%3 == 0
		return false
		
	else
	#	puts "Busted Through!"	
		@r = (Math.sqrt(number)).floor
		@f = 5
		while @f<=@r
			if number% @f == 0 
				return false
			end
			if number% (@f+2) == 0
			       	return false
		       	end
			@f += 6
		end
		return true
	end
end


def find_prime_number(number)
	@i = 0
	@j = 1
	while @i < (number)
	@j+=1
	 if is_prime(@j)
	 @i+=1
	 puts "Prime number #@i = #@j"
	 end
	end
	puts "Final Prime number " + number.to_s + " = #@j"
	return @i
end

def sum_primes_below(number)
	@i = 1
	@sum = 0
	while @i < (number)
	@i+=1
	 if is_prime(@i)
	 @sum += @i
	# puts "Current Prime: #@i"
	 end
	end
	puts "Final Sum = #@sum"
	return @sum
end

def sum_of_least_consecutive_primes(number)
	@i = 1
	@sum = 0
	@tally = 0
	array = Array.new
	while @sum < (number)
	@i+=1
	 	if is_prime(@i)
	 	@sum += @i
		#	if is_prime(@sum)
	       			puts "Current Prime Sum: #@sum"
		#	end
	 	array.push(@sum)
		end
	end
#	array.reverse.each {|prime_candidate| 
#		for @k in 1..prime_candidate
#			if is_prime(@k)
 #      				if prime_candidate% @k == 0
#					@tally += 1
#				end
#			end
#		end
#		puts "Candidate " + prime_candidate.to_s + " has #@tally primes"
#		@tally = 0
	#	}
	return @sum
end
def show_this_many_primes(number)
end

#find_prime_number(20)
# find_prime_number(10001)
#sum_primes_below(2000000)
sum_of_least_consecutive_primes(1000)

