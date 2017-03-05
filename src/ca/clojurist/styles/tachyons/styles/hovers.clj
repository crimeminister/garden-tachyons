(ns ca.clojurist.styles.tachyons.styles.hovers
  "HOVER EFFECTS
  Docs: http://tachyons.io/docs/themes/hovers/
  - Dim
  - Hide Child
  - Underline text
  - Grow
  - Pointer
  - Shadow"
  (:require
   [garden.selectors :refer [& after]]
   [garden.units :refer [px s]]))

;; Dim element on hover by adding the dim class.

(def dim
  [[:.dim {:opacity 1
           :transition [[:opacity (s 0.15) :ease-in]]}]
   [:.dim:hover
    :.dim:focus {:opacity 0.5
                 :transition [[:opacity (s 0.15) :ease-in]]}]
   [:.dim:active {:opacity 0.8
                  :transition [[:opacity (s 0.15) :ease-out]]}]])

;; Hide child & reveal on hover:
;; Put the hide-child class on a parent element and any nested element with the
;; child class will be hidden and displayed on hover or focus.
;; <div class="hide-child">
;;   <div class="child"> Hidden until hover or focus </div>
;;   <div class="child"> Hidden until hover or focus </div>
;;   <div class="child"> Hidden until hover or focus </div>
;;   <div class="child"> Hidden until hover or focus </div>
;; </div>

(def hide-child
  [[:.hide-child [:.child {:opacity 0
                           :transition [[:opacity (s 0.15) :ease-in]]}]]
   [:.hide-child:hover
    :.hide-child:focus
    :.hide-child:active [:.child {:opacity 1
                                  :transition [[:opacity (s 0.15) :ease-in]]}]]])

(def underline-hover
  [[:.underline-hover:hover
    :underline-hover:focus {:text-decoration :underline}]])

;; Can combine this with overflow-hidden to make background images grow on hover
;; even if you are using background-size: cover.

(def grow
  [[:.grow {:-moz-osx-font-smoothing :grayscale
            :backface-visibility :hidden
            :transform "translateZ(0)"
            :transition [[:transform (s 0.25) :ease-out]]}]
   [:.grow:hover
    :.grow:focus {:transform "scale(1.05)"}]
   [:.grow:active {:transform "scale(0.90)"}]
   [:.grow-large {:-moz-osx-font-smoothing :grayscale
                  :backface-visibility :hidden
                  :transform "translateZ(0)"
                  :transition [[:transform (s 0.25) :ease-in-out]]}]
   [:.grow-large:hover
    :.grow-large:focus {:transform "scale(1.2)"}]
   [:.grow-large:active {:transform "scale(0.95)"}]])

;; Add pointer on hover.

(def pointer
  [[:.pointer:hover {:cursor :pointer}]])

;; Add shadow on hover.
;; Performant box-shadow animation pattern from
;; http://tobiasahlin.com/blog/how-to-animate-box-shadow/

(def shadow
  [[(& :.shadow-hover after) {:box-shadow [[(px 0) (px 0) (px 8) (px 2) "rgba( 0, 0, 0, 0.2 )"]]
                              :opacity 0
                              :transition [[:opacity (s 0.25) :ease-in-out]]}]
   [(& :.shadow-hover:hover after)
    (& :.shadow-hover:focus after) {:opacity 1}]])

(def styles
  [dim
   hide-child
   underline-hover
   grow
   pointer
   shadow])
