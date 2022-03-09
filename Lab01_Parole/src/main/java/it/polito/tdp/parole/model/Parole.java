package it.polito.tdp.parole.model;

import java.util.*;


public class Parole {
	List<String> parole_list;
		
	public Parole() {
		parole_list= new ArrayList<>();
		//TODO
	}
	
	public void addParola(String p) {
		parole_list.add(p);
		//TODO
	}
	
	public List<String> getElenco() {
		
		Collections.sort(parole_list, new ComparatoreAlfabetico());
		return parole_list;
	}
	
	public void reset() {
		parole_list.clear();
	}

}
