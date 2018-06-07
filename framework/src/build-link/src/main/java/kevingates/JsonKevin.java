package kevingates;

import java.util.HashMap;
import java.util.Map;

import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;
import static play.libs.Json.toJson;
import static play.libs.Json.getString;
import static play.libs.Time.*;

public class JsonKevin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> users = new HashMap<String,String>();
		users.put("name", "kevingates");
		//echo("content="+users);
		//JsonNode data = toJson(users);
		//echo(toJson(users));
		echo(parseDuration(null));
		echoOne(11);		
	}
	
//	public static void echo(String any) {
//		System.out.println(any);
//	}
	public static void echo(int any) {
		System.out.println(any);
	}	
}
