(ns ca.clojurist.styles.tachyons.styles.overflow
  "OVERFLOW
    Media Query Extensions:
      -ns = not-small
      -m  = medium
      -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def overflow
  [[:.overflow-visible {:overflow :visible}]
   [:.overflow-hidden {:overflow :hidden}]
   [:.overflow-scroll {:overflow :scroll}]
   [:.overflow-auto {:overflow :auto}]])

(def overflow-x
  [[:.overflow-x-visible {:overflow-x :visible}]
   [:.overflow-x-hidden {:overflow-x :hidden}]
   [:.overflow-x-scroll {:overflow-x :scroll}]
   [:.overflow-x-auto {:overflow-x :auto}]])

(def overflow-y
  [[:.overflow-y-visible {:overflow-y :visible}]
   [:.overflow-y-hidden {:overflow-y :hidden}]
   [:.overflow-y-scroll {:overflow-y :scroll}]
   [:.overflow-y-auto {:overflow-y :auto}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.overflow-visible-ns {:overflow :visible}]
    [:.overflow-hidden-ns {:overflow :hidden}]
    [:.overflow-scroll-ns {:overflow :scroll}]
    [:.overflow-auto-ns {:overflow :auto}]

    [:.overflow-x-visible-ns {:overflow-x :visible}]
    [:.overflow-x-hidden-ns {:overflow-x :hidden}]
    [:.overflow-x-scroll-ns {:overflow-x :scroll}]
    [:.overflow-x-auto-ns {:overflow-x :auto}]

    [:.overflow-y-visible-ns {:overflow-y :visible}]
    [:.overflow-y-hidden-ns {:overflow-y :hidden}]
    [:.overflow-y-scroll-ns {:overflow-y :scroll}]
    [:.overflow-y-auto-ns {:overflow-y :auto}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.overflow-visible-m {:overflow :visible}]
    [:.overflow-hidden-m {:overflow :hidden}]
    [:.overflow-scroll-m {:overflow :scroll}]
    [:.overflow-auto-m {:overflow :auto}]

    [:.overflow-x-visible-m {:overflow-x :visible}]
    [:.overflow-x-hidden-m {:overflow-x :hidden}]
    [:.overflow-x-scroll-m {:overflow-x :scroll}]
    [:.overflow-x-auto-m {:overflow-x :auto}]

    [:.overflow-y-visible-m {:overflow-y :visible}]
    [:.overflow-y-hidden-m {:overflow-y :hidden}]
    [:.overflow-y-scroll-m {:overflow-y :scroll}]
    [:.overflow-y-auto-m {:overflow-y :auto}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.overflow-visible-l {:overflow :visible}]
    [:.overflow-hidden-l {:overflow :hidden}]
    [:.overflow-scroll-l {:overflow :scroll}]
    [:.overflow-auto-l {:overflow :auto}]

    [:.overflow-x-visible-l {:overflow-x :visible}]
    [:.overflow-x-hidden-l {:overflow-x :hidden}]
    [:.overflow-x-scroll-l {:overflow-x :scroll}]
    [:.overflow-x-auto-l {:overflow-x :auto}]

    [:.overflow-y-visible-l {:overflow-y :visible}]
    [:.overflow-y-hidden-l {:overflow-y :hidden}]
    [:.overflow-y-scroll-l {:overflow-y :scroll}]
    [:.overflow-y-auto-l {:overflow-y :auto}]]))

(def styles
  [overflow
   overflow-x
   overflow-y
   not-small
   medium
   large])
