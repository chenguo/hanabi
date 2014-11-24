(ns hanabi.test-client
  (:require [aleph.tcp :as tcp]
            [hanabi.stream :as s]))

(defn- connect
  [server port]
  @(tcp/client {:host server :port port}))

(defn init
  [server port]
  (let [stream (connect server port)
        handler (s/handle s/print-msg)]
    (handler stream nil)
    stream))
