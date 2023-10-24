package api.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utilities.DataProviders;
import io.restassured.response.Response;

public class DDTests {
	
	@Test(priority =1,dataProvider ="Data",dataProviderClass=DataProviders.class)
	public void testpostuser(String userID,String userName,String fname,String lname,String useremail,String pwd,String ph) {
		
		User userpayload = new User();
		
		userpayload.setId(Integer.parseInt(userID));
		userpayload.setUsername(userName);
		userpayload.setFirstName(fname);
		userpayload.setLastName(lname);
		userpayload.setEmail(useremail);
		userpayload.setPassword(pwd);
		userpayload.setPhone(ph);
		
		Response response = UserEndpoints.createUser(userpayload);
		Assert.assertEquals(response.getStatusCode(), 200);
		
	}
	@Test(priority=2,dataProvider ="UserNames",dataProviderClass=DataProviders.class)
	public void testDeleteUserByName(String UserName) {
		Response response = UserEndpoints.deleteUser(UserName);
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
