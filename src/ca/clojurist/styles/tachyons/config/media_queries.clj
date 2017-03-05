(ns ca.clojurist.styles.tachyons.config.media-queries
  (:require
   [garden.units :refer [em]]))

;; @media screen and (min-width: 30em)
(def breakpoint-not-small
  {:screen true
   :min-width (em 30)})

;; @media screen and (min-width: 30em) and (max-width: 60em)
(def breakpoint-medium
  {:screen true
   :min-width (em 30)
   :max-width (em 60)})

;; @media screen and (min-width: 60em)
(def breakpoint-large
  {:screen :true
   :min-width (em 60)})
