(ns ca.clojurist.styles.tachyons.styles.border-radius
  "BORDER RADIUS
   Docs: http://tachyons.io/docs/themes/border-radius/
   Base:
     br   = border-radius
   Modifiers:
     0    = 0/none
     1    = 1st step in scale
     2    = 2nd step in scale
     3    = 3rd step in scale
     4    = 4th step in scale
   Literal values:
     -100 = 100%
     -pill = 9999px
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [percent px rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def border
  [[:.br0 {:border-radius 0}]
   [:.br1 {:border-radius (rem 0.125)}]
   [:.br2 {:border-radius (rem 0.25)}]
   [:.br3 {:border-radius (rem 0.5)}]
   [:.br4 {:border-radius (rem 1)}]
   [:.br-100 {:border-radius (percent 100)}]
   [:.br-pill {:border-radius (px 9999)}]
   [:.br--bottom {:border-top-left-radius 0
                  :border-top-right-radius 0}]
   [:.br--top {:border-bottom-left-radius 0
               :border-bottom-right-radius 0}]
   [:.br--right {:border-top-left-radius 0
                 :border-bottom-left-radius 0}]
   [:.br--left {:border-top-right-radius 0
                :border-bottom-right-radius 0}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.br0-ns {:border-radius 0}]
    [:.br1-ns {:border-radius (rem 0.125)}]
    [:.br2-ns {:border-radius (rem 0.25)}]
    [:.br3-ns {:border-radius (rem 0.5)}]
    [:.br4-ns {:border-radius (rem 1)}]
    [:.br-100-ns {:border-radius (percent 100)}]
    [:.br-pill-ns {:border-radius (px 9999)}]
    [:.br--bottom-ns {:border-top-left-radius 0
                      :border-top-right-radius 0}]
    [:.br--top-ns {:border-bottom-left-radius 0
                   :border-bottom-right-radius 0}]
    [:.br--right-ns {:border-top-left-radius 0
                     :border-bottom-left-radius 0}]
    [:.br--left-ns {:border-top-right-radius 0
                    :border-bottom-right-radius 0}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.br0-m {:border-radius 0}]
    [:.br1-m {:border-radius (rem 0.125)}]
    [:.br2-m {:border-radius (rem 0.25)}]
    [:.br3-m {:border-radius (rem 0.5)}]
    [:.br4-m {:border-radius (rem 1)}]
    [:.br-100-m {:border-radius (percent 100)}]
    [:.br-pill-m {:border-radius (px 9999)}]
    [:.br--bottom-m {:border-top-left-radius 0
                     :border-top-right-radius 0}]
    [:.br--top-m {:border-bottom-left-radius 0
                  :border-bottom-right-radius 0}]
    [:.br--right-m {:border-top-left-radius 0
                    :border-bottom-left-radius 0}]
    [:.br--left-m {:border-top-right-radius 0
                   :border-bottom-right-radius 0}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.br0-l {:border-radius 0}]
    [:.br1-l {:border-radius (rem 0.125)}]
    [:.br2-l {:border-radius (rem 0.25)}]
    [:.br3-l {:border-radius (rem 0.5)}]
    [:.br4-l {:border-radius (rem 1)}]
    [:.br-100-l {:border-radius (percent 100)}]
    [:.br-pill-l {:border-radius (px 9999)}]
    [:.br--bottom-l {:border-radius-top-left 0
                     :border-radius-top-right 0}]
    [:.br--top-l {:border-bottom-left-radius 0
                  :border-bottom-right-radius 0}]
    [:.br--right-l {:border-top-left-radius 0
                    :border-bottom-left-radius 0}]
    [:.br--left-l {:border-top-right-radius 0
                   :border-bottom-right-radius 0}]]))

(def styles
  [border
   not-small
   medium
   large])
