(ns ca.clojurist.styles.tachyons.styles.font-style
  "FONT STYLE
   Docs: http://tachyons.io/docs/typography/font-style/
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def font-style
  [[:.i {:font-style :italic}]
   [:.fs-normal {:font-style :normal}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.i-ns {:font-style :italic}]
    [:.fs-normal-ns {:font-style :normal}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.i-m {:font-style :italic}]
    [:.fs-normal-m {:font-style :normal}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.i-l {:font-style :italic}]
    [:.fs-normal-l {:font-style :normal}]]))

(def styles
  [font-style
   not-small
   medium
   large])
