(ns ca.clojurist.styles.tachyons.styles.widths
  "WIDTHS
   Docs: http://tachyons.io/docs/layout/widths/
   Base:
     w = width
   Modifiers
     1 = 1st step in width scale
     2 = 2nd step in width scale
     3 = 3rd step in width scale
     4 = 4th step in width scale
     5 = 5th step in width scale
     -10  = literal value 10%
     -20  = literal value 20%
     -25  = literal value 25%
     -33  = literal value 33%
     -34  = literal value 34%
     -40  = literal value 40%
     -50  = literal value 50%
     -60  = literal value 60%
     -75  = literal value 75%
     -80  = literal value 80%
     -100 = literal value 100%
     -third = 100% / 3 (Not supported in opera mini or IE8)
     -auto  = string value auto
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem percent]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def width-scale
  [[:.w1 {:width (rem 1)}]
   [:.w2 {:width (rem 2)}]
   [:.w3 {:width (rem 4)}]
   [:.w4 {:width (rem 8)}]
   [:.w5 {:width (rem 16)}]])

(def width-percentage
  [[:.w-10 {:width (percent 10)}]
   [:.w-20 {:width (percent 20)}]
   [:.w-25 {:width (percent 25)}]
   [:.w-33 {:width (percent 33)}]
   [:.w-34 {:width (percent 34)}]
   [:.w-40 {:width (percent 40)}]
   [:.w-50 {:width (percent 50)}]
   [:.w-60 {:width (percent 60)}]
   [:.w-75 {:width (percent 75)}]
   [:.w-80 {:width (percent 80)}]
   [:.w-100 {:width (percent 100)}]
   [:.w-third {:width (percent (/ 100 3))}]
   [:.w-auto {:width :auto}]])

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.w1-ns {:width (rem 1)}]
    [:.w2-ns {:width (rem 2)}]
    [:.w3-ns {:width (rem 4)}]
    [:.w4-ns {:width (rem 8)}]
    [:.w5-ns {:width (rem 16)}]
    [:.w-10-ns {:width (percent 10)}]
    [:.w-20-ns {:width (percent 20)}]
    [:.w-25-ns {:width (percent 25)}]
    [:.w-33-ns {:width (percent 33)}]
    [:.w-34-ns {:width (percent 34)}]
    [:.w-40-ns {:width (percent 40)}]
    [:.w-50-ns {:width (percent 50)}]
    [:.w-60-ns {:width (percent 60)}]
    [:.w-75-ns {:width (percent 75)}]
    [:.w-80-ns {:width (percent 80)}]
    [:.w-100-ns {:width (percent 100)}]
    [:.w-third-ns {:width (percent (/ 100 3))}]
    [:.w-auto-ns {:width :auto}]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.w1-m {:width (rem 1)}]
    [:.w2-m {:width (rem 2)}]
    [:.w3-m {:width (rem 4)}]
    [:.w4-m {:width (rem 8)}]
    [:.w5-m {:width (rem 16)}]
    [:.w-10-m {:width (percent 10)}]
    [:.w-20-m {:width (percent 20)}]
    [:.w-25-m {:width (percent 25)}]
    [:.w-33-m {:width (percent 33)}]
    [:.w-34-m {:width (percent 34)}]
    [:.w-40-m {:width (percent 40)}]
    [:.w-50-m {:width (percent 50)}]
    [:.w-60-m {:width (percent 60)}]
    [:.w-75-m {:width (percent 75)}]
    [:.w-80-m {:width (percent 80)}]
    [:.w-100-m {:width (percent 100)}]
    [:.w-third-m {:width (percent (/ 100 3))}]
    [:.w-auto-m {:width :auto}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[:.w1-l {:width (rem 1)}]
    [:.w2-l {:width (rem 2)}]
    [:.w3-l {:width (rem 4)}]
    [:.w4-l {:width (rem 8)}]
    [:.w5-l {:width (rem 16)}]
    [:.w-10-l {:width (percent 10)}]
    [:.w-20-l {:width (percent 20)}]
    [:.w-25-l {:width (percent 25)}]
    [:.w-33-l {:width (percent 33)}]
    [:.w-34-l {:width (percent 34)}]
    [:.w-40-l {:width (percent 40)}]
    [:.w-50-l {:width (percent 50)}]
    [:.w-60-l {:width (percent 60)}]
    [:.w-75-l {:width (percent 75)}]
    [:.w-80-l {:width (percent 80)}]
    [:.w-100-l {:width (percent 100)}]
    [:.w-third-l {:width (percent (/ 100 3))}]
    [:.w-auto-l {:width :auto}]]))

(def styles
  [width-scale
   width-percentage
   not-small
   medium
   large])
