import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

import spark.Spark.get
import spark.ModelAndView
import spark.template.jade.JadeTemplateEngine

class Main {
  companion object {
    @JvmStatic fun main(args: Array<String>) {
      SparkConfigure.init()
      
      get("/", { req, res -> 
        ModelAndView(hashMapOf("message" to "Hello World!"), "index")
      }, JadeTemplateEngine())
    }
  }
}
