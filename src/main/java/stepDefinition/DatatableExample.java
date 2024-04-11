package stepDefinition;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DatatableExample {

	@Given("User is on Registration page")
	public void user_is_on_registration_page() {
	    System.out.println("On Registration Page");
	}

	@When("User pass the following user details")
	public void user_pass_the_following_user_details(DataTable dataTable) {
	    List<Map<String, String>> data = dataTable.asMaps();
	    
	    for(Map<String, String> m : data)
	    {
	    	System.out.println(m.get("FirstName"));
	    	System.out.println(m.get("LastName"));
	    	System.out.println(m.get("PhoneNo"));
	    	System.out.println(m.get("DOB"));
	    	System.out.println(m.get("Gender"));
	    }
	}

	@Then("Registration successful")
	public void registration_successful() {
	    System.out.println("Registration Successful");
	}
	
}
