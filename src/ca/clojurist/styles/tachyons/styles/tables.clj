(ns ca.clojurist.styles.tachyons.styles.tables
  "TABLES
  Docs: http://tachyons.io/docs/elements/tables/"
  (:require
   [garden.selectors :refer [& nth-child]]
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.colors :as colors]))

(def styles
  [[:.collapse {:border-collapse :collapse
                :border-spacing 0}]
   [:.striped--light-silver
    [(& (nth-child :odd)) {:background-color colors/light-silver}]]
   [:.striped--moon-gray
    [(& (nth-child :odd)) {:background-color colors/moon-gray}]]
   [:.striped--light-gray
    [(& (nth-child :odd)) {:background-color colors/light-gray}]]
   [:.striped--near-white
    [(& (nth-child :odd)) {:background-color colors/near-white}]]
   [:.stripe-light
    [(& (nth-child :odd)) {:background-color colors/white-10}]]
   [:.stripe-dark
    [(& (nth-child :odd)) {:background-color colors/black-10}]]])
