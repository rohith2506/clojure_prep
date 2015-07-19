(def identities 
     [{:alias "demo" :real "demo1"}
      {:alias "demo2" :real "demo22"}])


(defn snitch
      [identity]
      (println (:real identity))
      (:real identity))

(def revealed-identities (map snitch identities))
