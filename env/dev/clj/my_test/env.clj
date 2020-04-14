(ns my-test.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [my-test.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[my-test started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[my-test has shut down successfully]=-"))
   :middleware wrap-dev})
