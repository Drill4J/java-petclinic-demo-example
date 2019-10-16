import io.restassured.RestAssured.given
import org.junit.jupiter.api.BeforeAll
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FirstTest {

    var petclinicUrl: String = "http://ecse005002a2.epam.com:8082"

    //TODO need to fix getting petclinic url in pipeline
/*    @BeforeAll
    fun before() {
        val propUrl = System.getProperty("petclinicUrl", "localhost:8082")
        petclinicUrl = "http://$propUrl"
    }*/

    @Test
    fun getOwner4InfoPage() {
        given().get("$petclinicUrl/owners/4").then().statusCode(200)
    }

    @Test
    fun getOwner4EditPage() {
        given().get("$petclinicUrl/owners/4/edit").then().statusCode(200)
    }
}