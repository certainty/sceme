.PHONY: parser

handrolled_repl:
	sbt 'sceme_handrolled/runMain de.lisp_unleashed.sceme.repl.CLI'

parser:
	antlr  -Xexact-output-dir -o sceme_parser/src/main/java/de/lisp_unleashed/sceme/parser/gen -package de.lisp_unleashed.sceme.parser.gen -visitor -listener sceme_parser/src/main/antlr/Sceme.g4