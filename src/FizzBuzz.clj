(ns FizzBuzz)
(defn fizzbuzz [number]
  (if (= 0 (rem number 3)) 'fizz number)
)