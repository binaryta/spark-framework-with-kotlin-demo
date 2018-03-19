import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable
import spark.kotlin.*
import spark.Spark.*
import spark.ModelAndView
import spark.template.jade.JadeTemplateEngine

class Main {
  companion object {
    @JvmStatic fun main(args: Array<String>) {
      setPort(3000)
      staticFileLocation("/public")
      val map: Map<String, String> = hashMapOf("message" to "Hello World!")

      get("/", { rq, rs -> 
        println(rs)
        ModelAndView(map, "foo")
      }, JadeTemplateEngine())
    }
  }
}
