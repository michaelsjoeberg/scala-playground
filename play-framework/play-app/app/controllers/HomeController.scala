package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()(cc: ControllerComponents) extends AbstractController(cc) {

    /**
     * Create an Action to render an HTML page.
     *
     * The configuration in the `routes` file means that this method
     * will be called when the application receives a `GET` request with
     * a path of `/`.
     */
    def index() = Action { implicit request: Request[AnyContent] =>
        Ok(views.html.index())
    }

    // file test
    // def upload = Action(parse.multipartFormData) { request =>
    //     request.body.file("picture").map { picture =>

    //         // only get the last part of the filename
    //         // otherwise someone can send a path like ../../home/foo/bar.txt to write to other files on the system
    //         val filename = Paths.get(picture.filename).getFileName
        
    //         picture.ref.moveTo(Paths.get(s"/tmp/picture/$filename"), replace = true)
            
    //         Ok("File uploaded") 
    //     }.getOrElse {
    //         Redirect(routes.ScalaFileUploadController.index).flashing(
    //             "error" -> "Missing file")
    //     }
    // }

}
