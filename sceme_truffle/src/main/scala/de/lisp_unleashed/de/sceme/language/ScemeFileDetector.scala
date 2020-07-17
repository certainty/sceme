package de.lisp_unleashed.de.sceme.language
import java.nio.charset.Charset
import com.oracle.truffle.api.TruffleFile

object ScemeFileDetector extends TruffleFile.FileTypeDetector {
  override def findMimeType(file: TruffleFile): String = {
    val name = file.getName
    if (name != null && (name.endsWith(".sceme") || name.endsWith(".scm"))) {
      ScemeLanguage.MIME_TYPE
    } else {
      null
    }
  }

  override def findEncoding(file: TruffleFile): Charset =
    null
}
