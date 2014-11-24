(ns hanabi.stream
 (:require [manifold.stream :as s]
           [byte-streams :as bs]))

(defn handle
  [handler]
  (fn [stream src]
    (let [msg-handler (partial handler stream src)]
      (s/consume msg-handler stream))))

(defn print-msg
  [stream src msg]
  (println (bs/to-string msg)))

(defn ack-msg
  [stream _ _]
  (s/put! stream "received"))
