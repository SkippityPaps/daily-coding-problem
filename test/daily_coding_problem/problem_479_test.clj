(ns daily-coding-problem.problem-479-test
  (:require [clojure.math.combinatorics :as c]
            [clojure.test :refer [deftest is]]
            [clojure.test.check :as tc]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [daily-coding-problem.problem-479 :refer [permutations]]))

(deftest are-permutations-same? 
  (is (= (c/permutations [1 2 3]) (permutations [1 2 3]))))