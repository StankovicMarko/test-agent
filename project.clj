(defproject test-agent "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [software.amazon.glue/schema-registry-serde "1.1.17"]]
  :java-source-paths ["java_src"]
  :jvm-opts ["-javaagent:grafana-opentelemetry-java.jar"
             "-Dotel.resource.attributes=service.name=dev-webserver"
             "-Dotel.metrics.exporter=prometheus"
             "-Dotel.metric.export.interval=5000"
             "-Dotel.logs.exporter=none"
             "-Dotel.traces.exporter=none"]
  :repl-options {:init-ns test-agent.core
                 :verbose true})
