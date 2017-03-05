(ns ca.clojurist.styles.tachyons.styles.line-height
  "LINE HEIGHT / LEADING
   Docs: http://tachyons.io/docs/typography/line-height
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def line-height
  [[:.lh-solid {:line-height 1.0}]
   [:.lh-title {:line-height 1.25}]
   [:.lh-copy {:line-height 1.5}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.lh-solid-ns {:line-height 1.0}]
    [:.lh-title-ns {:line-height 1.25}]
    [:.lh-copy-ns {:line-height 1.5}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.lh-solid-m {:line-height 1.0}]
    [:.lh-title-m {:line-height 1.25}]
    [:.lh-copy-m {:line-height 1.5}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.lh-solid-l {:line-height 1.0}]
    [:.lh-title-l {:line-height 1.25}]
    [:.lh-copy-l {:line-height 1.5}]]))

(def styles
  [line-height
   not-small
   medium
   large])
