
public class ShowData{
	public static void main(String[] args) {
		GeraRelatorio Janeiro = new GeraRelatorio();
		Janeiro.adicionaRenda("Salario",800.0);
		Janeiro.adicionaRenda("Por fora",7000.0);

		Janeiro.gerar();
	}
}