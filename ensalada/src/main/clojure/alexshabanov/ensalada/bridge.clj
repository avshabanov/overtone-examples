(ns alexshabanov.ensalada.bridge)

(defn main [args]
  (println "=== ASPM Clojure Bridge ===")
  (println "[CLOJURE] Java main called clojure function with args: "
    (apply str (interpose " " args))))

;;(main '(1 2 3 4))
