; Steve Phillips / elimisteve
; 2011.01.23

(defn triangle-nums
  "Returns infinite seq of triangle numbers"
  []
  (for [x (range)]
	(apply + (range 1 (+ 2 x)))))

(defn triangle-divisors []
  (for [tnum (triangle-nums)]
	(assoc {} tnum
		   (+ 2  ; 1 and n also divide n
			  (if (even? tnum)  ; skip 2 and n/2
				(+ 2 (count (filter #(zero? (mod tnum %))
									(range 3 (inc (/ tnum 3))))))
				(count (filter #(zero? (mod tnum %))
							   (range 3 (inc (/ tnum 3))))))))))
(sort vals
	  (take 20 (triangle-divisors)))

(defn triangle-divisors-over [n]
  (first (filter #(> (first (vals %)) n)
				 (triangle-divisors))))

(time (triangle-divisors-over 6))
(time (triangle-divisors-over 500))
