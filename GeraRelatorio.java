class GeraRelatorio{


	public Saldos S ;
	public Dispesa D;
	public Faz F;

	public GeraRelatorio() {
		this.S = new Saldos();
		this.D = new Dispesa();
		this.F = new Faz();
	}

	public void adicionaRenda(String Iprocedencia,Double Ivalor){
		S.set(Iprocedencia,Ivalor);
	}
	public void adicionaDes(String Iprocedencia,Double Ivalor){
		D.set(Iprocedencia,Ivalor);
	}/**/


	public void gerar(){

		System.out.println("Rendas \n ");
		S.get();
		//F.tab();

		Double sum = 0.0d ;

		System.out.println("-----------------------------------------");

		for(int i = 0 ; i<S.linkedList.size();i++){
			sum += S.linkedList2.get(i);
			//System.out.println(sum);
		}
		System.out.println("\t \t Rendimentos totais "+sum);/**/

		System.out.println();

		System.out.println("Dispesas \n ");
		D.get();

		Double sum2 = 0.0d ;

		System.out.println("-----------------------------------------");

		for(int i = 0 ; i<D.linkedList.size();i++){
			sum2 += D.linkedList2.get(i);
			//System.out.println(sum);
		}
		System.out.println("\t \t Dispesas totais "+sum2);/**/

		double montanteDeSobra = sum-sum2;
		System.out.println();

		System.out.println("\t \t Sobra "+montanteDeSobra);


		//System.out.println("oiiiiiiiiiiiiii");
	}
	
}