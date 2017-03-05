(ns ca.clojurist.styles.tachyons.styles.text-decoration
  "TEXT DECORATION
   Docs: http://tachyons.io/docs/typography/text-decoration/
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
   [[:.strike-ns {:text-decoration :line-through}]
    [:.underline-ns {:text-decoration :underline}]
    [:.no-underline-ns {:text-decoration :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.strike-m {:text-decoration :line-through}]
    [:.underline-m {:text-decoration :underline}]
    [:.no-underline-m {:text-decoration :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.strike-l {:text-decoration :line-through}]
    [:.underline-l {:text-decoration :underline}]
    [:.no-underline-l {:text-decoration :none}]]))

(def styles
  [[:.strike {:text-decoration :line-through}]
   [:.underline {:text-decoration :underline}]
   [:.no-underline {:text-decoration :none}]
   not-small
   medium
   large])
