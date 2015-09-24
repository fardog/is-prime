# Introduction to is-prime

`is-prime` is a simple library to check if a number is prime. Primes are
calculated using the slow but sturdy [trial division][] method.

`is-prime` was written as an exercise in learning Clojure; a very small, easy to
reason and easy to test library for trying it out.

## Example

```clojure
(require '[is-prime.core :refer :all])

(is-prime 2) ; true
(is-prime 3) ; true
(is-prime 12853) ; true
(is-prime 4) ; false
```

[trial division]: https://en.wikipedia.org/wiki/Prime_number#Trial_division
