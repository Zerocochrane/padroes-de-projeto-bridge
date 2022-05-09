public abstract class Cargo {

    protected Setor setor;

    protected float salarioBase;

    public Cargo(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public abstract float calcularSalario();
    }

