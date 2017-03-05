(ns ca.clojurist.styles.tachyons.styles.borders
  "BORDERS
    Docs: http://tachyons.io/docs/themes/borders/
    Base:
      b = border
    Modifiers:
      a = all
      t = top
      r = right
      b = bottom
      l = left
      n = none
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [px]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def border
  [[:.ba {:border-style :solid :border-width (px 1)}]
   [:.bt {:border-top-style :solid :border-top-width (px 1)}]
   [:.br {:border-right-style :solid :border-right-width (px 1)}]
   [:.bb {:border-bottom-style :solid :border-bottom-width (px 1)}]
   [:.bl {:border-left-style :solid :border-left-width (px 1)}]
   [:.bn {:border-style :none :border-width 0}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.ba-ns {:border-style :solid :border-width (px 1)}]
    [:.bt-ns {:border-top-style :solid :border-top-width (px 1)}]
    [:.br-ns {:border-right-style :solid :border-right-width (px 1)}]
    [:.bb-ns {:border-bottom-style :solid :border-bottom-width (px 1)}]
    [:.bl-ns {:border-left-style :solid :border-left-width (px 1)}]
    [:.bn-ns {:border-style :none :border-width 0}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.ba-m {:border-style :solid :border-width (px 1)}]
    [:.bt-m {:border-top-style :solid :border-top-width (px 1)}]
    [:.br-m {:border-right-style :solid :border-right-width (px 1)}]
    [:.bb-m {:border-bottom-style :solid :border-bottom-width (px 1)}]
    [:.bl-m {:border-left-style :solid :border-left-width (px 1)}]
    [:.bn-m {:border-style :none :border-width 0}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.ba-l {:border-style :solid :border-width (px 1)}]
    [:.bt-l {:border-top-style :solid :border-top-width (px 1)}]
    [:.br-l {:border-right-style :solid :border-right-width (px 1)}]
    [:.bb-l {:border-bottom-style :solid :border-bottom-width (px 1)}]
    [:.bl-l {:border-left-style :solid :border-left-width (px 1)}]
    [:.bn-l {:border-style :none :border-width 0}]]))

(def styles
  [border
   not-small
   medium
   large])
