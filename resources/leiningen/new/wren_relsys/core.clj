(ns {{name}}.core
    (:require [com.stuartsierra.component :as component]))


(defn system
  "I don't do a whole lot."
  [config-file]
  (let [config (read-string (slurp config-file))]
    ;;do some configuring
    nil))
