(ns clj-testtest.test.core
  (:use [clj-testtest.core] :reload)
  (:use [clojure.test]))

(deftest test-simple
  (is (not (= 5 (+ 2 2)))))

(deftest test-foo
  (is (= "a:b" (foo 'a 'b))))
(deftest test-foo-numbers
  (is (= "5:7" (foo 5 7))))
(deftest test-foo-strings
  (is (= "eins:zwei" (foo "eins" "zwei"))))
(deftest test-foo-broken
  (is (not (= "eins:zwei" (foo "eins" 7))))
  (is (= "eins:7" (foo "eins" 7))))

(deftest test-mfoo
  (is (= "a:b" (mfoo 'a 'b))))

(deftest test-genfoo
  (is (= (foo 'a 'b) ((gen-foo 'foo 'a 'b) 'a 'b))))
