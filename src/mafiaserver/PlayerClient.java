package mafiaserver;

import java.io.IOException;
import java.net.Socket;

import com.flipturnapps.kevinLibrary.net.ClientData;
import com.flipturnapps.kevinLibrary.net.KServer;

public class PlayerClient extends ClientData
{

	public PlayerClient(Socket socket, KServer<?> server) throws IOException 
	{
		super(socket, server);
	}

	public void sendMessageToServer(String message)
	{
		
	}
	
	private interface FieldSetter
	{
		public void setField(PlayerClient client, String value);
	}
	

}
