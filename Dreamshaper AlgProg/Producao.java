class Producao extends Funcionario {
        private int qtdPecas;
        private double valorPeca;

        public Producao (String nome, int cadastro, double salarioBase, int qtdPecas, double valorPeca) {
            super(nome, cadastro, salarioBase);
            this.qtdPecas = qtdPecas;
            this.valorPeca = valorPeca;
        }

        public double bonus(){ //Calcula o bônus
            return qtdPecas * valorPeca;
        }

        @Override //Sobreescreve o double calcSalario localizado originalmente em Funcionario.java
        public double calcSalario() {
            return salarioBase + bonus();
        }

        @Override //Sobreescreve o void exibirDados localizado originalmente em Funcionario.java
        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + cadastro);
            System.out.println("Tipo de funcionário: Produção");
            System.out.println("Salário fixo: " + salarioBase);
            System.out.println("Produtividade: " + bonus());
            System.out.println("Salário final: " + calcSalario());
        }
}