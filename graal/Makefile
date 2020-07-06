.PHONY: parser clean

all: parser
	cd .. && sbt 'graalSceme/compile'

parser:
	antlr  -Xexact-output-dir -o main/java/de/lisp_unleashed/parser -package de.lisp_unleashed.parser -visitor -listener main/antlr/Sceme.g4

clean: clean_parser
	cd .. && sbt 'graalSceme/clean'

clean_parser:
	rm -rf main/java/de/lisp_unleashed/parser

