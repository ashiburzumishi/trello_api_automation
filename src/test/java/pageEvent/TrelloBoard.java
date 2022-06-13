package pageEvent;
import io.restassured.RestAssured;
import io.restassured.config.RestAssuredConfig;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import utilities.Variables;
import static io.restassured.RestAssured.*;
import static io.restassured.config.DecoderConfig.decoderConfig;



public class TrelloBoard extends Variables {



    String boardId;


    @Test
    public void createBoard() {

        RestAssured.defaultParser = Parser.JSON;
        Response res=
            res = given().

            config(RestAssuredConfig.config().decoderConfig(decoderConfig().useNoWrapForInflateDecoding(true))).
            contentType(ContentType.JSON).
                queryParam("name",BOARD_NAME ).
                queryParam("key", KEY).
                queryParam("token",TOKEN).
                when().
                post(BASE_URL+BOARD_PATH).then().extract().response();

        boardId= res.getBody().path("id");
        System.out.println(boardId);

    }

    public void getList() {

    }
    public void createCard() {

}
    public void updateCard() {

    }
    public void deleteCards() {

    }
    public void deleteBoard() {

    }
}
