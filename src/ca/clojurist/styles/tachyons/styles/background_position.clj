(ns ca.clojurist.styles.tachyons.styles.background-position
  "BACKGROUND POSITION
   Base:
   bg = background
   Modifiers:
   -center = center center
   -top = top center
   -right = center right
   -bottom = bottom center
   -left = center left
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def background
  [[:.bg-center {:background-repeat :no-repeat
                 :background-position [[:center :center]]}]
   [:.bg-top {:background-repeat :no-repeat
              :background-position [[:top :center]]}]
   [:.bg-right {:background-repeat :no-repeat
                :background-position [[:center :right]]}]
   [:.bg-bottom {:background-repeat :no-repeat
                 :background-position [[:bottom :center]]}]
   [:.bg-left {:background-repeat :no-repeat
               :background-position [[:center :left]]}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.bg-center-ns {:background-repeat :no-repeat
                     :background-position [[:center :center]]}]
    [:.bg-top-ns {:background-repeat :no-repeat
                  :background-position [[:top :center]]}]
    [:.bg-right-ns {:background-repeat :no-repeat
                    :background-position [[:center :right]]}]
    [:.bg-bottom-ns {:background-repeat :no-repeat
                     :background-position [[:bottom :center]]}]
    [:.bg-left-ns {:background-repeat :no-repeat
                   :background-position [[:center :left]]}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.bg-center-m {:background-repeat :no-repeat
                    :background-position [[:center :center]]}]
    [:.bg-top-m {:background-repeat :no-repeat
                 :background-position [[:top :center]]}]
    [:.bg-right-m {:background-repeat :no-repeat
                   :background-position [[:center :right]]}]
    [:.bg-bottom-m {:background-repeat :no-repeat
                    :background-position [[:bottom :center]]}]
    [:.bg-left-m {:background-repeat :no-repeat
                  :background-position [[:center :left]]}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.bg-center-l {:background-repeat :no-repeat
                    :background-position [[:center :center]]}]
    [:.bg-top-l {:background-repeat :no-repeat
                 :background-position [[:top :center]]}]
    [:.bg-right-l {:background-repeat :no-repeat
                   :background-position [[:center :right]]}]
    [:.bg-bottom-l {:background-repeat :no-repeat
                    :background-position [[:bottom :center]]}]
    [:.bg-left-l {:background-repeat :no-repeat
                  :background-position [[:center :left]]}]]))

(def styles
  [background
   not-small
   medium
   large])
