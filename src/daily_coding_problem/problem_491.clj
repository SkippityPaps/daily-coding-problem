(ns daily-coding-problem.problem-491)

(comment "This problem was asked by Palantir.

Write a program that checks whether an integer is a palindrome.
For example, 121 is a palindrome, as well as 888. 678 is not a palindrome.
Do not convert the integer into a string.")

(defn num->digits [num]
  (if (< num 10)
    [num]
    (conj (num->digits (quot num 10)) (rem num 10))))

(defn palindrome? [num]
  (let [digits (num->digits num)]
    (= digits (reverse digits))))

(def maybe-palindrome 1771)
