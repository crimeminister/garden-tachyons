(ns ca.clojurist.styles.tachyons.styles.border-widths
  "BORDER WIDTHS
   Docs: http://tachyons.io/docs/themes/borders/
   Base:
     bw = border-width
   Modifiers:
     0 = 0 width border
     1 = 1st step in border-width scale
     2 = 2nd step in border-width scale
     3 = 3rd step in border-width scale
     4 = 4th step in border-width scale
     5 = 5th step in border-width scale
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def border
  [[:.bw0 {:border-width 0}]
   [:.bw1 {:border-width (rem 0.125)}]
   [:.bw2 {:border-width (rem 0.25)}]
   [:.bw3 {:border-width (rem 0.5)}]
   [:.bw4 {:border-width (rem 1)}]
   [:.bw5 {:border-width (rem 2)}]])

(def resets
  [[:.bt-0 {:border-top-width 0}]
   [:.br-0 {:border-right-width 0}]
   [:.bb-0 {:border-bottom-width 0}]
   [:.bl-0 {:border-left-width 0}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.bw0-ns {:border-width 0}]
    [:.bw1-ns {:border-width (rem 0.125)}]
    [:.bw2-ns {:border-width (rem 0.25)}]
    [:.bw3-ns {:border-width (rem 0.5)}]
    [:.bw4-ns {:border-width (rem 1)}]
    [:.bw5-ns {:border-width (rem 2)}]
    [:.bt-0-ns {:border-top-width 0}]
    [:.br-0-ns {:border-right-width 0}]
    [:.bb-0-ns {:border-bottom-width 0}]
    [:.bl-0-ns {:border-left-width 0}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.bw0-m {:border-width 0}]
    [:.bw1-m {:border-width (rem 0.125)}]
    [:.bw2-m {:border-width (rem 0.25)}]
    [:.bw3-m {:border-width (rem 0.5)}]
    [:.bw4-m {:border-width (rem 1)}]
    [:.bw5-m {:border-width (rem 2)}]
    [:.bt-0-m {:border-top-width 0}]
    [:.br-0-m {:border-right-width 0}]
    [:.bb-0-m {:border-bottom-width 0}]
    [:.bl-0-m {:border-left-width 0}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.bw0-l {:border-width 0}]
    [:.bw1-l {:border-width (rem 0.125)}]
    [:.bw2-l {:border-width (rem 0.25)}]
    [:.bw3-l {:border-width (rem 0.5)}]
    [:.bw4-l {:border-width (rem 1)}]
    [:.bw5-l {:border-width (rem 2)}]
    [:.bt-0-l {:border-top-width 0}]
    [:.br-0-l {:border-right-width 0}]
    [:.bb-0-l {:border-bottom-width 0}]
    [:.bl-0-l {:border-left-width 0}]]))

(def styles
  [border
   resets
   not-small
   medium
   large])
