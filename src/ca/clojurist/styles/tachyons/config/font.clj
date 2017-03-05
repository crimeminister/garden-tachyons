(ns ca.clojurist.styles.tachyons.config.font
  "Font-related definitions."
  (:require [garden.units :refer [rem]]))

(def sans-serif [:-apple-system
                 :BlinkMacSystemFont
                 "'avenir next'"
                 :avenir
                 :helvetica
                 "'helvetica neue'"
                 :ubuntu
                 :roboto
                 :noto
                 "'segoe ui'"
                 :arial
                 :sans-serif])
(def serif [:georgia :serif])
(def code [:consolas :monaco :monospace])

(def letter-spacing-tight (em -0.05))
(def letter-spacing-1 (em 0.1))
(def letter-spacing-2 (em 0.25))

(def line-height-solid 1)
(def line-height-title 1.25)
(def line-height-copy 1.5)

(def font-size-headline (rem 6))
(def font-size-subheadline (rem 5))
(def font-size-1 (rem 3))
(def font-size-2 (rem 2.25))
(def font-size-3 (rem 1.5))
(def font-size-4 (rem 1.25))
(def font-size-5 (rem 1))
(def font-size-6 (rem 0.875))
