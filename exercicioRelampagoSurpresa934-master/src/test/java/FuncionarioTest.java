import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FuncionarioTest {
    @Test
    void deveRetornarPaisAlocacaoFuncionario(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento(new Funcionario());
        Grupo grupo = new Grupo(new Funcionario());
        Pais pais = new Pais("Brasil");
        Empresa empresa = new Empresa(grupo);

        grupo.setSede(pais);
        departamento.setEmpresa(empresa);
        funcionario.setAlocacao(departamento);
        assertEquals("Brasil", funcionario.getPaisDeAlocacaoFuncionario());
    }

    @Test
    void deveRetornarSemPaisAlocacaoFuncionario(){
        Funcionario funcionario = new Funcionario();
        Departamento departamento = new Departamento(new Funcionario());
        Grupo grupo = new Grupo(new Funcionario());
        Empresa empresa = new Empresa(grupo);

        departamento.setEmpresa(empresa);
        funcionario.setAlocacao(departamento);
        assertEquals("País não informado", funcionario.getPaisDeAlocacaoFuncionario());
    }


    @Test
    void deveRetornarEstadoDaFilialDoCoordenador(){
        Funcionario coordenador = new Funcionario();
        Filial filial = new Filial(new Cidade(new Estado("MG")));

        coordenador.setCoordenacao(filial);

        assertEquals("MG", coordenador.getEstadoDaFilialDoCoordenador());
    }

    @Test
    void deveRetornarExcecaoEstadoDaFilialDoCoordenador(){
        try{
            Funcionario coordenador = new Funcionario();
            Filial filial = new Filial(new Cidade(null));
            coordenador.setCoordenacao(filial);

            coordenador.getEstadoDaFilialDoCoordenador();
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Estado obrigatório", e.getMessage());
        }

    }

}