(ns ca.clojurist.styles.tachyons.core
  (:require
   [ca.clojurist.styles.normalize :as normalize])
  (:require
   [ca.clojurist.styles.tachyons.styles.debug-children :as debug-children]
   [ca.clojurist.styles.tachyons.styles.debug-grid :as debug-grid]
   [ca.clojurist.styles.tachyons.styles.debug :as debug])
  (:require
   [ca.clojurist.styles.tachyons.styles.background-position :as background-position]
   [ca.clojurist.styles.tachyons.styles.background-size :as background-size]
   [ca.clojurist.styles.tachyons.styles.borders :as borders]
   [ca.clojurist.styles.tachyons.styles.border-colors :as border-colors]
   [ca.clojurist.styles.tachyons.styles.border-radius :as border-radius]
   [ca.clojurist.styles.tachyons.styles.border-style :as border-style]
   [ca.clojurist.styles.tachyons.styles.border-widths :as border-widths]
   [ca.clojurist.styles.tachyons.styles.box-shadow :as box-shadow]
   [ca.clojurist.styles.tachyons.styles.box-sizing :as box-sizing]
   [ca.clojurist.styles.tachyons.styles.clears :as clears]
   [ca.clojurist.styles.tachyons.styles.code :as code]
   [ca.clojurist.styles.tachyons.styles.coordinates :as coordinates]
   [ca.clojurist.styles.tachyons.styles.display :as display]
   [ca.clojurist.styles.tachyons.styles.flexbox :as flexbox]
   [ca.clojurist.styles.tachyons.styles.floats :as floats]
   [ca.clojurist.styles.tachyons.styles.font-family :as font-family]
   [ca.clojurist.styles.tachyons.styles.font-style :as font-style]
   [ca.clojurist.styles.tachyons.styles.font-weight :as font-weight]
   [ca.clojurist.styles.tachyons.styles.forms :as forms]
   [ca.clojurist.styles.tachyons.styles.heights :as heights]
   [ca.clojurist.styles.tachyons.styles.hovers :as hovers]
   [ca.clojurist.styles.tachyons.styles.images :as images]
   [ca.clojurist.styles.tachyons.styles.letter-spacing :as letter-spacing]
   [ca.clojurist.styles.tachyons.styles.line-height :as line-height]
   [ca.clojurist.styles.tachyons.styles.links :as links]
   [ca.clojurist.styles.tachyons.styles.lists :as lists]
   [ca.clojurist.styles.tachyons.styles.max-widths :as max-widths]
   [ca.clojurist.styles.tachyons.styles.opacity :as opacity]
   [ca.clojurist.styles.tachyons.styles.outlines :as outlines]
   [ca.clojurist.styles.tachyons.styles.overflow :as overflow]
   [ca.clojurist.styles.tachyons.styles.position :as position]
   [ca.clojurist.styles.tachyons.styles.skins :as skins]
   [ca.clojurist.styles.tachyons.styles.skins-pseudo :as skins-pseudo]
   [ca.clojurist.styles.tachyons.styles.spacing :as spacing]
   [ca.clojurist.styles.tachyons.styles.tables :as tables]
   [ca.clojurist.styles.tachyons.styles.text-align :as text-align]
   [ca.clojurist.styles.tachyons.styles.text-decoration :as text-decoration]
   [ca.clojurist.styles.tachyons.styles.text-transform :as text-transform]
   [ca.clojurist.styles.tachyons.styles.type-scale :as type-scale]
   [ca.clojurist.styles.tachyons.styles.typography :as typography]
   [ca.clojurist.styles.tachyons.styles.utilities :as utilities]
   [ca.clojurist.styles.tachyons.styles.vertical-align :as vertical-align]
   [ca.clojurist.styles.tachyons.styles.visibility :as visibility]
   [ca.clojurist.styles.tachyons.styles.white-space :as white-space]
   [ca.clojurist.styles.tachyons.styles.widths :as widths]
   [ca.clojurist.styles.tachyons.styles.word-break :as word-break]
   [ca.clojurist.styles.tachyons.styles.z-index :as z-index]))

(def external
  [normalize/styles])

(def modules
  [background-position/styles
   background-size/styles
   borders/styles
   border-colors/styles
   border-radius/styles
   border-style/styles
   border-widths/styles
   box-shadow/styles
   box-sizing/styles
   clears/styles
   code/styles
   coordinates/styles
   display/styles
   flexbox/styles
   floats/styles
   font-family/styles
   font-style/styles
   font-weight/styles
   forms/styles
   heights/styles
   hovers/styles
   images/styles
   letter-spacing/styles
   line-height/styles
   links/styles
   lists/styles
   max-widths/styles
   opacity/styles
   outlines/styles
   overflow/styles
   position/styles
   skins/styles
   skins-pseudo/styles
   spacing/styles
   tables/styles
   text-align/styles
   text-decoration/styles
   text-transform/styles
   type-scale/styles
   typography/styles
   utilities/styles
   vertical-align/styles
   visibility/styles
   white-space/styles
   widths/styles
   word-break/styles
   z-index/styles])

(def debugging
  [debug-children/styles
   debug-grid/styles
   ;; Uncomment out this line to help debug layout issues
   ;;debug/styles
   ])

(def styles
  [external
   modules
   debugging])
