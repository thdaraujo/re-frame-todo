(ns reframe-test.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [reframe-test.core :as core]))

(deftest fake-test
  (testing "fake description"
    (is (= 1 2))))
