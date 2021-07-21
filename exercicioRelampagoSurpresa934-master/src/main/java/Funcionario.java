public class Funcionario {
    private Escolaridade escolaridade;
    private Departamento alocacao;
    private Filial coordenacao;
    private String nomeFuncionario;


    public Escolaridade getEscolaridade() {
        return escolaridade;
    }
    public void setEscolaridade(Escolaridade escolaridade) {
        this.escolaridade = escolaridade;
    }

    public Departamento getAlocacao() {
        return alocacao;
    }
    public void setAlocacao(Departamento alocacao) {
        this.alocacao = alocacao;
    }

    public Filial getCoordenacao() {
        return coordenacao;
    }
    public void setCoordenacao(Filial coordenacao) {
        this.coordenacao = coordenacao;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }


    public String getEscolaridadeFuncionario(){
        return escolaridade.getNivelEscolaridade();
    }

    public String getPaisDeAlocacaoFuncionario(){
        if (alocacao.getEmpresa().getGrupo().getSede() == null)
            return "País não informado";
        return alocacao.getEmpresa().getGrupo().getSede().getNomePais();
    }

    public String getEstadoDaFilialDoCoordenador(){
        if (coordenacao.getCidade().getEstado() == null)
            throw new IllegalArgumentException("Estado obrigatório");
        return coordenacao.getCidade().getEstado().getNomeEstado();
    }
}
