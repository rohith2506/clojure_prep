(defn my-reduce
  ([initial coll]
   (loop [result initial remaining coll]
         (if (empty? remaining) result
             (recur (+ result (first remaining)) (rest remaining))))))
