(def vampire-database 
     {0 {:makes-blood-puns? false, :has-pulse? false, :name "rohith"}
      1 {:makes-blood-puns? false, :has-pulse? true,  :name "rahul" }
      2 {:makes-blood-puns? true,  :has-pulse? false, :name "deepthi" }
      3 {:makes-blood-puns? true,  :has-pulse? true,  :name "prem" }})

(defn vampire-related-details 
      [social-security-numbers]
      (Thread/sleep 1000)
      (get vampire-database social-security-numbers))

(defn vampire?
      [record]
      (and (:makes-blood-puns? record)
           (not (:has-pulse? record))))

(defn identify-numbers 
      [social-security-numbers]
      (first (filter vampire? 
                     (map vampire-related-details social-security-numbers))))
