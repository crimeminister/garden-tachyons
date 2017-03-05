(ns ca.clojurist.styles.tachyons.styles.debug-children
  "DEBUG CHILDREN
  Docs: http://tachyons.io/docs/debug/
  Just add the debug class to any element to see outlines on its
  children."
  (:require
   [garden.units :refer [px]]))

(def styles
  [[:.debug [:* {:outline [[(px 1) :solid :gold]]}]]])
