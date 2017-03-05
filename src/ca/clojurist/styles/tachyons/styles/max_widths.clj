(ns ca.clojurist.styles.tachyons.styles.max-widths
  "MAX WIDTHS
   Docs: http://tachyons.io/docs/layout/max-widths/
   Base:
     mw = max-width
   Modifiers
     1 = 1st step in width scale
     2 = 2nd step in width scale
     3 = 3rd step in width scale
     4 = 4th step in width scale
     5 = 5th step in width scale
     6 = 6st step in width scale
     7 = 7nd step in width scale
     8 = 8rd step in width scale
     9 = 9th step in width scale
     -100 = literal value 100%
     -none  = string value none
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem percent]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))


(def max-width-percentages
  [[:.mw-100 {:max-width (percent 100)}]])

(def max-width-scale
  [[:.mw1  {:max-width (rem 1)}]
   [:.mw2  {:max-width (rem 2)}]
   [:.mw3  {:max-width (rem 4)}]
   [:.mw4  {:max-width (rem 8)}]
   [:.mw5  {:max-width (rem 16)}]
   [:.mw6  {:max-width (rem 32)}]
   [:.mw7  {:max-width (rem 48)}]
   [:.mw8  {:max-width (rem 64)}]
   [:.mw9  {:max-width (rem 96)}]])

(def max-width-string-properties
  [[:.mw-none {:max-width :none}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.mw-100-ns {:max-width (percent 100)}]

    [:.mw1-ns {:max-width (rem 1)}]
    [:.mw2-ns {:max-width (rem 2)}]
    [:.mw3-ns {:max-width (rem 4)}]
    [:.mw4-ns {:max-width (rem 8)}]
    [:.mw5-ns {:max-width (rem 16)}]
    [:.mw6-ns {:max-width (rem 32)}]
    [:.mw7-ns {:max-width (rem 48)}]
    [:.mw8-ns {:max-width (rem 64)}]
    [:.mw9-ns {:max-width (rem 96)}]

    [:.mw-none-ns {:max-width :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.mw-100-m {:max-width (percent 100)}]

    [:.mw1-m {:max-width (rem 1)}]
    [:.mw2-m {:max-width (rem 2)}]
    [:.mw3-m {:max-width (rem 4)}]
    [:.mw4-m {:max-width (rem 8)}]
    [:.mw5-m {:max-width (rem 16)}]
    [:.mw6-m {:max-width (rem 32)}]
    [:.mw7-m {:max-width (rem 48)}]
    [:.mw8-m {:max-width (rem 64)}]
    [:.mw9-m {:max-width (rem 96)}]

    [:.mw-none-m {:max-width :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.mw-100-l {:max-width (percent 100)}]

    [:.mw1-l {:max-width (rem 1)}]
    [:.mw2-l {:max-width (rem 2)}]
    [:.mw3-l {:max-width (rem 4)}]
    [:.mw4-l {:max-width (rem 8)}]
    [:.mw5-l {:max-width (rem 16)}]
    [:.mw6-l {:max-width (rem 32)}]
    [:.mw7-l {:max-width (rem 48)}]
    [:.mw8-l {:max-width (rem 64)}]
    [:.mw9-l {:max-width (rem 96)}]

    [:.mw-none-l {:max-width :none}]]))

(def styles
  [max-width-percentages
   max-width-scale
   max-width-string-properties
   not-small
   medium
   large])
