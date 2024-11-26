package classroom;


public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo; /*Se elimino el atributo nombre */
	private Tipo(int codigo) { /*Se cambión de público a privado */
		this.codigo = codigo;
	}

	public int getCodigo() { /*Opcional: creé un getter para codigo */
		return this.codigo;
	}
}
