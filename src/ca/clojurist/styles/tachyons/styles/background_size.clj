(ns ca.clojurist.styles.tachyons.styles.background-size
  "BACKGROUND SIZE
   Docs: http://tachyons.io/docs/themes/background-size/
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

;; Often used in combination with background image set as an inline
;; style on an html element.

(def background
  [[:.cover {:background-size :cover!important}]
   [:.contain {:background-size :contain!important}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.cover-ns {:background-size :cover!important}]
    [:.contain-ns {:background-size :contain!important}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.cover-m {:background-size :cover!important}]
    [:.contain-m {:background-size :contain!important}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.cover-l {:background-size :cover!important}]
    [:.contain-l {:background-size :contain!important}]]))

(def styles
  [background
   not-small
   medium
   large])
