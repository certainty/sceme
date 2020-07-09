.PHONY: parser clean

all: parser
	cd .. && sbt 'graal/compile'

parser:
	antlr  -Xexact-output-dir -o src/main/java/de/lisp_unleashed/sceme/language/parser/gen -package de.lisp_unleashed.sceme.language.parser.gen -visitor -listener src/main/antlr/Sceme.g4

clean: clean_parser
	cd .. && sbt 'graal/clean'

clean_parser:
	rm -rf src/main/java/de/lisp_unleashed/parser

