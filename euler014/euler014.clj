; Steve Phillips / elimisteve
; 2011.02.11

(defn next-in-chain [start]
  (if (even? start)
	(/ start 2)
	(inc (* 3 start))))

(defn create-chain [start-num]
  (loop [num start-num length 1]
	(if (= num 1)
	  [start-num length]
	  (recur (next-in-chain num)
			 (inc length)))))

(defn create-all-chains [max-num]
  (for [start-num (range 2 max-num)]
	(create-chain start-num)))

(defn find-longest-chain [max-num]
  (apply max-key #(second %)
		 (create-all-chains max-num)))


(find-longest-chain 1000)
(find-longest-chain 1000000)
