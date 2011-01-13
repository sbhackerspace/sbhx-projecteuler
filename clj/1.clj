(defn enumerate-multiples[max & divisors]
    (loop [max multip divisors]
      (when (= max 0) nil)
      (if (some (= 0 (mod max %));;this isn't quite working yet
		divisors))
      (recur (dec max)
	     (conj max multip)
	     (divisors))
      (recur (dec max)
	     multip
	     divisors)))

(defn sum-multiples[max & divisors]
  (apply + (enumerate-multiples max
				divisors)))
  
      