package test;

import main.SongsList;

public class Cases {
	
	public static void main(String [] args) {
		SongsList s=new SongsList(5);
		
		s.set("User1", "Pal");
		s.set("User2", "Pal123");
		s.set("User3", "Pal456");
		s.set("User4", "Pal789");
		s.set("User5", "Pal1011");
		s.set("User6", "Pal1012");
		
	}

}
