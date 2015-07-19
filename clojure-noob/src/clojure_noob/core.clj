;;; Learning Clojure 
(defn needs-matching-part? 
      [part]
      (re-find #"^left-" (:name part)))

(defn make-matching-part 
      [part]
      {:name (clojure.string/replace  (:name part) #"^left-" "right-")
       :size (:size part)})


(defn symmetrize-body-parts
  [asym-body-parts]
  (loop [remaining-asym-body-parts asym-body-parts final-body-parts []]
        (let [[part &  remaining] remaining-asym-parts
              final-body-parts (conj final-body-parts part)]
              (if (needs-matching-part? part)
                  (recur remaining (conj final-body-parts (make-matching-part part)))
                  (recur remaining final-body-parts)))))

  
(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

(symmetrize-body-parts asym-hobbit-body-parts)
