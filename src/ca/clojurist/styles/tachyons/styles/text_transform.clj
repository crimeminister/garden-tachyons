(ns ca.clojurist.styles.tachyons.styles.text-transform
  "TEXT TRANSFORM
   Docs: http://tachyons.io/docs/typography/text-transform/
   Base:
     tt = text-transform
   Modifiers
     c = capitalize
     l = lowercase
     u = uppercase
     n = none
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
   [[:.ttc-ns {:text-transform :capitalize}]
    [:.ttl-ns {:text-transform :lowercase}]
    [:.ttu-ns {:text-transform :uppercase}]
    [:.ttn-ns {:text-transform :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.ttc-m {:text-transform :capitalize}]
    [:.ttl-m {:text-transform :lowercase}]
    [:.ttu-m {:text-transform :uppercase}]
    [:.ttn-m {:text-transform :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.ttc-l {:text-transform :capitalize}]
    [:.ttl-l {:text-transform :lowercase}]
    [:.ttu-l {:text-transform :uppercase}]
    [:.ttn-l {:text-transform :none}]]))

(def styles
  [[:.ttc {:text-transform :capitalize}]
   [:.ttl {:text-transform :lowercase}]
   [:.ttu {:text-transform :uppercase}]
   [:.ttn {:text-transform :none}]
   not-small
   medium
   large])
