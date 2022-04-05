package br.com.alura.gerenciador.servlet.modelo;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	
	static {
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		e1.setNome("Alura");
		e2.setNome("Caelum");
		lista.add(e1);
		lista.add(e2);
	}

	public void addEmpresa(Empresa novaEmpresa) {
		lista.add(novaEmpresa);
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}

}
