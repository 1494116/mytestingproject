package PRAC.TQS;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class Campo_minasTest extends TestCase {
	int filas=8;
	int columnas=8;
	// matriz [0][0] -> matriz [8][8]
	int res=8;
	int bombas=0;
	
	
	

	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	
	public void testCalculaNumBombas()
	{
		Campo_minas cm= new Campo_minas();
		int resultado =cm.CalculaNumBombas(8);
		assertEquals(11,resultado);
		
	}

}
