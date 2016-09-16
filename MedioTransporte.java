public class MedioTransporte{
	
	//Atributos de la superclase
	String Color;
	String Marca;
	String Tipo;
	private String Solomoto;
	int Modelo;

	//CONSTRUCTOR
	public MedioTransporte(){
		Solomoto= "Haciendo Caballito";
		Marca="Honda";
		Color= "rojo";
		Tipo= "M";
		Modelo=2016;
	}
	public MedioTransporte(String C, String M, String T, int Mo){
		Marca=M;
		Color=C;
		Modelo=Mo;
	}

	//metodos de la superclase
	public void Acelerar(){
		System.out.println("Acelerando");
	}
	public void Frenar(){
		System.out.println("Disminuyendo Velocidad");
	}
	public void Motocicleta(){
		System.out.println(Solomoto);
	}

}