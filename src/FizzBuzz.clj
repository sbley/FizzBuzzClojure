(ns FizzBuzz)
(defn fizzbuzz 
  "Returns the input number, but for multiples of 3 it returns 'fizz' 
  and for multiples of 5 it returns 'buzz'."
  [number]
  (if (= 0 (rem number 3)) 'fizz (if (= 0 (rem number 5)) 'buzz number))
)