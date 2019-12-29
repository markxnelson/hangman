(defproject hangman "0.1.0-SNAPSHOT"
  :description "Hangman"
  :url "http://github.com/markxnelson/hangman"
  :license {:name "none"
            :url "none"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot hangman.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
