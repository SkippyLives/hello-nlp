(ns hello-nlp.core
  (:require [clojure.tools.namespace.repl :refer (refresh refresh-all)])
  (use opennlp.nlp)
  (use opennlp.treebank)
  (use opennlp.tools.filters))

(def get-sentences
  (make-sentence-detector "models/en-sent.bin"))

(def tokenize
  (make-tokenizer "models/en-token.bin"))

(def pos-tag
  (make-pos-tagger "models/en-pos-maxent.bin"))

(def name-find
  (make-name-finder "models/en-ner-person.bin"
                    "models/en-ner-location.bin"
                    "models/en-ner-organization.bin"))

(def chunker
  (make-treebank-chunker "models/en-chunker.bin"))

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
