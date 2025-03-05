package ExercicioMetodos;

public class TestaFuncionario {

    public static void main(String[] args) {
     
        //criando o objeto funcionario 1 
        Funcionarios f1 = new Funcionarios();
        //criando o objeto funcionario 2
        Funcionarios f2 = new Funcionarios();
        
        
        //Colocando dados de Funcionario 1 em memoria
        f1.nome = "Erick Williams Nogueira Cazalla";
        f1.funcao = "Analista de Sistema";
        f1.salario = 5000;
        //Colocando dados de Funcionario 2 em memoria
        f2.nome = "Marcos Costa de Sousa ";
        f2.funcao = "CEO Centro Paula Souza";
        f2.salario = 100000;
        
        
        // Realizando o teste se esta funcionado 1 
        System.out.println("Nome do Funcionario: " + f1.nome);
        System.out.println("Cargo ou Função: " + f1.funcao);
        System.out.println("Salario do funcionario: " + f1.salario);
        //dividindo para dar uma quebra de linha
        System.out.println("__________________________________________");
        // Realizando o teste se esta funcionado 2
        System.out.println("Nome do Funcionario: " + f2.nome);
        System.out.println("Cargo ou Função: " + f2.funcao);
        System.out.println("Salario do funcionario: " + f2.salario);
        //dividindo para dar uma quebra de linha
        System.out.println("__________________________________________");
        
        
        
        // realizando a entrada de quantos porcento sera o aumento do funciinario 1
        f1.aumentaSalario(20);
        //dividindo para dar uma quebra de linha
        System.out.println("__________________________________________");
        // realizando a entrada de quantos porcento sera o aumento do funciinario 2
        f2.aumentaSalario(80);
        
        
        
        //dividindo para dar uma quebra de linha
        System.out.println("__________________________________________");
       
        
        
        
        //Realizadno a consulta de dados do funcionario  
        f1.consultaDados();
        System.out.println("__________________________________________");
        f2.consultaDados();
    }
    
}
