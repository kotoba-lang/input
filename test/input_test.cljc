(ns input-test
  (:require [clojure.test :refer [deftest is testing]]
            [input]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? input))))
