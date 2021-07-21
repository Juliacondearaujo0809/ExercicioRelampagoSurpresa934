import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DepartamentoTest {
    @Test
    void deveRetonarEscolaridadeChefeDoDepartamento(){
        Funcionario chefe = new Funcionario();
        Departamento departamento = new Departamento(chefe);
        Escolaridade escolaridade = new Escolaridade("Doutor");

        chefe.setEscolaridade(escolaridade);

        assertEquals("Doutor", departamento.getEscolaridadeChefeDepartamento());
    }

    @Test
    void deveRetonarExcecaoChefeDoDepartamento(){
        try{
            Departamento departamento = new Departamento(null);

            departamento.getEscolaridadeChefeDepartamento();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Chefe é obrigatório", e.getMessage());
        }


    }

}