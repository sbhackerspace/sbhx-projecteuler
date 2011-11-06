; Steve Phillips / elimisteve
; 2011.01.12

(defn sum-multiples [int1 int2 myrange]
  (apply + (filter #(or (= 0 (mod % int1))
						(= 0 (mod % int2)))
				   (range myrange))))

; Print the sum of all multiples of 3 and 5 less than 1000
(println (sum-multiples 3 5 1000))
