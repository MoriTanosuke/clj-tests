(ns clj_testtest.test.account
  (:use [clj_testtest.account] :reload)
  (:use [clojure.test]))

(def exampleAccount (struct-map account
  :amount 1000
  :owner "Fred"))
(deftest test-withdraw
  (is (= 900 (withdraw exampleAccount 100))))

(def exampleAccount (struct-map account
  :amount 1000
  :owner "Fred"))
(deftest test-deposit
  (is (= 1100 (deposit exampleAccount 100))))
