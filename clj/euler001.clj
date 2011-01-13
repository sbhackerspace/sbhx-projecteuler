; Steve Phillips / elimisteve
; 2011.01.12

(println (apply + (filter #(or (= 0 (mod % 3))
							   (= 0 (mod % 5)))
						  (range 1000))))
