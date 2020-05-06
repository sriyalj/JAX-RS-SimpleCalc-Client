import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

public class Connection {
	
	private WebTarget webTarget;
    private Response serverResponse;
    
    private String serverURL = "http://localhost:8081/JerseyCalcService/rest"; 
    
    
    Connection () {
    	ClientConfig config = new ClientConfig();
    	Client client = ClientBuilder.newClient(config);    	
    	webTarget = client.target(serverURL);    	
    }
    
    
    String getResponseFromServer (String fstNum, String scndNum, String Operation) {
    	String ans = null;    	
    	   	
    	try {
    	serverResponse = webTarget.path("view")
    								.path(fstNum)
    								.path(scndNum)
    								.path(Operation)    								
    								.request()
    								.header("Content-type", "text/plain")
    								.accept(MediaType.TEXT_PLAIN)
    								.get();
    	ans = serverResponse.readEntity(String.class);  
    	}
    	catch (Exception e) {
    		ans = e.getMessage();
    	}    	
    	return ans;    	
    }   
    
}
