(ns ca.clojurist.styles.tachyons.styles.skins-pseudo
  "SKINS:PSEUDO
   Customize the color of an element when
   it is focused or hovered over."
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.colors :as colors]))

(def hover-shade
  [[:.hover-black:hover :.hover-black:focus {:color colors/black}]
   [:.hover-near-black:hover :.hover-near-black:focus {:color colors/near-black}]
   [:.hover-dark-gray:hover :.hover-dark-gray:focus {:color colors/dark-gray}]
   [:.hover-mid-gray:hover :.hover-mid-gray:focus {:color colors/mid-gray}]
   [:.hover-gray:hover :.hover-gray:focus {:color colors/gray}]
   [:.hover-silver:hover :.hover-silver:focus {:color colors/silver}]
   [:.hover-light-silver:hover :.hover-light-silver:focus {:color colors/light-silver}]
   [:.hover-moon-gray:hover :.hover-moon-gray:focus {:color colors/moon-gray}]
   [:.hover-light-gray:hover :.hover-light-gray:focus {:color colors/light-gray}]
   [:.hover-near-white:hover :.hover-near-white:focus {:color colors/near-white}]
   [:.hover-white:hover :.hover-white:focus {:color colors/white}]])

(def hover-shade-background
  [[:.hover-bg-black:hover :.hover-bg-black:focus {:background-color colors/black}]
   [:.hover-bg-near-black:hover :.hover-bg-near-black:focus {:background-color colors/near-black}]
   [:.hover-bg-dark-gray:hover :.hover-bg-dark-gray:focus {:background-color colors/dark-gray}]
   [:.hover-bg-dark-gray:focus :.hover-bg-mid-gray:hover {:background-color colors/mid-gray}]
   [:.hover-bg-gray:hover :.hover-bg-gray:focus {:background-color colors/gray}]
   [:.hover-bg-silver:hover :.hover-bg-silver:focus {:background-color colors/silver}]
   [:.hover-bg-light-silver:hover :.hover-bg-light-silver:focus {:background-color colors/light-silver}]
   [:.hover-bg-moon-gray:hover :.hover-bg-moon-gray:focus {:background-color colors/moon-gray}]
   [:.hover-bg-light-gray:hover :.hover-bg-light-gray:focus {:background-color colors/light-gray}]
   [:.hover-bg-near-white:hover :.hover-bg-near-white:focus {:background-color colors/near-white}]
   [:.hover-bg-white:hover :.hover-bg-white:focus {:background-color colors/white}]
   [:.hover-bg-transparent:hover :.hover-bg-transparent:focus {:background-color colors/transparent}]])

(def hover
  [[:.hover-dark-red:hover :.hover-dark-red:focus {:color colors/dark-red}]
   [:.hover-red:hover :.hover-red:focus {:color colors/red}]
   [:.hover-light-red:hover :.hover-light-red:focus {:color colors/light-red}]
   [:.hover-orange:hover :.hover-orange:focus {:color colors/orange}]
   [:.hover-gold:hover :.hover-gold:focus {:color colors/gold}]
   [:.hover-yellow:hover :.hover-yellow:focus {:color colors/yellow}]
   [:.hover-light-yellow:hover :.hover-light-yellow:focus {:color colors/light-yellow}]
   [:.hover-purple:hover :.hover-purple:focus {:color colors/purple}]
   [:.hover-light-purple:hover :.hover-light-purple:focus {:color colors/light-purple}]
   [:.hover-dark-pink:hover :.hover-dark-pink:focus {:color colors/dark-pink}]
   [:.hover-hot-pink:hover :.hover-hot-pink:focus {:color colors/hot-pink}]
   [:.hover-pink:hover :.hover-pink:focus {:color colors/pink}]
   [:.hover-light-pink:hover :.hover-light-pink:focus {:color colors/light-pink}]
   [:.hover-dark-green:hover :.hover-dark-green:focus {:color colors/dark-green}]
   [:.hover-green:hover :.hover-green:focus {:color colors/green}]
   [:.hover-light-green:hover :.hover-light-green:focus {:color colors/light-green}]
   [:.hover-navy:hover :.hover-navy:focus {:color colors/navy}]
   [:.hover-dark-blue:hover :.hover-dark-blue:focus {:color colors/dark-blue}]
   [:.hover-blue:hover :.hover-blue:focus {:color colors/blue}]
   [:.hover-light-blue:hover :.hover-light-blue:focus {:color colors/light-blue}]
   [:.hover-lightest-blue:hover :.hover-lightest-blue:focus {:color colors/lightest-blue}]
   [:.hover-washed-blue:hover :.hover-washed-blue:focus {:color colors/washed-blue}]
   [:.hover-washed-green:hover :.hover-washed-green:focus {:color colors/washed-green}]
   [:.hover-washed-yellow:hover :.hover-washed-yellow:focus {:color colors/washed-yellow}]
   [:.hover-washed-red:hover :.hover-washed-red:focus {:color colors/washed-red}]])

