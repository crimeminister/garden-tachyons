(ns ca.clojurist.styles.tachyons.styles.outlines
  "OUTLINES
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [px rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def outline
  [[:.outline {:outline [[(px 1) :solid]]}]
   [:.outline-transparent {:outline [[(px 1) :solid :transparent]]}]
   [:.outline-0 {:outline 0}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.outline-ns {:outline [[(px 1) :solid]]}]
    [:.outline-transparent-ns {:outline [[(px 1) :solid :transparent]]}]
    [:.outline-0-ns {:outline 0}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.outline-m {:outline [[(px 1) :solid]]}]
    [:.outline-transparent-m {:outline [[(px 1) :solid :transparent]]}]
    [:.outline-0-m {:outline 0}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.outline-l {:outline [[(px 1) :solid]]}]
    [:.outline-transparent-l {:outline [[(px 1) :solid :transparent]]}]
    [:.outline-0-l {:outline 0}]]))

(def styles
  [outline
   not-small
   medium
   large])
