; Steve Phillips / elimisteve
; 2011.01.22

(defn triangle-nums
  "Returns infinite seq of triangle numbers"
  []
  (for [x (range)]
	(apply + (range 1 (+ 2 x)))))

; Counts number of factors in triangle-nums, then
; returns first number of factors over 500
(time (first (filter #(>= % 500)
					 (for [tnum (triangle-nums)]
					   (count (filter #(zero? (mod tnum %))
									  (range 1 (inc (/ tnum 2)))))))))

; Not lazy
;; (first (filter #(>= % 500)
;; 			   (take 1000000
;; 					 (for [tnum (triangle-nums)]
;; 					   (count (filter #(zero? (mod tnum %))
;; 									  (range 1 (inc (/ tnum 2)))))))))

		;; (filter (zero? (mod tnum %)
		;; 			   (range 1 (inc (/ tnum 2))))))
