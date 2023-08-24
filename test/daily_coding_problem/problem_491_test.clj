(ns daily-coding-problem.problem-491-test
  (:require [daily-coding-problem.problem-491 :refer :all]
            [clojure.test :refer [deftest testing is]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as props]))

(deftest num->digit-test
  (testing
   "Given a number, 1234, return a collection, [1 2 3 4]"
    (is (= [1 2 3 4] (num->digits 1234))))
  (testing
   "Given a number, 4321, return a collection, [4 3 2 1]"
    (is (= [4 3 2 1] (num->digits 4321))))
  (testing
   "Given a number, 0, return a single-element collection containing 0."
    (is (= [0] (num->digits 0)))))

(deftest palindrome-test
  (testing "True for single digit numbers. Always."
    (is (palindrome? 0))
    (is (palindrome? 1))
    (is (palindrome? 2))
    (is (palindrome? 3))))

(gen/sample gen/nat)

(clojure.test/run-test palindrome-test)
