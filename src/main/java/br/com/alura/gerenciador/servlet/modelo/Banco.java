package br.com.alura.gerenciador.servlet.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<Empresa>();
	private static Integer numeroSequencial = 1;
	
	static {
		Empresa e1 = new Empresa();
		Empresa e2 = new Empresa();
		e1.setId(numeroSequencial++);
		e1.setNome("Alura");
		e2.setNome("Caelum");
		e2.setId(numeroSequencial++);
		lista.add(e1);
		lista.add(e2);
	}

	public void addEmpresa(Empresa novaEmpresa) {
		novaEmpresa.setId(numeroSequencial++);
		lista.add(novaEmpresa);
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}


	public void deleteEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while(it.hasNext()) {
			Empresa empresa = it.next();
			
			if(empresa.getId() == id)
				it.remove();				
		}
		
	}


	public Empresa mostraEmpresa(Integer id) {
		
		for(Empresa empresa: lista) {
			if(empresa.getId() == id)
				return empresa;
		}
		
		return null;
	}


	public void alterarEmpresa(Empresa empresa) {
		
		Empresa emp = mostraEmpresa(empresa.getId());
		
		emp.setNome(empresa.getNome());
		emp.setDataAbertura(empresa.getDataAbertura());
		
	}

}
