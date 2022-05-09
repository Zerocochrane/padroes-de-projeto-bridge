import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    void deveRetornarDiretorTecnologia() {
        Setor setor = new Tecnologia();
        Diretor diretor = new Diretor(10000.0f);
        diretor.setSetor(setor);
        assertEquals(10000.0f, diretor.calcularSalario(), 0.01f);
        assertEquals("TI", diretor.setor.nomeSetor());
    }

    @Test
    void deveRetornarDiretorFinanceiro() {
        Setor setor = new Financeiro();
        Diretor diretor = new Diretor(10000.0f);
        diretor.setSetor(setor);
        assertEquals(10000.0f, diretor.calcularSalario(), 0.01f);
        assertEquals("Financeiro", diretor.setor.nomeSetor());
    }
}