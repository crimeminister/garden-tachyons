(ns ca.clojurist.styles.tachyons.styles.images
  "IMAGES
   Docs: http://tachyons.io/docs/elements/images/"
  (:require
   [garden.units :refer [percent]]))

(def responsive-images
  [[:img {:max-width (percent 100)}]])

(def styles
  [responsive-images])
