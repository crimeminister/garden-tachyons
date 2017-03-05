(ns ca.clojurist.styles.tachyons.styles.word-break
  "WORD BREAK
   Base:
     word = word-break
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.word-normal-ns {:word-break :normal}]
    [:.word-wrap-ns {:word-break :break-all}]
    [:.word-nowrap-ns {:word-break :keep-all}]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.word-normal-m {:word-break :normal}]
    [:.word-wrap-m {:word-break :break-all}]
    [:.word-nowrap-m {:word-break :keep-all}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[[:.word-normal-l {:word-break :normal}]
     [:.word-wrap-l {:word-break :break-all}]
     [:.word-nowrap-l {:word-break :keep-all}]]]))

(def styles
  [[:.word-normal {:word-break :normal}]
   [:.word-wrap {:word-break :break-all}]
   [:.word-nowrap {:word-break :keep-all}]
   not-small
   medium
   large])
