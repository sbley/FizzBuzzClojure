(ns AFizzBuzzShould  (:use clojure.test FizzBuzz))
(deftest return0ForInput0
  (is (= 0  (fizzbuzz 0))))

