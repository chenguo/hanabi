(ns hanabi.core
  (:import (hanabi Game)))

(defn -main
  [& args]
  (let [game (Game.)]
    (println "initialized")))
