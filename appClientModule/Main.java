import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientConfig config = new ClientConfig();
        Client client = ClientBuilder.newClient(config);
        String ans = null;
        Response serverResponse = null;
        
        try {
        	//http://localhost:8081/JerseyCalcService/rest/view/Sriyal/sriyal123/19
        
        	WebTarget webTarget = client.target("http://localhost:8081/JerseyCalcService/rest");
        	serverResponse = webTarget.path("view").path("Sriyal").path("sriyal123").path("19").request().accept(MediaType.TEXT_PLAIN).get();
        	ans = serverResponse.readEntity(String.class);
        	int code = serverResponse.getStatus();
        	System.out.println (ans);
        	System.out.println (code);
        	System.out.println (" ");
        	
        	      	
        	webTarget = client.target("http://localhost:8081/JerseyCalcService/rest");
        	serverResponse = webTarget.path("view").path("Himasha").path("sriyal123").path("19").request().accept(MediaType.TEXT_PLAIN).get();
        	ans = serverResponse.readEntity(String.class);
        	code = serverResponse.getStatus();
        	System.out.println (ans);
        	System.out.println (code);
        	
        	
        	//ans = webTarget.path("view").path("Sriyal").path("sriyal123").path("19").request().accept(MediaType.TEXT_PLAIN).get(String.class);
        }
        catch (Exception e) {
        	e.printStackTrace();
        	//System.out.println ()
        }
        
        //ans = webTarget.path("view").path("Rehansa").path("456Rehansa").path("2").request().accept(MediaType.TEXT_XML).get(String.class);
        //System.out.println (ans);
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}