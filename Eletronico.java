public abstract class Eletronico {
    protected String nome;
    protected int codigo;
    protected double valorBase;

    public Eletronico () {
    }

    public Eletronico (String nome, int codigo, double valorBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.valorBase = valorBase;
    }

}
