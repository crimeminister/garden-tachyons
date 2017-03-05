(ns ca.clojurist.styles.tachyons.styles.vertical-align
  "VERTICAL ALIGN
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def default
  [[:.v-base {:vertical-align :baseline}]
   [:.v-mid {:vertical-align :middle}]
   [:.v-top {:vertical-align :top}]
   [:.v-btm {:vertical-align :bottom}]])

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.v-base-ns {:vertical-align :baseline}]
    [:.v-mid-ns {:vertical-align :middle}]
    [:.v-top-ns {:vertical-align :top}]
    [:.v-btm-ns {:vertical-align :bottom}]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.v-base-m {:vertical-align :baseline}]
    [:.v-mid-m {:vertical-align :middle}]
    [:.v-top-m {:vertical-align :top}]
    [:.v-btm-m {:vertical-align :bottom}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[:.v-base-l {:vertical-align :baseline}]
    [:.v-mid-l {:vertical-align :middle}]
    [:.v-top-l {:vertical-align :top}]
    [:.v-btm-l {:vertical-align :bottom}]]))

(def styles
  [default
   not-small
   medium
   large])
