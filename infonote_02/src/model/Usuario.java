package model;

public class Usuario {
	
	public int matricula;
	public String login;
	public String senha;
	public String nome;
	public String email;
	public String telefone;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", login=" + login + ", senha=" + senha + ", nome=" + nome
				+ ", email=" + email + ", telefone=" + telefone + "]";
	}
	
	public Usuario() {
		super();
	}
	
	public Usuario(int matricula, String login, String senha, String nome, String email, String telefone) {
		super();
		this.matricula = matricula;
		this.login = login;
		this.senha = senha;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public void mostrar() {
		// Mostrar usu�rio
		System.out.println("\n\nUsu�rio:\n");
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Login: " + this.login);
		System.out.println("Nome: " + this.nome);
		System.out.println("Senha: " + this.senha);
		System.out.println("Email: " + this.email);
		System.out.println("Telefone: " + this.telefone);
	}

}