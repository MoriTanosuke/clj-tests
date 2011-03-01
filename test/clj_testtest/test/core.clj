(ns clj-testtest.test.core
  (:use [clj-testtest.core] :reload)
  (:use [clojure.test]))

(deftest test-foo
  (is "a:b" (foo 'a 'b)))

(deftest test-mfoo
  (is "a:b" (mfoo 'a 'b)))

(deftest test-genfoo
  (is "a:b" (gen-foo foo 'a 'b)))
