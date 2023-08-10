(ns daily-coding-problem.problem-476)

(comment
  "This problem was asked by Google.

 You are given an array of length n + 1 whose elements belong to the set {1, 2, ..., n}. 
 By the pigeonhole principle, there must be a duplicate. Find it in linear time and space."
  )

(defn find-duplicate [the-set the-array] 
  (let [sum-of-the-set (reduce + the-set)
        sum-of-the-array (reduce + the-array)]
    (- sum-of-the-array sum-of-the-set)))

(defn find-duplicate-fast [the-set the-array] 
  (let [set-length (count the-set)
        array-length (count the-array)
        sum-of-the-set (/ (* set-length (inc set-length)) 2)
        sum-of-the-array (/ (* array-length (inc array-length)) 2)]
    (- sum-of-the-array sum-of-the-set)))
