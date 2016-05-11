package mafiaserver;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketImpl;

import com.flipturnapps.kevinLibrary.net.ClientData;
import com.flipturnapps.kevinLibrary.net.KServer;

public class MafiaServer extends KServer
{

	private static final int MAFIA_PORT = 25555;

	public MafiaServer() throws IOException 
	{
		super(MAFIA_PORT);
	}

	@Override
	protected void newMessage(String message, ClientData client) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	protected ClientData getNewClientData(Socket socket, KServer kServer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void newClient(ClientData data)
	{

	}

}
