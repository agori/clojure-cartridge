(defproject clojureapp "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [compojure "1.1.6"]
                 [ring/ring-json "0.2.0"]]
  :plugins [[lein-ring "0.8.10"]]
  :ring {:handler webapp/app})
