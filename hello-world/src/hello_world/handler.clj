(ns hello-world.handler
  (:use compojure.core
        compojure.hello-world.views
        [hiccup.middleware :only (wrap-base-url)])
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

(defroutes app-routes
	(GET "/about" []
  		(str "<h1> About Me </h1>"
  			 "<p> I am Rohith Uppala, software Engineer by profession and hacker by heart. 
  				  I will add more to this soon </p>"))
	(GET "/contact" []
  		(str "<p> You can contact me via the below links </p>"))
	(GET "/" request
  		(str request))
	(GET "/articles/:id" [id]
  		(str "This article is about " id ". Enjoy reading it"))
  (GET "/homepage" [] (index-page))
	(route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults, wrap-base-url))