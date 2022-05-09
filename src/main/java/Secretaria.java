public class Secretaria extends Cargo {

    public Secretaria(float salarioBase){
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return salarioBase;
    }
}
