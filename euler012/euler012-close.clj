; Steve Phillips / elimisteve
; 2011.01.22

(defn triangle-nums
  "Returns infinite seq of triangle numbers"
  []
  (for [x (range)]
	(apply + (range 1 (+ 2 x)))))

(defn triangle-nums-start
  "Returns infinite seq of triangle numbers beginning at the nth"
  [n]
  (for [x (range)]
	(apply + (range 1 (+ 2 x n)))))

;; ; Counts number of factors of each number in triangle-nums, then
;; ; returns first number of factors over 500.  Problem: doesn't say
;; ; _which_ triangle number has > 500 divisors
;; (first (filter #(>= % 500)
;; 			   (for [tnum (triangle-nums)]
;; 				 (count (filter #(zero? (mod tnum %))
;; 								(range 1 (inc (/ tnum 2))))))))

(defn triangle-divisors-first-start [n start]
  (for [tnum (take n (triangle-nums-start start))]
	(assoc {} tnum
		   (+ 2  ; 1 and n also divide n
			  (count (filter #(zero? (mod tnum %))
							 (range 2 (inc (/ tnum 2)))))))))

(defn triangle-divisors []
  (for [tnum (triangle-nums)]
	(assoc {} tnum
		   (+ 2  ; 1 and n also divide n
			  (count (filter #(zero? (mod tnum %))
							 (range 2 (inc (/ tnum 2)))))))))


(time
 (first (filter #(> (apply + (vals %)) 500)
				(triangle-divisors)))
)


(filter #(> (second %) 100)
		(apply concat
			   (take 5000 (triangle-divisors))))


;; (filter #(> (second %) 100)
;; 		(lazy-seq (reverse (sort-by second
;; 									(apply concat
;; 										   (take 500 (triangle-divisors)))))))

;(reduce conj (triangle-divisors-first-start 5))

;; Not lazy, apparently
(take 5 (apply max-key second (apply concat (triangle-divisors))))

;; The final answer should be calculated as thus
(triangle-divisors-over 500)
; [249129412 502]


;; (defn triangle-divisors-over [n]
;;   (for [tnum (take n (triangle-nums))]
;; 	(apply assoc {}
;; 		   (interleave (range tnum)
;; 					   (count (filter #(zero? (mod tnum %))
;; 									  (range 1 (inc (/ tnum 2)))))))))

