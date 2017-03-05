(ns ca.clojurist.styles.tachyons.styles.border-colors
  "BORDER COLORS
   Docs: http://tachyons.io/docs/themes/borders/
   Border colors can be used to extend the base
   border classes ba,bt,bb,br,bl found in the _borders.css file.
   The base border class by default will set the color of the border
   to that of the current text color. These classes are for the cases
   where you desire for the text and border colors to be different.
   Base:
     b = border
   Modifiers:
   --color-name = each color variable name is also a border color name"
  (:require
   [ca.clojurist.styles.tachyons.config.colors :as colors]))

(def styles
  [[:.b--black {:border-color colors/black}]
   [:.b--near-black {:border-color colors/near-black}]
   [:.b--dark-gray {:border-color colors/dark-gray}]
   [:.b--mid-gray {:border-color colors/mid-gray}]
   [:.b--gray {:border-color colors/gray}]
   [:.b--silver {:border-color colors/silver}]
   [:.b--light-silver {:border-color colors/light-silver}]
   [:.b--light-gray {:border-color colors/light-gray}]
   [:.b--near-white {:border-color colors/near-white}]
   [:.b--white {:border-color colors/white}]

   [:.b--white-90 {:border-color colors/white-90}]
   [:.b--white-80 {:border-color colors/white-80}]
   [:.b--white-70 {:border-color colors/white-70}]
   [:.b--white-60 {:border-color colors/white-60}]
   [:.b--white-50 {:border-color colors/white-50}]
   [:.b--white-40 {:border-color colors/white-40}]
   [:.b--white-30 {:border-color colors/white-30}]
   [:.b--white-20 {:border-color colors/white-20}]
   [:.b--white-10 {:border-color colors/white-10}]
   [:.b--white-05 {:border-color colors/white-05}]
   [:.b--white-025 {:border-color colors/white-025}]
   [:.b--white-0125 {:border-color colors/white-0125}]

   [:.b--black-90 {:border-color colors/black-90}]
   [:.b--black-80 {:border-color colors/black-80}]
   [:.b--black-70 {:border-color colors/black-70}]
   [:.b--black-60 {:border-color colors/black-60}]
   [:.b--black-50 {:border-color colors/black-50}]
   [:.b--black-40 {:border-color colors/black-40}]
   [:.b--black-30 {:border-color colors/black-30}]
   [:.b--black-20 {:border-color colors/black-20}]
   [:.b--black-10 {:border-color colors/black-10}]
   [:.b--black-05 {:border-color colors/black-05}]
   [:.b--black-025 {:border-color colors/black-025}]
   [:.b--black-0125 {:border-color colors/black-0125}]

   [:.b--dark-red {:border-color colors/dark-red}]
   [:.b--red {:border-color colors/red}]
   [:.b--light-red {:border-color colors/light-red}]
   [:.b--orange {:border-color colors/orange}]
   [:.b--gold {:border-color colors/gold}]
   [:.b--yellow {:border-color colors/yellow}]
   [:.b--light-yellow {:border-color colors/light-yellow}]
   [:.b--purple {:border-color colors/purple}]
   [:.b--light-purple {:border-color colors/light-purple}]
   [:.b--dark-pink {:border-color colors/dark-pink}]
   [:.b--hot-pink {:border-color colors/hot-pink}]
   [:.b--pink {:border-color colors/pink}]
   [:.b--light-pink {:border-color colors/light-pink}]
   [:.b--dark-green {:border-color colors/dark-green}]
   [:.b--green {:border-color colors/green}]
   [:.b--light-green {:border-color colors/light-green}]
   [:.b--navy {:border-color colors/navy}]
   [:.b--dark-blue {:border-color colors/dark-blue}]
   [:.b--blue {:border-color colors/blue}]
   [:.b--light-blue {:border-color colors/light-blue}]
   [:.b--lightest-blue {:border-color colors/lightest-blue}]
   [:.b--washed-blue {:border-color colors/washed-blue}]
   [:.b--washed-green {:border-color colors/washed-green}]
   [:.b--washed-yellow {:border-color colors/washed-yellow}]
   [:.b--washed-red {:border-color colors/washed-red}]

   [:.b--transparent {:border-color colors/transparent}]])
