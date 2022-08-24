(ns cljs-demo.core
  (:require ["color" :as color]))

(defn my-color []
  (-> (color "#7743CE")
      (.alpha 0.5)
      (.lighten 0.5)
      (.hsl)))

#_{:clj-kondo/ignore [:clojure-lsp/unused-public-var]}
(defn main []
  (println "Cljs is awesome!" (str (my-color))))


(comment
  (js/console.log (clj->js {:a 1}))
  (-> (color "#7743CE")
      (.alpha 0.5)
      (.lighten 0.5)
      (.hsl)))
