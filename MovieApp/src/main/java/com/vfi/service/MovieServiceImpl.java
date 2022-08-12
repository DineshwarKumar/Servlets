package com.vfi.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService{
List<String> list;
	@Override
	public List<String> getByLanguage(String language) {
		if(language.equals("english")) 
			return Arrays.asList("Avengers","Tom and Jerry","Titanic","Avatar","The Lion King");
		else if(language.equals("tamil"))
			return Arrays.asList("Roja","Ghilli","Kodi","Asuran","Basha");
		else if(language.equals("kannada"))
			return Arrays.asList("KGF","777 Charlie ","James","Rajkumar","Pogaru");
		else if(language.equals("hindi"))
			return Arrays.asList("3 Idiots","Sooryavanshi","Haider","Raazi","Highway");
		else
			return Arrays.asList("Drishyam","Premam","Bangalore Days","Charlie","Amaram");
		
		
	}

}
