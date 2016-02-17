(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "Imagine all the people living life in peace"
  :url "Nothing special here."
  :license {:name "La dee da V3"
            :url "http://choosealicense.com.net.org/"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [com.stuartsierra/component "0.3.1"]
                 [prismatic/schema "1.0.4"]]
  :repl-options {:welcome (println "Do I dare?")}
  :profiles {:dev {:dependencies [[org.clojure/tools.namespace "0.2.11"]]
                   :source-paths ["dev"]}})
