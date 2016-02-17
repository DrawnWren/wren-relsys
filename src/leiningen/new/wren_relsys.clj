(ns leiningen.new.wren-relsys
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files]]
            [leiningen.core.main :as main]))

(def render (renderer "wren-relsys"))

(defn wren-relsys
  "Component (Reloaded), Schema, and System all wrapped up just the way I like them."
  [name]
  (let [data {:name name
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' wren-relsys project.")
    (->files data
             ["src/{{sanitized}}/core.clj" (render "core.clj" data)]
             ["dev/dev.clj" (render "dev.clj" data)]
             ["dev/user.clj" (render "user.clj" data)]
             ["project.clj" (render "project.clj" data)])))
