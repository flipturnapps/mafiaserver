package mafiaserver;

import java.util.ArrayList;

public class Game 
{
	private int id;
	private ArrayList<Player> players;
	private ArrayList<Role> roles;
	
	public void addToRoom(Player player)
	{
		player.setRoomId(id);
		if(players == null)
			players = new ArrayList<Player>();
		players.add(player);
	}
}
