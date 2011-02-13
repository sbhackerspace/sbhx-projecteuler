
;; Working, returns true if n = divisible by any divisor given
;; otherwise false
(defn divisible?[number, divisors]
  (loop [n number, divs divisors]
    (if (empty? divs)
      false
      (if (= 0
	     (mod n
		  (first divs)))
	true
	(recur n
	       (next divs))))))

(defn enumerate-multiples[max, divisors]
  (loop [cnt max, multip nil, divs divisors]
    (if (= cnt 0)
      multip
      (if (divisible? cnt
		      divs)
	(recur (dec cnt)
	       (conj multip cnt)
	       divs)
	(recur (dec cnt)
	       multip
	       divs)))))

(defn sum-multiples[max, divisors]
  (apply + (enumerate-multiples max
				divisors)))

(sum-multiples 999
	       (list 3 5))