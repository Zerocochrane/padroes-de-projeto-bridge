public class Diretor extends Cargo {

    public Diretor(float salarioBase){
        super(salarioBase);
    }

    @Override
    public float calcularSalario() {
        return salarioBase;
    }
}