(ns AFizzBuzzShould  (:use clojure.test FizzBuzz))
(deftest return1ForInput1
  (is (= 1  (fizzbuzz 1))))
(deftest return2ForInput2
  (is (= 2  (fizzbuzz 2))))

