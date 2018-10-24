import scala.io.Source
import scala.io.Codec
import java.nio.charset.CodingErrorAction

object Main {
    // to avoid codec errors
    implicit val codec = Codec("UTF-8")
    codec.onMalformedInput(CodingErrorAction.REPLACE)
    codec.onUnmappableCharacter(CodingErrorAction.REPLACE)

    // get url content
    val html = Source.fromURL("http://google.com")
    val s = html.mkString

    def main(args: Array[String]) {
        println(scala.io.Source.fromURL("http://google.com").mkString)
    }
}