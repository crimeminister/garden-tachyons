(ns ca.clojurist.styles.tachyons.styles.letter-spacing
  "LETTER SPACING
   Docs: http://tachyons.io/docs/typography/tracking/
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [em]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def tracked
  [[:.tracked {:letter-spacing (em 0.1)}]
   [:.tracked-tight {:letter-spacing (em -0.05)}]
   [:.tracked-mega {:letter-spacing (em 0.25)}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.tracked-ns {:letter-spacing (em 0.1)}]
    [:.tracked-tight-ns {:letter-spacing (em -0.05)}]
    [:.tracked-mega-ns {:letter-spacing (em 0.25)}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.tracked-m {:letter-spacing (em 0.1)}]
    [:.tracked-tight-m {:letter-spacing (em -0.05)}]
    [:.tracked-mega-m {:letter-spacing (em 0.25)}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.tracked-l {:letter-spacing (em 0.1)}]
    [:.tracked-tight-l {:letter-spacing (em -0.05)}]
    [:.tracked-mega-l {:letter-spacing (em 0.25)}]]))

(def styles
  [tracked
   not-small
   medium
   large])
