public class Herencia{
	public static void main(String args[]){
		//creando objetos con caracteristicas parecidas y metodos heredados
		MedioTransporte Carro, Moto;
		Moto= new MedioTransporte();
		System.out.println("El color es: "+ Moto.Color);
		System.out.println("La marca es: "+ Moto.Marca);
		System.out.println("El tipo es: "+ Moto.Tipo);
		System.out.println("El modelo es: "+ Moto.Modelo);
		Moto.Acelerar();
		Moto.Motocicleta();
		Moto.Frenar();

		Carro= new MedioTransporte ("Negro", "Toyota", "C", 2015);
		System.out.println("El color es: "+ Carro.Color);
		System.out.println("La marca es: "+ Carro.Marca);
		System.out.println("El tipo es: "+ Carro.Tipo);
		System.out.println("El modelo es: "+ Carro.Modelo);
		Carro.Acelerar();
		Carro.Frenar();
	}


}