(def hover-background
  [[:.hover-bg-dark-red:hover :.hover-bg-dark-red:focus {:background-color colors/dark-red}]
   [:.hover-bg-red:hover :.hover-bg-red:focus {:background-color colors/red}]
   [:.hover-bg-light-red:hover :.hover-bg-light-red:focus {:background-color colors/light-red}]
   [:.hover-bg-orange:hover :.hover-bg-orange:focus {:background-color colors/orange}]
   [:.hover-bg-gold:hover :.hover-bg-gold:focus {:background-color colors/gold}]
   [:.hover-bg-yellow:hover :.hover-bg-yellow:focus {:background-color colors/yellow}]
   [:.hover-bg-light-yellow:hover :.hover-bg-light-yellow:focus {:background-color colors/light-yellow}]
   [:.hover-bg-purple:hover :.hover-bg-purple:focus {:background-color colors/purple}]
   [:.hover-bg-light-purple:hover :.hover-bg-light-purple:focus {:background-color colors/light-purple}]
   [:.hover-bg-dark-pink:hover :.hover-bg-dark-pink:focus {:background-color colors/dark-pink}]
   [:.hover-bg-hot-pink:hover :.hover-bg-hot-pink:focus {:background-color colors/hot-pink}]
   [:.hover-bg-pink:hover :.hover-bg-pink:focus {:background-color colors/pink}]
   [:.hover-bg-light-pink:hover :.hover-bg-light-pink:focus {:background-color colors/light-pink}]
   [:.hover-bg-dark-green:hover :.hover-bg-dark-green:focus {:background-color colors/dark-green}]
   [:.hover-bg-green:hover :.hover-bg-green:focus {:background-color colors/green}]
   [:.hover-bg-light-green:hover :.hover-bg-light-green:focus {:background-color colors/light-green}]
   [:.hover-bg-navy:hover :.hover-bg-navy:focus {:background-color colors/navy}]
   [:.hover-bg-dark-blue:hover :.hover-bg-dark-blue:focus {:background-color colors/dark-blue}]
   [:.hover-bg-blue:hover :.hover-bg-blue:focus {:background-color colors/blue}]
   [:.hover-bg-light-blue:hover :.hover-bg-light-blue:focus {:background-color colors/light-blue}]
   [:.hover-bg-lightest-blue:hover :.hover-bg-lightest-blue:focus {:background-color colors/lightest-blue}]
   [:.hover-bg-washed-blue:hover :.hover-bg-washed-blue:focus {:background-color colors/washed-blue}]
   [:.hover-bg-washed-green:hover :.hover-bg-washed-green:focus {:background-color colors/washed-green}]
   [:.hover-bg-washed-yellow:hover :.hover-bg-washed-yellow:focus {:background-color colors/washed-yellow}]
   [:.hover-bg-washed-red:hover :.hover-bg-washed-red:focus {:background-color colors/washed-red}]])

(def styles
  [hover-shade
   hover-shade-background
   hover
   hover-background])
