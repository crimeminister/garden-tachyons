(ns ca.clojurist.styles.tachyons.styles.visibility
  "VISIBILITY
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

;; Text that is hidden but accessible
;; Ref: http://snook.ca/archives/html_and_css/hiding-content-for-accessibility

(def clip
  [[:.clip {:position [[:fixed :!important]]
            :_position [[:absolute :!important]]
            ;; IE6, IE7
            :clip "rect(1px 1px 1px 1px)"}]
   ;; Create duplicate rule to avoid duplicate map key :clip
   [:.clip {:clip "rect(1px, 1px, 1px, 1px)"}]])

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[:.clip-ns {:position [[:fixed :!important]]
                :_position [[:absolute :!important]]
                ;; IE6, IE7
                :clip "rect(1px 1px 1px 1px)"}]
    ;; Create duplicate rule to avoid duplicate map key :clip
    [:.clip-ns {:clip "rect(1px, 1px, 1px, 1px)"}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.clip-m {:position [[:fixed :!important]]
               :_position [[:absolute :!important]]
               ;; IE6, IE7
               :clip "rect(1px 1px 1px 1px)"}]
    ;; Create duplicate rule to avoid duplicate map key :clip
    [:.clip-m {:clip "rect(1px, 1px, 1px, 1px)"}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.clip-l {:position [[:fixed :!important]]
               :_position [[:absolute :!important]]
               ;; IE6, IE7
               :clip "rect(1px 1px 1px 1px)"}]
    ;; Create duplicate rule to avoid duplicate map key :clip
    [:.clip-l {:clip "rect(1px, 1px, 1px, 1px)"}]]))

(def styles
  [clip
   not-small
   medium
   large])
