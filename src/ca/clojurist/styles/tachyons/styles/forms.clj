(ns ca.clojurist.styles.tachyons.styles.forms
  "FORMS"
  (:require
   [garden.selectors :refer [& defpseudoelement]])  )

;; TODO define all pseudoelements in one shared location and reference from there
(defpseudoelement -moz-focus-inner)

(def styles
  [[:.input-reset {:-webkit-appearance :none
                   :-moz-appearance :none}]
   [(& :.button-reset -moz-focus-inner)
    (& :.input-reset -moz-focus-inner)
    {:border 0
     :padding 0}]])
