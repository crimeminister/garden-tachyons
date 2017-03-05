(ns ca.clojurist.styles.tachyons.styles.box-shadow
  "BOX-SHADOW
  Docs: http://tachyons.io/docs/themes/box-shadow/
  Media Query Extensions:
   -ns = not-small
   -m  = medium
   -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [px]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def shadow
  [[:.shadow-1 {:box-shadow [[(px 0) (px 0) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
   [:.shadow-2 {:box-shadow [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
   [:.shadow-3 {:box-shadow [[(px 2) (px 2) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
   [:.shadow-4 {:box-shadow [[(px 2) (px 2) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]
   [:.shadow-5 {:box-shadow [[(px 4) (px 4) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.shadow-1-ns {:box-shadow [[(px 0) (px 0) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-2-ns {:box-shadow [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-3-ns {:box-shadow [[(px 2) (px 2) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-4-ns {:box-shadow [[(px 2) (px 2) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-5-ns {:box-shadow [[(px 4) (px 4) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.shadow-1-m {:box-shadow [[(px 0) (px 0) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-2-m {:box-shadow [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-3-m {:box-shadow [[(px 2) (px 2) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-4-m {:box-shadow [[(px 2) (px 2) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-5-m {:box-shadow [[(px 4) (px 4) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.shadow-1-l {:box-shadow [[(px 0) (px 0) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-2-l {:box-shadow [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-3-l {:box-shadow [[(px 2) (px 2) (px 4) (px 2) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-4-l {:box-shadow [[(px 2) (px 2) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]
    [:.shadow-5-l {:box-shadow [[(px 4) (px 4) (px 8) (px 0) "rgba( 0, 0, 0, 0.2 )"]]}]]))

(def styles
  [shadow
   not-small
   medium
   large])
