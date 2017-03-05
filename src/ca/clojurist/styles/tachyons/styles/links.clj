(ns ca.clojurist.styles.tachyons.styles.links
  "LINKS
   Docs: http://tachyons.io/docs/elements/links/"
  (:require
   [garden.units :refer [px s]]))

(def styles
  [[:.link {:text-decoration :none
            :transition [[:color (s 0.15) :ease-in]]}]
   [:.link:link :.link:visited {:transition [[:color (s 0.15) :ease-in]]}]
   [:.link:hover {:transition [[:color (s 0.15) :ease-in]]}]
   [:.link:active {:transition [[:color (s 0.15) :ease-in]]}]
   [:.link:focus {:transition [[:color (s 0.15) :ease-in]]
                  :outline [[(px 1) :dotted :currentColor]]}]])
