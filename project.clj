(defproject hanabi "0.0.1-SNAPSHOT"
  :description "Hanabi game player"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [aleph "0.4.0-alpha9"]
                 [manifold "0.1.0-beta5"]
                 [byte-streams "0.2.0-alpha4"]]
  :main hanabi.core
  :java-source-paths ["src/java"])
