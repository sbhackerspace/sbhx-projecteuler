; Steve Phillips / elimisteve
; 2011.01.12

(defn sum-multiples [int1 int2 myrange]
  (apply + (filter #(or (= 0 (mod % int1))
						(= 0 (mod % int2)))
				   (range myrange))))

(println (sum-multiples 3 5 1000))
