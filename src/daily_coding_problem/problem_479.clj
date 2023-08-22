(ns daily-coding-problem.problem-479)

(comment
  "This problem was asked by Microsoft.

Given a number in the form of a list of digits, return all possible permutations.

For example, given [1,2,3], return [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]].")

(defn permutations [xs]
  (if (not (next xs))
    (list xs)
    (for [x xs
          y (permutations (remove #{xs} x))]
      (cons x y))))
