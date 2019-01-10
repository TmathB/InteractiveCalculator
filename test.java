import java.util. *;

public class test{
	public static void main(String [] args){
		LinkedList<String> linkedList = new LinkedList<String>();
		LinkedList<Integer> linkedList2 = new LinkedList<Integer>();
		
		linkedList.add("item1");
		linkedList.add("item2");
		linkedList.add("item3");
		linkedList.add("item4");
		linkedList.add("item5");

		linkedList2.add(4);
		linkedList2.add(6);
		linkedList2.add(3);
		linkedList2.add(3);
		linkedList2.add(7);

		int sum = 0 ;

		for(int i = 0 ; i<linkedList.size();i++){
			sum += linkedList2.get(i);
			System.out.println("Linked list conteudo : "+linkedList.get(i)+"  "+sum);
		}
	}
}