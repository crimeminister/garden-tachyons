# garden-tachyons

This is a direct port of [Tachyons](http://tachyons.io/) to the [garden](https://github.com/noprompt/garden) Clojure CSS generation library.

I do not take *any* credit for the contained styles, only for their translation into Garden syntax. Credit goes to the original authors of [Tachyons](http://tachyons.io), Adam Morse and [John Otander](http://johnotander.com).

## Versioning

The library uses the scheme `x.y.z-n` where the major, minor, and patch levels match the corresponding version of [Tachyons](http://tachyons.io) and the prerelease (`-n`) is a integer used to indicate successive releases of this port.

## Getting Started

Add the following dependency to your `project.clj` file:

[![Clojars Project](https://img.shields.io/clojars/v/ca.clojurist.styles/tachyons.svg)](https://clojars.org/ca.clojurist.styles/tachyons)

Require the namespace containing the styles:

```clojure
(:require [ca.clojurist.styles.tachyons.core :as tachyons])
```

Include the styles in your application:

```clojure
(ns your.namespace
  (:require
   [garden.def :refer [defstyles]]
   [ca.clojurist.styles.tachyons.core :as tachyons]))

(defstyles screen
  [tachyons/styles])
```

From a REPL in your project root directory:

```clojure
user=> (require '[garden.core :refer [css]])
nil
user=> (require '[your.namespace])
nil
user=> (css your.namespace/screen)
```

See the Garden [README.md](https://github.com/noprompt/garden/blob/master/README.md) for more information about generating CSS.

## License

Copyright © 2017 Robert Medeiros

Distributed under the Eclipse Public License either version 1.0 or (at your option) any later version.
