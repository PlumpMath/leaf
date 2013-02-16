
(ns leaf.core)

(defn show
  "Log a message using logger level for the specified arguments"
  [logger args]
  (let [loggable  #(if (satisfies? cljs.core.ISeqable %)
                       (pr-str %)
                       %)]
    (.apply logger 
            js/console
            (into-array (map loggable args)))))

(defn debug [& args]
  (show (.-debug js/console) args))

(defn log [& args]
  (show (.-log js/console) args))

(defn info [& args]
  (show (.-info js/console) args))

(defn warn [& args]
  (show (.-warn js/console) args))

(defn error [& args]
  (show (.-error js/console) args))

