(ns clj_testtest.account)

(defstruct account :amount :owner)

(defn withdraw
  ([account amount] (- (account :amount) amount)))

(defn deposit
  ([account amount] (+ (account :amount) amount)))
