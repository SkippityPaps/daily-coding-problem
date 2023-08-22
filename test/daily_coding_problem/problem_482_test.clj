(ns daily-coding-problem.problem-482-test
  (:require [daily-coding-problem.problem-482 :refer :all]
            [clojure.test :refer [testing is deftest]]))

(def example-one
  '(10 (5 (3 nil nil) (7 nil nil)) (15 nil (18 nil nil))))
(def example-two
  '(10 (5 (3 (1 nil nil) nil) (7 (6 nil nil) nil)) (15 (13 nil) (18 nil))))

(deftest given-examples-yield-expected-output
  (testing
   "The sum of node values within the range of 7-15 (inclusive), when
    searching the tree 'example one', is 32."
    (is (= 32 (binary-search example-one 7 15 0))))
  (testing
   "The sum of node values within the range of 6-10 (inclusive), when
    searching tree 'example-two', is 23."
    (is (= 23 (binary-search example-two 6 10 0)))))
