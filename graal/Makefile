.PHONY: parser clean

all: parser
	cd .. && sbt 'graalSceme/compile'

parser:
	antlr  -Xexact-output-dir -o src/main/java/de/lisp_unleashed/sceme/language/parser/gen -package de.lisp_unleashed.sceme.language.parser.gen -visitor -listener src/main/antlr/Sceme.g4

clean: clean_parser
	cd .. && sbt 'graalSceme/clean'

clean_parser:
	rm -rf src/main/java/de/lisp_unleashed/parser

