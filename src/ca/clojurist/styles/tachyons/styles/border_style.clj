(ns ca.clojurist.styles.tachyons.styles.border-style
  "BORDER STYLES
   Docs: http://tachyons.io/docs/themes/borders/
   Depends on base border module in _borders.css
   Base:
     b = border-style
   Modifiers:
     --none   = none
     --dotted = dotted
     --dashed = dashed
     --solid  = solid
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def border
  [[:.b--dotted {:border-style :dotted}]
   [:.b--dashed {:border-style :dashed}]
   [:.b--solid {:border-style :solid}]
   [:.b--none {:border-style :none}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.b--dotted-ns {:border-style :dotted}]
    [:.b--dashed-ns {:border-style :dashed}]
    [:.b--solid-ns {:border-style :solid}]
    [:.b--none-ns {:border-style :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.b--dotted-m {:border-style :dotted}]
    [:.b--dashed-m {:border-style :dashed}]
    [:.b--solid-m {:border-style :solid}]
    [:.b--none-m {:border-style :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.b--dotted-l {:border-style :dotted}]
    [:.b--dashed-l {:border-style :dashed}]
    [:.b--solid-l {:border-style :solid}]
    [:.b--none-l {:border-style :none}]]))

(def styles
  [border
   not-small
   medium
   large])
