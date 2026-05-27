class Funcionario {
        protected  String nome;
        protected int cadastro;
        protected double salarioBase;

        public Funcionario(String nome, int cadastro) {
                this.nome = nome;
                this.cadastro = cadastro;
        }

        public double calcSalario() {
                return salarioBase;
        }

        public void exibirDados() {

                System.out.println("Nome: " + nome);
                System.out.println("Matrícula: " + cadastro);
                System.out.println("Tipo de funcionário: Padrão");
                System.out.println("Salário fixo: " + salarioBase);
                System.out.println("Extras: 0.00");
                System.out.println("Salário final: " + calcSalario());

        }
}