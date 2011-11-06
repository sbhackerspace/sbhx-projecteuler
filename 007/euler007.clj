; Steve Phillips / elimisteve
; 2011.01.13

(defn gen-primes [p]
  (for [num (range 2 p)
		x (range 2 (inc (/ num 2)))]
	(if (zero? (mod num x))
	  false)
	true))

(take 100 (range))