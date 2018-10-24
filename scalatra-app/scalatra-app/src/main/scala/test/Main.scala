package test

import org.scalatra._
import servlet.{MultipartConfig, SizeConstraintExceededException, FileUploadSupport}

class Main extends ScalatraServlet with FileUploadSupport with FlashMapSupport {
    configureMultipartHandling(MultipartConfig(maxFileSize = Some(3*1024*1024)))

    get("/") {
        val content = "No content."

        views.html.hello(content)
    }

    post("/") {
        fileParams.get("file") match {
            case Some(file) =>
                Ok(file.get(), Map(
                    "Content-Type"        -> (file.contentType.getOrElse("application/octet-stream")),
                    "Content-Disposition" -> ("attachment; filename=\"" + file.name + "\"")
                ))

            case None =>
                BadRequest(views.html.hello("No file."))
        }
    }
}
