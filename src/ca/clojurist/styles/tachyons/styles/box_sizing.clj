(ns ca.clojurist.styles.tachyons.styles.box-sizing
  "BOX SIZING"
  (:require
   [garden.selectors :refer [attr= input]]))

(def styles
  [[:html
    :body
    :div
    :article
    :section
    :main
    :footer
    :header
    :form
    :fieldset
    :pre
    :code
    :p
    :ul
    :ol
    :li
    :dl
    :dt
    :dd
    :textarea
    (input (attr= :type "email"))
    (input (attr= :type "number"))
    (input (attr= :type "password"))
    (input (attr= :type "tel"))
    (input (attr= :type "text"))
    (input (attr= :type "url"))
    :.border-box
    {:box-sizing :border-box}]])
