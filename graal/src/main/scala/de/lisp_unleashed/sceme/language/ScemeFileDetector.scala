package de.lisp_unleashed.sceme.language
import java.nio.charset.Charset
import com.oracle.truffle.api.TruffleFile

object ScemeFileDetector extends TruffleFile.FileTypeDetector {
  override def findMimeType(file: TruffleFile): String = {
    val name = file.getName
    if (name != null && name.endsWith(".sceme")) {
      ScemeLanguage.MIME_TYPE
    } else {
      null
    }
  }

  override def findEncoding(file: TruffleFile): Charset =
    null
}
