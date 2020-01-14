// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/bharat.mulchandani/Downloads/play-samples-play-java-starter-example/conf/routes
// @DATE:Tue Jan 14 15:11:46 IST 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
