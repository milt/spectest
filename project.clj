(defproject spectest "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0-RC2"]
                 [org.clojure/clojurescript "0.0-3308"]]
  :profiles {:dev {:dependencies [[speclj "3.3.1"]]}}
  :plugins [[speclj "3.3.1"]
            [lein-cljsbuild "1.0.6"]]

  :cljsbuild {:builds {:dev-cljs  {:source-paths ["src" "spec/cljs"]
                                   :compiler     {:output-to "target/js/dev_cljs.js"
                                                  :optimizations :whitespace
                                                  :pretty-print  true}}
                       :dev-cljc  {:source-paths ["src" "spec/cljc"]
                                   :compiler     {:output-to "target/js/dev_cljc.js"
                                                  :optimizations :whitespace
                                                  :pretty-print  true}
                       :prod {:source-paths  ["src"]
                              :compiler      {:output-to "target/js/prod.js"
                                              :optimizations :simple}}}}}
  :test-paths ["spec/cljc"])
