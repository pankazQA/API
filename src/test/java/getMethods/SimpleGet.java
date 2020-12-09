package getMethods;

import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;
public class SimpleGet {
	
	//api.openweathermap.org/data/2.5/ weather?q={city name}//
		//ea683a6926611b7adaad247c0b1b4709//
		@Test//(enabled = false)
		public void getCurrentWeather() {
			
			Response resp = given().
					get("http://api.openweathermap.org/data/2.5/weather?q=Astoria&appid=ea683a6926611b7adaad247c0b1b4709");
			
			System.out.println(resp.statusCode());
			System.out.println(resp.asString());
			
			
		}
		
		//@Test(enabled =false)
		//public void getWeatherbyParam() {
			
							//given().
								//param("q", "Jackson Heights").
								//param("appid", "ea683a6926611b7adaad247c0b1b4709").
							//when().
								//get("http://api.openweathermap.org/data/2.5/weather").
							//then().
								//assertThat().statusCode(200);					
		//}
		
		//@Test(enabled =true)
		//public void validateWeatherStatusCode() {
			
			//Response resp = 	//given().
								//param("q", "Jackson Heights").
								//param("appid", "ea683a6926611b7adaad247c0b1b4709").
							//when().
								//get("http://api.openweathermap.org/data/2.5/weather");
			
			//int sCode = resp.statusCode();
			
			//Assert.assertEquals(sCode, 201);//
			
			//if(sCode==200)
				//System.out.println("Valid status code");
			//else
				//System.out.println("Invalid status code");
			
			
		}//
		
		
		
	
	
	
	

//}
