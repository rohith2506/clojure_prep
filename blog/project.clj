(defproject blog "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.3.1"]
                 [ring/ring-defaults "0.1.2"]
                 [de.ubercode.clostache/clostache "1.3.1"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"]
                 [mysql/mysql-connector-java "5.1.25"]
                 [ring-basic-authentication "1.0.2"]]
  :plugins [[lein-ring "0.8.13"]]
  :ring {:handler blog.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}})
