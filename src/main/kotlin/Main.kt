import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.rxkotlin.toObservable
//import spark.kotlin.*
import spark.Spark.*
import spark.ModelAndView
import spark.template.jade.JadeTemplateEngine

class Main {
  companion object {
    @JvmStatic fun main(args: Array<String>) {
      setPort(3000)
      this.setPublicDir()
      this.setFrontendDir()

      val map: Map<String, String> = hashMapOf("message" to "Hello World!")
      get("/", { rq, rs -> 
        println(rs)
        ModelAndView(map, "index")
      }, JadeTemplateEngine())
    }

    fun setPublicDir() {
      staticFileLocation("/public")
    }

    fun setFrontendDir() {
      val projectDir = System.getProperty("user.dir")
      val staticDir = "/src/main/frontend/dist"
      staticFiles.externalLocation(projectDir + staticDir)
    }
  }
}
