(ns daily-coding-problem.problem-476-test
  (:require
   [clojure.test :refer :all]
   [daily-coding-problem.problem-476 :refer :all]))


(def one-through-nine #{1 2 3 4 5 6 7 8 9})

;; make an array of one-through-nine plus a duplicate from the set for each element
(def with-duplicate-1 (conj (vec one-through-nine) 1))
(def with-duplicate-2 (conj (vec one-through-nine) 2))
(def with-duplicate-3 (conj (vec one-through-nine) 3))
(def with-duplicate-4 (conj (vec one-through-nine) 4))
(def with-duplicate-5 (conj (vec one-through-nine) 5))
(def with-duplicate-6 (conj (vec one-through-nine) 6))
(def with-duplicate-7 (conj (vec one-through-nine) 7))
(def with-duplicate-8 (conj (vec one-through-nine) 8))
(def with-duplicate-9 (conj (vec one-through-nine) 9))

;; due to the wording of the problem, the value being searched is guaranteed to be duplicate
;; as it is an element of the original set. 
;; so, we won't have to test for conditions where the value is unique (its not possible)

(deftest duplicate-is-found-when-duplicate-exists
  (is (= 1 (find-duplicate one-through-nine with-duplicate-1)))
  (is (= 2 (find-duplicate one-through-nine with-duplicate-2)))
  (is (= 3 (find-duplicate one-through-nine with-duplicate-3)))
  (is (= 4 (find-duplicate one-through-nine with-duplicate-4)))
  (is (= 5 (find-duplicate one-through-nine with-duplicate-5)))
  (is (= 6 (find-duplicate one-through-nine with-duplicate-6)))
  (is (= 7 (find-duplicate one-through-nine with-duplicate-7)))
  (is (= 8 (find-duplicate one-through-nine with-duplicate-8)))
  (is (= 9 (find-duplicate one-through-nine with-duplicate-9))))

