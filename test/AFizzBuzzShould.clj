(ns AFizzBuzzShould  (:use clojure.test FizzBuzz))
(deftest return0ForInput0
  (is (= 0  (fizzbuzz 0))))
(deftest return1ForInput1
  (is (= 1  (fizzbuzz 1))))

