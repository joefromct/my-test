(ns my-test.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[my-test started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[my-test has shut down successfully]=-"))
   :middleware identity})
