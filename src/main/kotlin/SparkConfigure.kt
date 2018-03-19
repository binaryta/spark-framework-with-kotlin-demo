import spark.Spark.setPort
import spark.Spark.staticFileLocation
import spark.Spark.staticFiles

class SparkConfigure {
  companion object {
    fun init() {
      setPort(3000)
      this.setPublicDir()
      this.setFrontendDir()
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
