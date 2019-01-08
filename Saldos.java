import java.util.ArrayList;

class Saldos{
	private String procedencia;
	private Double valor;
	ArrayList listA = new ArrayList();

	/*public void set(String Iprocedencia,Double Ivalor){
		this.procedencia = Iprocedencia;
		this.valor = Ivalor;
	}

	public void get(){
		System.out.println("Procedencia : "+this.procedencia+" , Valor : "+this.valor);
	}*/

	public void set(String Iprocedencia,Double Ivalor){
		
		listA.add(this.procedencia,this.valor);
	}
	public void get(){
		String element0 = (String) listA.get(1);
		System.out.println("----");
	}
}
//Colocar valores em list.utill ou arraylist
