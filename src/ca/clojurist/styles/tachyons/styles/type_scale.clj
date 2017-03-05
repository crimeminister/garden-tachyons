(ns ca.clojurist.styles.tachyons.styles.type-scale
  "TYPE SCALE
   Docs: http://tachyons.io/docs/typography/type-scale/
   Base:
    f = font-size
   Modifiers
     1 = 1st step in size scale
     2 = 2nd step in size scale
     3 = 3rd step in size scale
     4 = 4th step in size scale
     5 = 5th step in size scale
     6 = 6th step in size scale
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

;; For Hero/Marketing Titles
;;
;; These generally are too large for mobile so be careful using them on
;; smaller screens.

(def hero-marketing
  [[:.f-6 :.f-headline {:font-size (rem 6)}]
   [:.f-5 :.f-subheadline {:font-size (rem 5)}]])

;; Type Scale

(def type-scale
  [[:.f1 {:font-size (rem 3)}]
   [:.f2 {:font-size (rem 2.25)}]
   [:.f3 {:font-size (rem 1.5)}]
   [:.f4 {:font-size (rem 1.25)}]
   [:.f5 {:font-size (rem 1)}]
   [:.f6 {:font-size (rem 0.875)}]])

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.f-6-ns :.f-headline-ns {:font-size (rem 6)}]
    [:.f-5-ns :.f-subheadline-ns {:font-size (rem 5)}]
    [:.f1-ns {:font-size (rem 3)}]
    [:.f2-ns {:font-size (rem 2.25)}]
    [:.f3-ns {:font-size (rem 1.5)}]
    [:.f4-ns {:font-size (rem 1.25)}]
    [:.f5-ns {:font-size (rem 1)}]
    [:.f6-ns {:font-size (rem 0.875)}]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.f-6-m :.f-headline-m {:font-size (rem 6)}]
    [:.f-5-m :.f-subheadline-m {:font-size (rem 5)}]
    [:.f1-m {:font-size (rem 3)}]
    [:.f2-m {:font-size (rem 2.25)}]
    [:.f3-m {:font-size (rem 1.5)}]
    [:.f4-m {:font-size (rem 1.25)}]
    [:.f5-m {:font-size (rem 1)}]
    [:.f6-m {:font-size (rem 0.875)}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[:.f-6-l :.f-headline-l {:font-size (rem 6)}]
    [:.f-5-l :.f-subheadline-l {:font-size (rem 5)}]
    [:.f1-l {:font-size (rem 3)}]
    [:.f2-l {:font-size (rem 2.25)}]
    [:.f3-l {:font-size (rem 1.5)}]
    [:.f4-l {:font-size (rem 1.25)}]
    [:.f5-l {:font-size (rem 1)}]
    [:.f6-l {:font-size (rem 0.875)}]]))

(def styles
  [hero-marketing
   type-scale
   not-small
   medium
   large])
