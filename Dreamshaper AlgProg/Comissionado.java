class Comissionado extends Funcionario {
        private double venda;
        private double percentual;

        public Comissionado(String nome, int cadastro, double salarioBase, double venda, double percentual) {
            super(nome, cadastro, salarioBase);
            this.venda = venda;
            this.percentual = percentual;
        }

        public double comissao() { //Calcula a comissão
            return venda * percentual / 100;
        }

        @Override //Sobreescreve o double calcSalario localizado originalmente em Funcionario.java
        public double calcSalario() {
            return salarioBase + comissao();
        }

        @Override //Sobreescreve o void exibirDados localizado originalmente em Funcionario.java
        public void exibirDados() {
            System.out.println("Nome: " + nome);
            System.out.println("Matrícula: " + cadastro);
            System.out.println("Tipo de funcionário: Comissionado");
            System.out.println("Salário fixo: " + salarioBase);
            System.out.println("Comissão: " + comissao());
            System.out.println("Salário final: " + calcSalario());
        }
    }