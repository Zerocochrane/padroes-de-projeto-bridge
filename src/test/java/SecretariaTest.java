import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecretariaTest {

    @Test
    void deveRetornarSecretariaTecnologia() {
        Setor setor = new Tecnologia();
        Secretaria secretaria = new Secretaria(5000.0f);
        secretaria.setSetor(setor);
        assertEquals(5000.0f, secretaria.calcularSalario(), 0.01f);
        assertEquals("TI", secretaria.setor.nomeSetor());
    }

    @Test
    void deveRetornarSecretariaFinanceiro() {
        Setor setor = new Financeiro();
        Secretaria secretaria = new Secretaria(5000.0f);
        secretaria.setSetor(setor);
        assertEquals(5000.0f, secretaria.calcularSalario(), 0.01f);
        assertEquals("Financeiro", secretaria.setor.nomeSetor());
    }

}