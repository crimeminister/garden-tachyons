(ns ca.clojurist.styles.tachyons.styles.position
  "POSITIONING
   Docs: http://tachyons.io/docs/layout/position/
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.static-ns {:position :static}]
    [:.relative-ns {:position :relative}]
    [:.absolute-ns {:position :absolute}]
    [:.fixed-ns {:position :fixed}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.static-m {:position :static}]
    [:.relative-m {:position :relative}]
    [:.absolute-m {:position :absolute}]
    [:.fixed-m {:position :fixed}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.static-l {:position :static}]
    [:.relative-l {:position :relative}]
    [:.absolute-l {:position :absolute}]
    [:.fixed-l {:position :fixed}]]))

(def styles
  [[:.static {:position :static}]
   [:.relative {:position :relative}]
   [:.absolute {:position :absolute}]
   [:.fixed {:position :fixed}]
   not-small
   medium
   large])
