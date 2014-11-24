(ns hanabi.server
  (:require [aleph.tcp :as tcp]
            [hanabi.stream :as s]))

(defn server-handler
  [& args]
  (apply s/ack-msg args)
  (apply s/print-msg args))

(defn start-server
  [port]
  (let [handler (s/handle server-handler)]
    (tcp/start-server handler {:port port})))

(def ^:const port 10000)

(defn -main
  [& args]
  (start-server port))
