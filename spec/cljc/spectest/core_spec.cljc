(ns spectest.core-spec
  #?@(:cljs [(:require-macros [speclj.core :refer [describe it should=]])
             (:require [speclj.core])])
  #?(:clj (:require [speclj.core :refer [describe it should=]])))

(describe "a test"
          (it "FIXME, I fail."
              (should= 0 1)))
