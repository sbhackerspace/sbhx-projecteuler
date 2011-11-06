; Steve Phillips / elimisteve
; 2011.03.16

;; (loop [row-len (inc row-num)
;; 	   row-num (range (count triangle))
;; 	   total   0]
;;   (if (> (get-num row-num ))
;; 	  )
;;   )

(def triangle
	 [[75]
	  [95 64]
	  [17 47 82]
	  [18 35 87 10]
	  [20  4 82 47 65]
	  [19  1 23 75  3 34]
	  [88  2 77 73  7 63 67]
	  [99 65  4 28  6 16 70 92]
	  [41 41 26 56 83 40 80 70 33]
	  [41 48 72 33 47 32 37 16 94 29]
	  [53 71 44 65 25 43 91 52 97 51 14]
	  [70 11 33 28 77 73 17 78 39 68 17 57]
	  [91 71 52 38 17 14 91 43 58 50 27 29 48]
	  [63 66  4 68 89 53 67 30 73 16 69 87 40 31]
	  [ 4 62 98 27 23  9 70 98 73 93 38 53 60  4 23]])

(defn get-num [row col]
  ((triangle row) col))

(require '(clojure [zip :as zip]))
;(use 'clojure.zip)
(def my-data triangle)
(def my-vzip (zip/vector-zip my-data))
(def tri-tree (zip/vector-zip my-data))

(defn right [row col]
	 [(inc row) (inc col)])

(defn left [row col]
	 [(inc row) col])

(defn right-num [row col]
  (apply get-num (right row col)))

(defn left-num [row col]
  (apply get-num (left row col)))

(left-num 0 0)  ; 95
(right-num 0 0) ; 64

;; (defstruct tree-node :left :right :value)



;; (for [row-num (range (count triangle))]
;;   (let [row-len (inc row-num)]
;; 	(for [point (triangle row-num)]
	  
;; 	  )
;;   )
;; )

(-> my-vzip node)
; [[[1 4] [7 9]] [2 8]]

(-> my-vzip node)
