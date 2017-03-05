(ns ca.clojurist.styles.tachyons.styles.typography
  "TYPOGRAPHY
   http://tachyons.io/docs/typography/measure/
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [em]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def default
  [;; Measure is limited to ~66 characters
   [:.measure {:max-width (em 30)}]
   ;; Measure is limited to ~80 characters
   [:.measure-wide {:max-width (em 34)}]
   ;; Measure is limited to ~45 characters
   [:.measure-narrow {:max-width (em 20)}]
   ;; Book paragraph style - paragraphs are indented with no vertical spacing.
   [:.indent {:text-indent (em 1)
              :margin-top 0
              :margin-bottom 0}]
   [:.small-caps {:font-variant :small-caps}]
   ;; Combine this class with a width to truncate text (or just leave as
   ;; is to truncate at width of containing element.
   [:.truncate {:white-space :nowrap
                :overflow :hidden
                :text-overflow :ellipsis}]])

(def not-small
  (stylesheet/at-media media-queries/breakpoint-not-small
   [[[:.measure-ns {:max-width (em 30)}]
     [:.measure-wide-ns {:max-width (em 34)}]
     [:.measure-narrow-ns {:max-width (em 20)}]
     [:.indent-ns {:text-indent (em 1)
                   :margin-top 0
                   :margin-bottom 0}]
     [:.small-caps-ns {:font-variant :small-caps}]
     [:.truncate-ns {:white-space :nowrap
                     :overflow :hidden
                     :text-overflow :ellipsis}]]]))

(def medium
  (stylesheet/at-media media-queries/breakpoint-medium
   [[:.measure-m {:max-width (em 30)}]
    [:.measure-wide-m {:max-width (em 34)}]
    [:.measure-narrow-m {:max-width (em 20)}]
    [:.indent-m {:text-indent (em 1)
                 :margin-top 0
                 :margin-bottom 0}]
    [:.small-caps-m {:font-variant :small-caps}]
    [:.truncate-m {:white-space :nowrap
                   :overflow :hidden
                   :text-overflow :ellipsis}]]))

(def large
  (stylesheet/at-media media-queries/breakpoint-large
   [[:.measure-l {:max-width (em 30)}]
    [:.measure-wide-l {:max-width (em 34)}]
    [:.measure-narrow-l {:max-width (em 20)}]
    [:.indent-l {:text-indent (em 1)
                 :margin-top 0
                 :margin-bottom 0}]
    [:.small-caps-l {:font-variant :small-caps}]
    [:.truncate-l {:white-space :nowrap
                   :overflow :hidden
                   :text-overflow :ellipsis}]]))

(def styles
  [default
   not-small
   medium
   large])
