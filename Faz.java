import java.util.*;

public class Faz{

	public Saldos S ;
	public Dispesa D;


	public Faz() {
		this.S = new Saldos();
		this.D = new Dispesa();
	}

	public void tab(LinkedList<String> linkedList ,LinkedList<Double> linkedList2){

		for(int i = 0 ; i<linkedList.size();i++){
			sum += linkedList2.get(i);
			System.out.println("Dispesa \n ");
			System.out.println("Procedencia : "+linkedList.get(i)+"\t Valor : "+linkedList2.get(i));
		}
		

		/*Double sum = 0.0d ;

		System.out.println("-----------------------------------------");

		for(int i = 0 ; i<tam;i++){
			sum += S.linkedList2.get(i);
			//System.out.println(sum);
		}
		System.out.println("\t \t Rendimentos totais "+sum);*/


		//System.out.println("oiiiiiiiiiiiiii");
	}
}