(ns is-prime.core-test
  (:require [clojure.test :refer :all]
            [is-prime.core :refer :all]))

(deftest is-prime-test 
  (testing "Knows what is a prime number"
    (is (is-prime 2))
    (is (is-prime 3))
    (is (is-prime 5))
    (is (is-prime 7))
    (is (is-prime 12853))
    (is (is-prime 10000079))))

(deftest is-not-prime-test
  (testing "Knows what's not a prime number"
    (is (not (is-prime 0)))
    (is (not (is-prime 1)))
    (is (not (is-prime 4)))
    (is (not (is-prime 10000)))
    (is (not (is-prime 12854)))
    (is (not (is-prime 10000000)))))
