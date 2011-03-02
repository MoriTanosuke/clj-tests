(ns clj-testtest.core)

(defn foo
  [a b] (str a ":" b))

(defmacro mfoo
  [a b] `(str ~a ":" ~b))

(defn gen-foo 
  [a b c] (defn a [b c] (str b ":" c)))
