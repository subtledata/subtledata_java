import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FlatSpec

import com.subtledata.api._
import com.subtledata.api.models._

import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class ApiTest extends FlatSpec with ShouldMatchers {
	val API_KEY = System.getProperty("API_KEY")

  behavior of "Subtledata API"

  it should "query the API" in {
  	val api = new LocationsApi
  	val output = api.getLocationMenu(1123, API_KEY, true)

  	println(output)
  }
}
