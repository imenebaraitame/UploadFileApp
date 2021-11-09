import ratpack.thymeleaf3.ThymeleafModule
import static ratpack.thymeleaf3.Template.thymeleafTemplate

import static ratpack.groovy.Groovy.ratpack


    ratpack {
        bindings {
            module(ThymeleafModule)
        }
        handlers {
            get{
                render("Go to upload file page")
            }
            get("upload"){

                render (thymeleafTemplate("upload"))
            }
            post("ocr"){
                render(thymeleafTemplate("ocr"))
            }

        }
        }



