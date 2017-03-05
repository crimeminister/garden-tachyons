(ns ca.clojurist.styles.tachyons.styles.display
  "DISPLAY
   Docs: http://tachyons.io/docs/layout/display
   Base:
    d = display
   Modifiers:
    n     = none
    b     = block
    ib    = inline-block
    it    = inline-table
    t     = table
    tc    = table-cell
    tr    = table-row
    tcol  = table-column
    tcolg = table-column-group
   Media Query Extensions:
     -ns = not-small
     -m  = medium
     -l  = large"
  (:require
   [garden.stylesheet :as stylesheet]
   [garden.units :refer [percent]]
   [ca.clojurist.styles.tachyons.config.media-queries :as media-queries]))

(def display
  [[:.dn {:display :none}]
   [:.di {:display :inline}]
   [:.db {:display :block}]
   [:.dib {:display :inline-block}]
   [:.dit {:display :inline-table}]
   [:.dt {:display :table}]
   [:.dtc {:display :table-cell}]
   [:.dt-row {:display :table-row}]
   [:.dt-row-group {:display :table-row-group}]
   [:.dt-column {:display :table-column}]
   [:.dt-column-group {:display :table-column-group}]

   ;; This will set table to full width and then all cells will be equal width
   [:.dt--fixed {:table-layout :fixed
                 :width (percent 100)}]])

(def not-small
  (stylesheet/at-media
   media-queries/breakpoint-not-small
   [[:.dn-ns {:display :none}]
    [:.di-ns {:display :inline}]
    [:.db-ns {:display :block}]
    [:.dib-ns {:display :inline-block}]
    [:.dit-ns {:display :inline-table}]
    [:.dt-ns {:display :table}]
    [:.dtc-ns {:display :table-cell}]
    [:.dt-row-ns {:display :table-row}]
    [:.dt-row-group-ns {:display :table-row-group}]
    [:.dt-column-ns {:display :table-column}]
    [:.dt-column-group-ns {:display :table-column-group}]
    [:.dt--fixed-ns {:table-layout :fixed
                     :width (percent 100)}]]))

(def medium
  (stylesheet/at-media
   media-queries/breakpoint-medium
   [[:.dn-m {:display :none}]
    [:.di-m {:display :inline}]
    [:.db-m {:display :block}]
    [:.dib-m {:display :inline-block}]
    [:.dit-m {:display :inline-table}]
    [:.dt-m {:display :table}]
    [:.dtc-m {:display :table-cell}]
    [:.dt-row-m {:display :table-row}]
    [:.dt-row-group-m {:display :table-row-group}]
    [:.dt-column-m {:display :table-column}]
    [:.dt-column-group-m {:display :table-column-group}]
    [:.dt--fixed-m {:table-layout :fixed
                    :width (percent 100)}]]))

(def large
  (stylesheet/at-media
   media-queries/breakpoint-large
   [[:.dn-l {:display :none}]
    [:.di-l {:display :inline}]
    [:.db-l {:display :block}]
    [:.dib-l {:display :inline-block}]
    [:.dit-l {:display :inline-table}]
    [:.dt-l {:display :table}]
    [:.dtc-l {:display :table-cell}]
    [:.dt-row-l {:display :table-row}]
    [:.dt-row-group-l {:display :table-row-group}]
    [:.dt-column-l {:display :table-column}]
    [:.dt-column-group-l {:display :table-column-group}]
    [:.dt--fixed-l {:table-layout :fixed
                    :width (percent 100)}]]))

(def styles
  [display
   not-small
   medium
   large])
