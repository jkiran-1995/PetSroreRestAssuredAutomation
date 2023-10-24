package api.endpoints;

/*
 * https://petstore.swagger.io/v2/
 * create --https://petstore.swagger.io/v2/user/createUser
 * get--https://petstore.swagger.io/v2/user/getUserByName
 * put(update)--https://petstore.swagger.io/v2/user/updateUser
 * delete--https://petstore.swagger.io/v2/user/deleteUser
 */
public class Routes {

	public static String base_url ="https://petstore.swagger.io/v2";
	
	//User module
	
	public static String post_url = base_url+"/user";
	
	public static String get_url = base_url+"/user/{username}";
	
	public static String update_url = base_url+"/user/{username}";
	
	public static String delete_url = base_url+"/user/{username}";
	
	
}
