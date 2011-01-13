(defn divisible?[number & divisors]
  (loop [n number divs divisors]
    (if (= 0
	   (mod n
		(first divs)))
    true
    (recur n
	   (last divs)))))


(defn enumerate-multiples[max & divisors]
    (loop [cnt max, multip nil, divs divisors]
      (when (= cnt 0)
	nil)
      (if (divisible? cnt
		      divs)
      (recur (dec cnt)
	     (conj cnt multip)
	     (divs))
      (recur (dec cnt)
	     multip
	     divs))))
   
(defn sum-multiples[max & divisors]
  (apply + (enumerate-multiples max
				divisors)))
  
      