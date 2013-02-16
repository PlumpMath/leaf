
# Leaf - Simple Logging

Leaf is a basic ClojureScript library for logging information to the browser console.

## Usage

To get started just add Leaf to as a dependency in your _project.clj_

```clojure
:dependencies [[leaf "0.0.2"]]
```

You can then include it via ClojureScript like so...

```clojure
(ns my.project
  (:require [leaf.core :as leaf]))

(leaf/info "Some message...")
```

## Loggers

Leaf just wraps the standard console logger functions...

```clojure
(leaf/debug "message")
(leaf/log "message")
(leaf/info "message")
(leaf/warn "message")
(leaf/error "message")
```

## Disclaimer

I built this as a toy example to work out how to package ClojureScript libraries, so it's
probably not particularly useful :)

