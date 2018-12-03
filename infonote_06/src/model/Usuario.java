package model;

public class Usuario {
	
	private String login;
	private String senha;
	private int tipo;
	
	public Usuario() {
	}
	
	public Usuario(String login, String senha, int tipo2) {
		
	}
	
	@Override
	public String toString(){
	final String ENTER = "\n";
	String retValue = "";
	
	retValue = "Informações sobre o Usuario:" + ENTER +
	super.toString()+
	"Login:: " + login + ENTER +
	"Senha: " + senha + ENTER +
	"tipo: " + tipo + ENTER;
	
	return retValue;
	}
}
