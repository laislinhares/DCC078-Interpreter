import org.example.Funcionario;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    void deveCalcularExpressaoComFormula() {
        Funcionario funcionario = new Funcionario();
        funcionario.setSalario(2000);
        funcionario.setInsalubridade(1.1);
        funcionario.setFerias(500);
        funcionario.setComissao(200);

        assertEquals(2900, funcionario.calcularRemuneracao());
    }
}
