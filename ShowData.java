
public class ShowData{
	public static void main(String[] args) {
		GeraRelatorio Janeiro = new GeraRelatorio();
		Janeiro.adicionaRenda("Salario",800.0);
		Janeiro.adicionaRenda("Por fora",8000.0);

		Janeiro.adicionaDes("Luz",100.00);
		Janeiro.adicionaDes("Agua",100.00);
		Janeiro.adicionaDes("Telefone",100.00);
		Janeiro.adicionaDes("Spotify",30.00);

		Janeiro.gerar();
	}
}