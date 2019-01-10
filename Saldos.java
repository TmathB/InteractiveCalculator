import java.util.*;

public class Saldos{
	
	/*public Faz F;

	public Saldos() {
		
		this.F = new Faz();
	}*/

	 LinkedList<String> linkedList = new LinkedList<String>();
	 LinkedList<Double> linkedList2 = new LinkedList<Double>();
	

	public void set(String Iprocedencia,Double Ivalor){

		linkedList.add(Iprocedencia);
		linkedList2.add(Ivalor);
	}
	public void get(){
		Double sum = 0.0d ;

		//F.tab(linkedList ,linkedList2);

		for(int i = 0 ; i<linkedList.size();i++){
			sum += linkedList2.get(i);
			
			System.out.println("Procedencia : "+linkedList.get(i)+"\t Valor : "+linkedList2.get(i));
		}/**/
	}
}
//Colocar valores em list.utill ou arraylist
