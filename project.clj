(defproject cljs-input "0.1.0-SNAPSHOT"
  :description "cljs-input"
  :url "https://github.com/savaki/cljs-input"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2511"]
                 [reagent "0.5.0-alpha"]
                 [cljs-ajax "0.3.3"]]

  :plugins [[lein-environ "1.0.0"]
            [lein-cljsbuild "1.0.3"]]

  :cljsbuild {:builds [{:id "dev"
                        :source-paths ["src"]
                        :compiler {:optimizations :none
                                   :output-to "public/dev/app.js"
                                   :output-dir "public/dev/"
                                   :source-map true}}
                       {:id "prod"
                        :source-paths ["src"]
                        :compiler {:optimizations :advanced
                                   :output-to "public/js/app.js"
                                   :pretty-print false}}
                       ]}

  :min-lein-version "2.0.0")