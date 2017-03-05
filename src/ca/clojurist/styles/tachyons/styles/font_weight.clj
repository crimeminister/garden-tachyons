(ns ca.clojurist.styles.tachyons.styles.font-weight
  "FONT WEIGHT
   Docs: http://tachyons.io/docs/typography/font-weight/
   Base
     fw = font-weight
   Modifiers:
     1 = literal value 100
     2 = literal value 200
     3 = literal value 300
     4 = literal value 400
     5 = literal value 500
     6 = literal value 600
     7 = literal value 700
     8 = literal value 800
     9 = literal value 900
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def font-weight
  [[:.normal {:font-weight :normal}]
   [:.b {:font-weight :bold}]
   [:.fw1 {:font-weight 100}]
   [:.fw2 {:font-weight 200}]
   [:.fw3 {:font-weight 300}]
   [:.fw4 {:font-weight 400}]
   [:.fw5 {:font-weight 500}]
   [:.fw6 {:font-weight 600}]
   [:.fw7 {:font-weight 700}]
   [:.fw8 {:font-weight 800}]
   [:.fw9 {:font-weight 900}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.normal-ns {:font-weight :normal}]
    [:.b-ns {:font-weight :bold}]
    [:.fw1-ns {:font-weight 100}]
    [:.fw2-ns {:font-weight 200}]
    [:.fw3-ns {:font-weight 300}]
    [:.fw4-ns {:font-weight 400}]
    [:.fw5-ns {:font-weight 500}]
    [:.fw6-ns {:font-weight 600}]
    [:.fw7-ns {:font-weight 700}]
    [:.fw8-ns {:font-weight 800}]
    [:.fw9-ns {:font-weight 900}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.normal-m {:font-weight :normal}]
    [:.b-m {:font-weight :bold}]
    [:.fw1-m {:font-weight 100}]
    [:.fw2-m {:font-weight 200}]
    [:.fw3-m {:font-weight 300}]
    [:.fw4-m {:font-weight 400}]
    [:.fw5-m {:font-weight 500}]
    [:.fw6-m {:font-weight 600}]
    [:.fw7-m {:font-weight 700}]
    [:.fw8-m {:font-weight 800}]
    [:.fw9-m {:font-weight 900}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.normal-l {:font-weight :normal}]
    [:.b-l {:font-weight :bold}]
    [:.fw1-l {:font-weight 100}]
    [:.fw2-l {:font-weight 200}]
    [:.fw3-l {:font-weight 300}]
    [:.fw4-l {:font-weight 400}]
    [:.fw5-l {:font-weight 500}]
    [:.fw6-l {:font-weight 600}]
    [:.fw7-l {:font-weight 700}]
    [:.fw8-l {:font-weight 800}]
    [:.fw9-l {:font-weight 900}]]))

(def styles
  [font-weight
   not-small
   medium
   large])
