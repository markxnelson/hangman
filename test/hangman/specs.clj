(ns hangman.specs
  (:require [clojure.spec.alpha :as s]
            [clojure.spec.gen.alpha :as gen]
            [clojure.spec.test.alpha :as stest]
            [clojure.test.check :as tc]
            [hangman.core :as h :refer
             [letters valid-letter? Player
              random-player shuffled-player]]))

#_(s/fdef hangman.core/new-progress
  :args (s/cat :word ::word)
  :ret ::progress)

(s/def ::letter (set letters))

(s/def ::word
  (s/with-gen
    (s/and string?
         #(pos? (count %))
         #(every? valid-letter? (seq %)))
    #(gen/fmap
       (fn [letters] (apply str letters))
       (s/gen (s/coll-of ::letter :min-count 1)))))
