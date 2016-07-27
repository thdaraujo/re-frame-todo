(ns reframe-test.runner
    (:require [doo.runner :refer-macros [doo-tests]]
              [reframe-test.core-test]))

(doo-tests 'reframe-test.core-test)
