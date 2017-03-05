(ns ca.clojurist.styles.tachyons.config.box-shadow
  "Box shadow definitions."
  (require
   [garden.units :refer [px]]))

(def box-shadow-1 [[(px 0) (px 0) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]])
(def box-shadow-2 [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]])
(def box-shadow-3 [[(px 2) (px 2) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]])
(def box-shadow-4 [[(px 2) (px 2) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]])
(def box-shadow-5 [[(px 4) (px 4) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]])
