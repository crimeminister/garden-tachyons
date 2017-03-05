(ns ca.clojurist.styles.tachyons.styles.heights
  "HEIGHTS
   Docs: http://tachyons.io/docs/layout/heights/
   Base:
     h = height
     min-h = min-height
     min-vh = min-height vertical screen height
     vh = vertical screen height
   Modifiers
     1 = 1st step in height scale
     2 = 2nd step in height scale
     3 = 3rd step in height scale
     4 = 4th step in height scale
     5 = 5th step in height scale
     -25   = literal value 25%
     -50   = literal value 50%
     -75   = literal value 75%
     -100  = literal value 100%
     -auto = string value of auto
     -inherit = string value of inherit
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [percent rem vh]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def height-scale
  [[:.h1 {:height (rem 1)}]
   [:.h2 {:height (rem 2)}]
   [:.h3 {:height (rem 4)}]
   [:.h4 {:height (rem 8)}]
   [:.h5 {:height (rem 16)}]])

;; Based off of height of parent.
(def height-percentages
  [[:.h-25 {:height (percent 25)}]
   [:.h-50 {:height (percent 50)}]
   [:.h-75 {:height (percent 75)}]
   [:.h-100 {:height (percent 100)}]
   [:.min-h-100 {:min-height (percent 100)}]])

(def screen-height-percentages
  [[:.vh-25 {:height (vh 25)}]
   [:.vh-50 {:height (vh 50)}]
   [:.vh-75 {:height (vh 75)}]
   [:.vh-100 {:height (vh 100)}]
   [:.min-vh-100 {:min-height (vh 100)}]])

(def string-properties
  [[:.h-auto {:height :auto}]
   [:.h-inherit {:height :inherit}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.h1-ns {:height (rem 1)}]
    [:.h2-ns {:height (rem 2)}]
    [:.h3-ns {:height (rem 4)}]
    [:.h4-ns {:height (rem 8)}]
    [:.h5-ns {:height (rem 16)}]

    [:.h-25-ns {:height (percent 25)}]
    [:.h-50-ns {:height (percent 50)}]
    [:.h-75-ns {:height (percent 75)}]
    [:.h-100-ns {:height (percent 100)}]
    [:.min-h-100-ns {:min-height (percent 100)}]

    [:.vh-25-ns {:height (vh 25)}]
    [:.vh-50-ns {:height (vh 50)}]
    [:.vh-75-ns {:height (vh 75)}]
    [:.vh-100-ns {:height (vh 100)}]
    [:.min-vh-100-ns {:min-height (vh 100)}]

    [:.h-auto-ns {:height :auto}]
    [:.h-inherit-ns {:height :inherit}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.h1-m {:height (rem 1)}]
    [:.h2-m {:height (rem 2)}]
    [:.h3-m {:height (rem 4)}]
    [:.h4-m {:height (rem 8)}]
    [:.h5-m {:height (rem 16)}]

    [:.h-25-m {:height (percent 25)}]
    [:.h-50-m {:height (percent 50)}]
    [:.h-75-m {:height (percent 75)}]
    [:.h-100-m {:height (percent 100)}]
    [:.min-h-100-m {:min-height (percent 100)}]

    [:.vh-25-m {:height (vh 25)}]
    [:.vh-50-m {:height (vh 50)}]
    [:.vh-75-m {:height (vh 75)}]
    [:.vh-100-m {:height (vh 100)}]
    [:.min-vh-100-m {:min-height (vh 100)}]

    [:.h-auto-m {:height :auto}]
    [:.h-inherit-m {:height :inherit}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.h1-l {:height (rem 1)}]
    [:.h2-l {:height (rem 2)}]
    [:.h3-l {:height (rem 4)}]
    [:.h4-l {:height (rem 8)}]
    [:.h5-l {:height (rem 16)}]

    [:.h-25-l {:height (percent 25)}]
    [:.h-50-l {:height (percent 50)}]
    [:.h-75-l {:height (percent 75)}]
    [:.h-100-l {:height (percent 100)}]
    [:.min-h-100-l {:min-height (percent 100)}]

    [:.vh-25-l {:height (vh 25)}]
    [:.vh-50-l {:height (vh 50)}]
    [:.vh-75-l {:height (vh 75)}]
    [:.vh-100-l {:height (vh 100)}]
    [:.min-vh-100-l {:min-height (vh 100)}]

    [:.h-auto-l {:height :auto}]
    [:.h-inherit-l {:height :inherit}]]))

(def styles
  [height-scale
   height-percentages
   screen-height-percentages
   string-properties
   not-small
   medium
   large])
