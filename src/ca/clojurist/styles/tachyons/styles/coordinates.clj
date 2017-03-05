(ns ca.clojurist.styles.tachyons.styles.coordinates
  "COORDINATES
   Docs: http://tachyons.io/docs/layout/position/
   Use in combination with the position module.
   Base:
     top
     bottom
     right
     left
   Modifiers:
     -0  = literal value 0
     -1  = literal value 1
     -2  = literal value 2
     --1 = literal value -1
     --2 = literal value -2
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [rem]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def coords
  [[:.top-0 {:top 0}]
   [:.right-0 {:right 0}]
   [:.bottom-0 {:bottom 0}]
   [:.left-0 {:left 0}]

   [:.top-1 {:top (rem 1)}]
   [:.right-1 {:right (rem 1)}]
   [:.bottom-1 {:bottom (rem 1)}]
   [:.left-1 {:left (rem 1)}]

   [:.top-2 {:top (rem 2)}]
   [:.right-2 {:right (rem 2)}]
   [:.bottom-2 {:bottom (rem 2)}]
   [:.left-2 {:left (rem 2)}]

   [:.top--1 {:top (rem -1)}]
   [:.right--1 {:right (rem -1)}]
   [:.bottom--1 {:bottom (rem -1)}]
   [:.left--1 {:left (rem -1)}]

   [:.top--2 {:top (rem -2)}]
   [:.right--2 {:right (rem -2)}]
   [:.bottom--2 {:bottom (rem -2)}]
   [:.left--2 {:left (rem -2)}]

   [:.absolute--fill {:top 0 :right 0 :bottom 0 :left 0}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.top-0-ns {:top 0}]
    [:.left-0-ns {:left 0}]
    [:.right-0-ns {:right 0}]
    [:.bottom-0-ns {:bottom 0}]
    [:.top-1-ns {:top (rem 1)}]
    [:.left-1-ns {:left (rem 1)}]
    [:.right-1-ns {:right (rem 1)}]
    [:.bottom-1-ns {:bottom (rem 1)}]
    [:.top-2-ns {:top (rem 2)}]
    [:.left-2-ns {:left (rem 2)}]
    [:.right-2-ns {:right (rem 2)}]
    [:.bottom-2-ns {:bottom (rem 2)}]
    [:.top--1-ns {:top (rem -1)}]
    [:.right--1-ns {:right (rem -1)}]
    [:.bottom--1-ns {:bottom (rem -1)}]
    [:.left--1-ns {:left (rem -1)}]
    [:.top--2-ns {:top (rem -2)}]
    [:.right--2-ns {:right (rem -2)}]
    [:.bottom--2-ns {:bottom (rem -2)}]
    [:.left--2-ns {:left (rem -2)}]
    [:.absolute--fill-ns {:top 0 :right 0 :bottom 0 :left 0}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.top-0-m {:top 0}]
    [:.left-0-m {:left 0}]
    [:.right-0-m {:right 0}]
    [:.bottom-0-m {:bottom 0}]
    [:.top-1-m {:top (rem 1)}]
    [:.left-1-m {:left (rem 1)}]
    [:.right-1-m {:right (rem 1)}]
    [:.bottom-1-m {:bottom (rem 1)}]
    [:.top-2-m {:top (rem 2)}]
    [:.left-2-m {:left (rem 2)}]
    [:.right-2-m {:right (rem 2)}]
    [:.bottom-2-m {:bottom (rem 2)}]
    [:.top--1-m {:top (rem -1)}]
    [:.right--1-m {:right (rem -1)}]
    [:.bottom--1-m {:bottom (rem -1)}]
    [:.left--1-m {:left (rem -1)}]
    [:.top--2-m {:top (rem -2)}]
    [:.right--2-m {:right (rem -2)}]
    [:.bottom--2-m {:bottom (rem -2)}]
    [:.left--2-m {:left (rem -2)}]
    [:.absolute--fill-m {:top 0 :right 0 :bottom 0 :left 0}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.top-0-l {:top 0}]
    [:.left-0-l {:left 0}]
    [:.right-0-l {:right 0}]
    [:.bottom-0-l {:bottom 0}]
    [:.top-1-l {:top (rem 1)}]
    [:.left-1-l {:left (rem 1)}]
    [:.right-1-l {:right (rem 1)}]
    [:.bottom-1-l {:bottom (rem 1)}]
    [:.top-2-l {:top (rem 2)}]
    [:.left-2-l {:left (rem 2)}]
    [:.right-2-l {:right (rem 2)}]
    [:.bottom-2-l {:bottom (rem 2)}]
    [:.top--1-l {:top (rem -1)}]
    [:.right--1-l {:right (rem -1)}]
    [:.bottom--1-l {:bottom (rem -1)}]
    [:.left--1-l {:left (rem -1)}]
    [:.top--2-l {:top (rem -2)}]
    [:.right--2-l {:right (rem -2)}]
    [:.bottom--2-l {:bottom (rem -2)}]
    [:.left--2-l {:left (rem -2)}]
    [:.absolute--fill-l {:top 0 :right 0 :bottom 0 :left 0}]]))

(def styles
  [coords
   not-small
   medium
   large])
