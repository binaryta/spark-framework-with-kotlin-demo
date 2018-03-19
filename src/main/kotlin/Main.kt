import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable

import spark.Spark.get
import spark.ModelAndView
import spark.template.jade.JadeTemplateEngine

class Main {
  companion object {
    @JvmStatic fun main(args: Array<String>) {
      SparkConfigure.init()
      val map: Map<String, String> = hashMapOf("message" to "Hello World!")
      get("/", { rq, rs -> 
        println(rs)
        ModelAndView(map, "index")
      }, JadeTemplateEngine())
    }
  }
}
