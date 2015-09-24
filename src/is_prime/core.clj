(ns is-prime.core)

(defn- test-prime
  "Determine if a number is prime by looping through divisors"
  [x]
  (loop [iter 2 top (int (Math/sqrt x))]
    (if (> iter top)
      true
      (if (= 0 (mod x iter))
        false
        (recur (inc iter) top)))))

(defn is-prime
  "Determines if a given integer is prime."
  [x]
  (if (< x 2)
    false
    (test-prime x)))
