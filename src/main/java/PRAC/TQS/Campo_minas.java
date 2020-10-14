package PRAC.TQS;

public class Campo_minas {
	
	
	private int filas=8;
	
	public int CalculaNumBombas(int fila) {
		return (int) (0.175*(fila*fila));
	}

	
		
}
