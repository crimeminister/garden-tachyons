(ns ca.clojurist.styles.tachyons.styles.skins
  "SKINS
   Docs: http://tachyons.io/docs/themes/skins/
   Classes for setting foreground and background colors on elements.
   If you haven't declared a border color, but set border on an element, it will
   be set to the current text color."
  (:require
   [garden.stylesheet :as stylesheet]
   [ca.clojurist.styles.tachyons.config.colors :as colors]))

(def text-colors
  [[:.black-90 {:color colors/black-90}]
   [:.black-80 {:color colors/black-80}]
   [:.black-70 {:color colors/black-70}]
   [:.black-60 {:color colors/black-60}]
   [:.black-50 {:color colors/black-50}]
   [:.black-40 {:color colors/black-40}]
   [:.black-30 {:color colors/black-30}]
   [:.black-20 {:color colors/black-20}]
   [:.black-10 {:color colors/black-10}]
   [:.black-05 {:color colors/black-05}]

   [:.white-90 {:color colors/white-90}]
   [:.white-80 {:color colors/white-80}]
   [:.white-70 {:color colors/white-70}]
   [:.white-60 {:color colors/white-60}]
   [:.white-50 {:color colors/white-50}]
   [:.white-40 {:color colors/white-40}]
   [:.white-30 {:color colors/white-30}]
   [:.white-20 {:color colors/white-20}]
   [:.white-10 {:color colors/white-10}]

   [:.black {:color colors/black}]
   [:.near-black {:color colors/near-black}]
   [:.dark-gray {:color colors/dark-gray}]
   [:.mid-gray {:color colors/mid-gray}]
   [:.gray {:color colors/gray}]
   [:.silver  {:color colors/silver}]
   [:.light-silver {:color colors/light-silver}]
   [:.moon-gray {:color colors/moon-gray}]
   [:.light-gray {:color colors/light-gray}]
   [:.near-white {:color colors/near-white}]
   [:.white {:color colors/white}]

   [:.dark-red {:color colors/dark-red}]
   [:.red {:color colors/red}]
   [:.light-red {:color colors/light-red}]
   [:.orange {:color colors/orange}]
   [:.gold {:color colors/gold}]
   [:.yellow {:color colors/yellow}]
   [:.light-yellow {:color colors/light-yellow}]
   [:.purple {:color colors/purple}]
   [:.light-purple {:color colors/light-purple}]
   [:.dark-pink {:color colors/dark-pink}]
   [:.hot-pink {:color colors/hot-pink}]
   [:.pink {:color colors/pink}]
   [:.light-pink {:color colors/light-pink}]
   [:.dark-green {:color colors/dark-green}]
   [:.green {:color colors/green}]
   [:.light-green {:color colors/light-green}]
   [:.navy {:color colors/navy}]
   [:.dark-blue {:color colors/dark-blue}]
   [:.blue {:color colors/blue}]
   [:.light-blue {:color colors/light-blue}]
   [:.lightest-blue {:color colors/lightest-blue}]
   [:.washed-blue {:color colors/washed-blue}]
   [:.washed-green {:color colors/washed-green}]
   [:.washed-yellow {:color colors/washed-yellow}]
   [:.washed-red {:color colors/washed-red}]

   [:.bg-black-90 {:background-color colors/black-90}]
   [:.bg-black-80 {:background-color colors/black-80}]
   [:.bg-black-70 {:background-color colors/black-70}]
   [:.bg-black-60 {:background-color colors/black-60}]
   [:.bg-black-50 {:background-color colors/black-50}]
   [:.bg-black-40 {:background-color colors/black-40}]
   [:.bg-black-30 {:background-color colors/black-30}]
   [:.bg-black-20 {:background-color colors/black-20}]
   [:.bg-black-10 {:background-color colors/black-10}]
   [:.bg-black-05 {:background-color colors/black-05}]
   [:.bg-white-90 {:background-color colors/white-90}]
   [:.bg-white-80 {:background-color colors/white-80}]
   [:.bg-white-70 {:background-color colors/white-70}]
   [:.bg-white-60 {:background-color colors/white-60}]
   [:.bg-white-50 {:background-color colors/white-50}]
   [:.bg-white-40 {:background-color colors/white-40}]
   [:.bg-white-30 {:background-color colors/white-30}]
   [:.bg-white-20 {:background-color colors/white-20}]
   [:.bg-white-10 {:background-color colors/white-10}]])

(def background-colors
  [[:.bg-black {:background-color colors/black}]
   [:.bg-near-black {:background-color colors/near-black}]
   [:.bg-dark-gray {:background-color colors/dark-gray}]
   [:.bg-mid-gray {:background-color colors/mid-gray}]
   [:.bg-gray {:background-color colors/gray}]
   [:.bg-silver  {:background-color colors/silver}]
   [:.bg-light-silver {:background-color colors/light-silver}]
   [:.bg-moon-gray {:background-color colors/moon-gray}]
   [:.bg-light-gray {:background-color colors/light-gray}]
   [:.bg-near-white {:background-color colors/near-white}]
   [:.bg-white {:background-color colors/white}]
   [:.bg-transparent {:background-color colors/transparent}]

   [:.bg-dark-red {:background-color colors/dark-red}]
   [:.bg-red {:background-color colors/red}]
   [:.bg-light-red {:background-color colors/light-red}]
   [:.bg-orange {:background-color colors/orange}]
   [:.bg-gold {:background-color colors/gold}]
   [:.bg-yellow {:background-color colors/yellow}]
   [:.bg-light-yellow {:background-color colors/light-yellow}]
   [:.bg-purple {:background-color colors/purple}]
   [:.bg-light-purple {:background-color colors/light-purple}]
   [:.bg-dark-pink {:background-color colors/dark-pink}]
   [:.bg-hot-pink {:background-color colors/hot-pink}]
   [:.bg-pink {:background-color colors/pink}]
   [:.bg-light-pink {:background-color colors/light-pink}]
   [:.bg-dark-green {:background-color colors/dark-green}]
   [:.bg-green {:background-color colors/green}]
   [:.bg-light-green {:background-color colors/light-green}]
   [:.bg-navy {:background-color colors/navy}]
   [:.bg-dark-blue {:background-color colors/dark-blue}]
   [:.bg-blue {:background-color colors/blue}]
   [:.bg-light-blue {:background-color colors/light-blue}]
   [:.bg-lightest-blue {:background-color colors/lightest-blue}]
   [:.bg-washed-blue {:background-color colors/washed-blue}]
   [:.bg-washed-green {:background-color colors/washed-green}]
   [:.bg-washed-yellow {:background-color colors/washed-yellow}]
   [:.bg-washed-red {:background-color colors/washed-red}]])

(def styles
  [text-colors
   background-colors])