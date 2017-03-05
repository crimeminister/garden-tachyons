(ns ca.clojurist.styles.tachyons.styles.text-align
  "TEXT ALIGN
  Docs: http://tachyons.io/docs/typography/text-align/
  Base
    t = text-align
  Modifiers
    l = left
    r = right
    c = center
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
   [[:.tl-ns {:text-align :left}]
    [:.tr-ns {:text-align :right}]
    [:.tc-ns {:text-align :center}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.tl-m {:text-align :left}]
    [:.tr-m {:text-align :right}]
    [:.tc-m {:text-align :center}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.tl-l {:text-align :left}]
    [:.tr-l {:text-align :right}]
    [:.tc-l {:text-align :center}]]))

(def styles
  [[:.tl {:text-align :left}]
   [:.tr {:text-algin :right}]
   [:.tc {:text-align :center}]
   not-small
   medium
   large])
