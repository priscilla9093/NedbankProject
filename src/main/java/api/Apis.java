package api;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class Apis {
Response response;

    @Given("i open the EndPoint")
    public void i_open_the_end_point() {
        RestAssured.baseURI="http://universities.hipolabs.com/search?country=South+Africa";
    }
    @And("I get response")
    public void i_get_response() {
        response=RestAssured.get();
       // response.prettyPrint();
    }
    @Then("I should print name is the University of Witwatersrand")
    public void i_should_print_name_is_the_university_of_witwatersrand() {
        JsonPath jsonPath=response.jsonPath();
     String names=jsonPath.getString("name");
       // System.out.println(names);

        String[] universities = names.split(",");
        for (String s : universities) {
            //System.out.println(s);
               if(s.trim().equalsIgnoreCase("University of Witwatersrand")){
                System.out.println("=================="+  s  +"==============================================");
            }
        }

//     for (int i=0; i<names.length(); i++){
//         String results= String.valueOf(names.charAt(i));
//
//       if(s.trim().equalsIgnoreCase("University of Witwatersrand")){
//                System.out.println("=================="+  s  +"==============================================");
//            }
//     }
    }
}






