(ns daily-coding-problem.problem-482)

(comment "This problem was asked by Google.

 Given a binary search tree and a range [a, b] (inclusive),
 return the sum of the elements of the binary search tree within the range.")

(defn binary-search [node lower upper acc]
  (if-let [[value left right] node]
    (cond
      (< value lower) (binary-search right lower upper acc)
      (> value upper) (binary-search left lower upper acc)
      :else (+ value
               (binary-search left lower upper acc)
               (binary-search right lower upper acc)))
    acc))
