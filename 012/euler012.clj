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
		   (if (even? tnum)
			 (+ 2  ; 1 and n also divide n
				(count (filter #(zero? (mod tnum %))
							   (range 2 (inc (/ tnum 2))))))
			 (+ 2
				(count (filter #(zero? (mod tnum %))
							   (range 3 (inc (/ tnum 3))))))))))

(defn triangle-divisors-over [n]
  (first (filter #(> (first (vals %)) n)
				 (triangle-divisors))))

(time (triangle-divisors-over 5))
(time (triangle-divisors-over 500))
