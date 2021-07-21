(ns rich4clojure.easy.problem-33
  (:require [hyperfiddle.rcf :refer [tests]]))

;; = Replicate a Sequence =
;; By 4Clojure user: dbyrne
;; Difficulty: Easy
;; Tags: [seqs]
;; 
;; Write a function which replicates each element of a
;; sequence a variable number of times.

(comment
  
  )

(tests
 (__ [1 2 3] 2) := (quote (1 1 2 2 3 3))
 (__ [:a :b] 4) := (quote (:a :a :a :a :b :b :b :b))
 (__ [4 5 6] 1) := (quote (4 5 6))
 (__ [[1 2] [3 4]] 2) := (quote ([1 2] [1 2] [3 4] [3 4]))
 (__ [44 33] 2) := [44 44 33 33])

;; Share your solution, and/or check how others did it:
;; https://gist.github.com/3e4dc6bf1479a57ffcd2ef05bdc5bb52