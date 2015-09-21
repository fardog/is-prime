# is-prime

A Clojure library that evaluates if a number is prime.

**Note:** This is just me learning some clojure, and probably not good.

## Usage

```clojure
(require '[is-prime.core :refer :all])

(is-prime 2) ; true
(is-prime 3) ; true
(is-prime 12853) ; true
(is-prime 4) ; false
```

## Testing

```bash
$ lein test
```

## License

Copyright © 2015 Nathan Wittstock

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
