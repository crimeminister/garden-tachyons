(ns ca.clojurist.styles.tachyons.styles.utilities
  (:require
   [garden.units :refer [percent]]))

;; This is for fluid media that is embedded from third party sites like youtube, vimeo etc.
;; Wrap the outer element in aspect-ratio and then extend it with the desired ratio i.e
;; Make sure there are no height and width attributes on the embedded media.
;; Adapted from: https://github.com/suitcss/components-flex-embed
;;
;; Example:
;;
;; <div class="aspect-ratio aspect-ratio--16x9">
;;  <iframe class="aspect-ratio--object"></iframe>
;; </div>

(def styles
  [[:.aspect-ratio {:height 0
                    :position :relative}]
   [:.aspect-ratio--16x9 {:padding-bottom (percent 56.25)}]
   [:.aspect-ratio--9x16 {:padding-bottom (percent 177.77)}]
   [:.aspect-ratio--4x3 {:padding-bottom (percent 75)}]
   [:.aspect-ratio--3x4 {:padding-bottom (percent 133.33)}]
   [:.aspect-ratio--6x4 {:padding-bottom (percent 66.6)}]
   [:.aspect-ratio--4x6 {:padding-bottom (percent 150)}]
   [:.aspect-ratio--8x5 {:padding-bottom (percent 62.5)}]
   [:.aspect-ratio--5x8 {:padding-bottom (percent 160)}]
   [:.aspect-ratio--7x5 {:padding-bottom (percent 71.42)}]
   [:.aspect-ratio--5x7 {:padding-bottom (percent 140)}]
   [:.aspect-ratio--1x1 {:padding-bottom (percent 100)}]
   [:.aspect-ratio--object {:position :absolute
                            :top 0
                            :right 0
                            :bottom 0
                            :left 0
                            :width (percent 100)
                            :height (percent 100)
                            :z-index 100}]
   [:.overflow-container {:overflow-y :scroll}]
   [:.center {:margin-right :auto
              :margin-left :auto}]])
