(ns ca.clojurist.styles.tachyons.config.border
  "Border configuration options."
  (:require
   [garden.units :refer [percent px rem]]))

(def border-radius-none 0)
(def border-radius-1 (rem 0.125))
(def border-radius-2 (rem 0.25))
(def border-radius-3 (rem 0.5))
(def border-radius-4 (rem 1))
(def border-radius-circle (percent 100))
(def border-radius-pill (px 9999))

(def border-width-none 0)
(def border-width-1 (rem 0.125))
(def border-width-2 (rem 0.25))
(def border-width-3 (rem 0.5))
(def border-width-4 (rem 1))
(def border-width-5 (rem 2))
