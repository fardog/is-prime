(ns is-prime.core)

(defn is-prime
  "Determines if a given integer is prime."
  [x]
  (if (< x 2)
    false
    (loop [n (Math/floor (Math/sqrt x))]
      (if (= n 1.0)
        true
        (if (= 0.0 (mod x n))
          false
          (recur (dec n)))))))
