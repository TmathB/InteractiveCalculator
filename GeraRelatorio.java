class GeraRelatorio{


	public Saldos S ;

	public GeraRelatorio() {
		this.S = new Saldos();
	}

	public void adicionaRenda(String Iprocedencia,Double Ivalor){
		S.set(Iprocedencia,Ivalor);
	}

	public void gerar(){
		S.get();
	}
	
}