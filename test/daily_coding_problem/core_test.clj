(ns daily-coding-problem.core-test
  (:require [clojure.test :refer :all]
            [clojure.test.check :refer [quick-check]]
            [clojure.test.check.generators :as gen]
            [clojure.test.check.properties :as prop]
            [clojure.data.json :as json]
            [daily-coding-problem.core :refer :all]))

(for [i (range 10) :let [numbers (range)]]
  (take 10 (drop 10 numbers)))
(def some-numbers (map vec (partition 10 (take 1000 (range)))))

(time
 (gen/sample gen/nat))
(gen/sample (gen/list gen/nat))
(gen/sample
 (gen/let [natural-numbers (gen/return (range))
           ten-numbers (take 10 natural-numbers)]
   ten-numbers))

(gen/return (range))

(gen/sample (gen/fmap (partial take 10) (gen/return (range))))

(gen/sample
 (gen/bind (gen/return (range)) (fn [element] (gen/return (take 10 (drop 10 element))))))

(def ten-numbers 
 (gen/return (rand-nth (partition 10 (take 10000 (range))))))

(dotimes [_ 100] 
  (time (reduce + (gen/generate ten-numbers))))
(dotimes [_ 100]
  (let [numbers (gen/generate ten-numbers)
        numbers-count (count numbers)]
    (time (/ (* numbers-count (inc numbers-count)) 2))))

(map #((juxt count (partial identity)) %)
     (gen/sample
      (gen/let [idx (gen/such-that #(> % 0) gen/small-integer)]
        (take 10000 (range idx (inc (* 10 idx)))))))

(def thousand-numbers
  (gen/let [idx (gen/such-that #(> % 0) gen/small-integer)]
    (take 1000 (range idx (inc (* 10 idx))))))


(take 10 (map (partial + 5) (range)))