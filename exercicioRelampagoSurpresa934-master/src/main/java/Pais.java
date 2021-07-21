public class Pais {
    private String nomePais;

    public Pais(String nomePais) {
        if (nomePais != null)
            this.nomePais = nomePais;
    }

    public String getNomePais() {
        return nomePais;
    }
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
}
