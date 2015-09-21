(ns is-prime.core)

(defn- test-prime
  "Determine if a number is prime by looping through divisors"
  [x]
  (loop [n (int (Math/sqrt x))]
    (if (= n 1)
      true
      (if (= 0 (mod x n))
        false
        (recur (dec n))))))

(defn is-prime
  "Determines if a given integer is prime."
  [x]
  (if (< x 2)
    false
    (test-prime x)))
