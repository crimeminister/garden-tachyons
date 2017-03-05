(ns ca.clojurist.styles.tachyons.styles.floats
  "FLOATS
   http://tachyons.io/docs/layout/floats/
   1. Floated elements are automatically rendered as block level elements.
      Setting floats to display inline will fix the double margin bug in
      ie6. You know... just in case.
   2. Don't forget to clearfix your floats with .cf
   Base:
     f = float
   Modifiers:
     l = left
     r = right
     n = none
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def float
  [[:.fl {:float :left
          :_display :inline}]
   [:.fr {:float :right
          :_display :inline}]
   [:.fn {:float :none}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.fl-ns {:float :left
              :_display :inline}]
    [:.fr-ns {:float :right
              :_display :inline}]
    [:.fn-ns {:float :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.fl-m {:float :left
             :_display :inline}]
    [:.fr-m {:float :right
             :_display :inline}]
    [:.fn-m {:float :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.fl-l {:float :left
             :_display :inline}]
    [:.fr-l {:float :right
             :_display :inline}]
    [:.fn-l {:float :none}]]))

(def styles
  [float
   not-small
   medium
   large])
