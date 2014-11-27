package com.appsEmpresariales.udea.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import com.appsEmpresariales.udea.romanos.*;

public class RomanosTest {

//	@Test
	public void romanoConvertidorUnidadesTodasTest() {
		Romanos numero= new Romanos();
		int[] resultado=numero.RomanoConvertidorUnidades(1111);
		int[] resultadoEsperado= new int []{1,1,0,0};
		Assert.assertArrayEquals(resultadoEsperado, resultado);
	}
	
	@Test
	public void convertidorUnidadesDeMilARomano(){
		Romanos unidad= new Romanos();
		String unidadRomana = unidad.convertirUnidadesDeMilARomano(1111);
		assertEquals("M", unidadRomana);
	}
	
	@Test
	public void convertidorCentenasARomano(){
		Romanos centenas= new Romanos();
		String centenaRomana = centenas.convertirCentenasARomano(1111);
		assertEquals("C", centenaRomana);
	}
	
	@Test
	public void convertidorDecenasARomano(){
		Romanos decena= new Romanos();
		String decenaRomana = decena.convertirDecenasARomano(1111);
		assertEquals("X", decenaRomana);
	}

	@Test
	public void convertidorUnidadesARomano(){
		Romanos unidades= new Romanos();
		String unidadesRomana = unidades.convertirUnidadesARomano(1111);
		assertEquals("I", unidadesRomana);
	}
}
