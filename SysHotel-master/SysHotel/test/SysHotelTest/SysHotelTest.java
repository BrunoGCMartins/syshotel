package SysHotelTest;

import br.edu.utfpr.cm.tsi.pi.syshotel.Util.Util;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

public class SysHotelTest {

    public SysHotelTest() {
    }

    @Test // CPF correto
    public void validaCpfCorretoTest() {
        Util util = new Util();

        boolean res = util.validacpf("073.950.549-11");

        assertEquals(true, res);
    }

    @Test   // CPF com menos de 11 digitos
    public void validaCpfIncorretoTest() {
        Util util = new Util();

        boolean res = util.validacpf("073950");

        assertEquals(false, res);
    }

    @Test // Email correto 
    public void validarEmailCorretoTest() {
        Util util = new Util();

        boolean res = util.validarEmail("robertoj@alunos.utfpr.edu.br");

        assertEquals(true, res);
    }

    @Test // email faltando o @
    public void validarEmailIncorretoTest() {
        Util util = new Util();

        boolean res = util.validacpf("robertojalunos.utfpr.edu.br");

        assertEquals(false, res);
    }

    @Test  // Mensagem de confirmação correta
    public void imprimirConfirmacaoCorretaTest() {
        Util util = new Util();

        boolean res = util.dispayMsg("Confirmação");

        assertEquals(true, res);
    }

    @Test   // Forçando a mensagem de confirmação a errar
    public void imprimirConfirmacaoIncorretaTest() {
        Util util = new Util();

        boolean res = util.dispayMsg("teste");

        assertFalse(res);
    }

}
