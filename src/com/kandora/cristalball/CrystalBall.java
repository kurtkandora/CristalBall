package com.kandora.cristalball;

import java.util.Random;

public class CrystalBall {
	public String[] manswers= {
			"Es seguro",
			"Es probable",
			"Todas las señales dicen que si",
			"Mi respuesta es no",
			"La respuesta a tu pregunta es muy dudosa",
			"No puedo responder en estos momentos",
			"Mejor dimelo tu",
			"Consentrate y preguntamelo denuevo"
	};
	public String getAnAnswer(){
		
		String answer="";
		//Elegir al azar una respuesta
		Random rd= new Random();
		int valor=rd.nextInt(manswers.length);
		answer=manswers[valor];
		
		return answer;
	}

}
