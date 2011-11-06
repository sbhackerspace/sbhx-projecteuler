(defn even-siv [n]
  (/ n 2))

(defn odd-siv [n]
  (inc (* 3 n)))

(defn siv [n]
  (if (even? n)
    (even-siv n)
    (odd-siv n)))

(defn collatz-chain-length [n]
  (loop [cnt 1 cur n]
    (if (= cur 1)
      cnt
      (recur (inc cnt)
	     (siv cur)))))

(defn max-collatz-chain [max]
  (loop [cnt 2 cur 2 length 0]
    (let [chain (collatz-chain-length cnt)]
    (if (= cnt max)
      (println cur length)
      (if (> chain length)
	(recur (inc cnt)
	       cnt
	       chain)
	(recur (inc cnt)
	       cur
	       length))))))