(ns ca.clojurist.styles.tachyons.styles.clears
  "CLEARFIX
   http://tachyons.io/docs/layout/clearfix/

  Nicolas Gallaghers Clearfix solution
  Ref: http://nicolasgallagher.com/micro-clearfix-hack/"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))


(def clearfix
  [[:.cf:before :.cf:after {:content "' '"
                            :display :table}]

   [:.cf:after {:clear :both}]
   [:.cf {:*zoom 1}]

   [:.cl {:clear :left}]
   [:.cr {:clear :right}]
   [:.cb {:clear :both}]
   [:.cn {:clear :none}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.cl-ns {:clear :left}]
    [:.cr-ns {:clear :right}]
    [:.cb-ns {:clear :both}]
    [:.cn-ns {:clear :none}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.cl-m {:clear :left}]
    [:.cr-m {:clear :right}]
    [:.cb-m {:clear :both}]
    [:.cn-m {:clear :none}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.cl-l {:clear :left}]
    [:.cr-l {:clear :right}]
    [:.cb-l {:clear :both}]
    [:.cn-l {:clear :none}]]))

(def styles
  [clearfix
   not-small
   medium
   large])
