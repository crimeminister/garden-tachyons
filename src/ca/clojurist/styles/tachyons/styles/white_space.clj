(ns ca.clojurist.styles.tachyons.styles.white-space
  "WHITE SPACE
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.ws-normal-ns {:white-space :normal}]
    [:.nowrap-ns {:white-space :nowrap}]
    [:.pre-ns {:white-space :pre}]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.ws-normal-m {:white-space :normal}]
    [:.nowrap-m {:white-space :nowrap}]
    [:.pre-m {:white-space :pre}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[:.ws-normal-l {:white-space :normal}]
    [:.nowrap-l {:white-space :nowrap}]
    [:.pre-l {:white-space :pre}]]))

(def styles
  [[:.ws-normal {:white-space :normal}]
   [:.nowrap {:white-space :nowrap}]
   [:.pre {:white-space :pre}]
   not-small
   medium
   large])
