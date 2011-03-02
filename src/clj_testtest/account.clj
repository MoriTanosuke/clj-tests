(ns clj_testtest.account)

(defstruct account :amount :owner)

(defn withdraw
  ([account amount] (if (> (account :amount) amount) (- (account :amount) amount) (account :amount))))

(defn deposit
  ([account amount] (+ (account :amount) amount)))
