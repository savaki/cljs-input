(ns main.core
  (:require [reagent.core :as reagent :refer [atom]]
            [ajax.core :as ajax]))

(enable-console-print!)

(defn app-view []
  [:p "hello world"])

(reagent/render-component [app-view] (.getElementById js/document "app"))

