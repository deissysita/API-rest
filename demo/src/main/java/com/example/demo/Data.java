package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	static List<GestorBD> llenarGestores() {
		List<GestorBD> gestores=new ArrayList<GestorBD>();
		gestores.add(new GestorBD(1,"Oracle"));
		gestores.add(new GestorBD(2,"MySql"));
		gestores.add(new GestorBD(3,"Postgres"));
		gestores.add(new GestorBD(4,"MongoDB"));
		gestores.add(new GestorBD(5,"MS Access"));
		return gestores;
	}

}
