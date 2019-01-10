import java.util.*;

public class Dispesa{

	public Faz F;

	public Dispesa() {
		
		this.F = new Faz();
	}

	private LinkedList<String> linkedList = new LinkedList<String>();
	private LinkedList<Double> linkedList2 = new LinkedList<Double>();
	

	public void set(String Iprocedencia,Double Ivalor){

		linkedList.add(Iprocedencia);
		linkedList2.add(Ivalor);
	}
	public void get(){
		//Double sum = 0.0d ;

		F.tab(LinkedList<String> linkedList);

		/*for(int i = 0 ; i<linkedList.size();i++){
			sum += linkedList2.get(i);
			System.out.println("Dispesa \n ");
			System.out.println("Procedencia : "+linkedList.get(i)+"\t Valor : "+linkedList2.get(i));
		}*/
	}
}