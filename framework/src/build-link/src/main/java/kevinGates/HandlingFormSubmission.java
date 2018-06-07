package kevinGates;

import java.util.HashMap;
import java.util.Map;

import play.data.Form;
import play.data.FormFactory;

public class HandlingFormSubmission {
    private final FormFactory formFactory;
    
    public HandlingFormSubmission(FormFactory formFactory) {
    	this.formFactory = formFactory; 
		Form<User> userForm = this.formFactory.form(User.class);
		
		Map<String,String> anyData = new HashMap<>();
		anyData.put("email", "bob@gmail.com");
		anyData.put("password", "secret");

		User user = userForm.bind(anyData).get();   
		//System.out.println("canada");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	}

}
