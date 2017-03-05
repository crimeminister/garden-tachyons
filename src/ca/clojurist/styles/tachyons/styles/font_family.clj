(ns ca.clojurist.styles.tachyons.styles.font-family
  "FONT FAMILY GROUPS
   Docs: http://tachyons.io/docs/typography/font-family/")

(def serif
  [[:.sans-serif {:font-family [:-apple-system
                                :BlinkMacSystemFont
                                "'avenir next'"
                                :avenir,
                                :helvetica
                                "'helvetica neue'"
                                :ubuntu
                                :roboto
                                :noto
                                "'segoe ui'"
                                :arial
                                :sans-serif]}]
   [:.serif {:font-family [:georgia :times :serif]}]
   [:.system-sans-serif {:font-family :sans-serif}]
   [:.system-serif {:font-family :serif}]])

;; From http://cssfontstack.com
(def monospaced-typefaces
  [[:code :.code {:font-family [:Consolas :monaco :monospace]}]
   [:.courier {:font-family ["'Courier Next'" :courier :monospace]}]])

(def sans-serif-typefaces
  [[:.helvetica {:font-family ["'helvetica neue'" :helvetica :sans-serif]}]
   [:.avenir {:font-family ["'avenir next'" :avenir :sans-serif]}]])

(def serif-typefaces
  [[:.athelas {:font-family [:athelas :georgia :serif]}]
   [:.georgia {:font-family [:georgia :serif]}]
   [:.times {:font-family [:times :serif]}]
   [:.bodoni {:font-family ["'Bodoni MT'" :serif]}]
   [:.calisto {:font-family ["'Calisto MT'" :serif]}]
   [:.garamond {:font-family [:garamond :serif]}]
   [:.baskerville {:font-family [:baskerville :serif]}]])

(def styles
  [serif
   monospaced-typefaces
   sans-serif-typefaces
   serif-typefaces])
