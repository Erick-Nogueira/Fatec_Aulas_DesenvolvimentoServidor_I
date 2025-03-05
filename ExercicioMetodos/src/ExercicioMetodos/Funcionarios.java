
package ExercicioMetodos;


public class Funcionarios {
    String nome;
    String funcao;
    double salario;
    double aumento;
    
    //Criando a Regra de aumento do funcionario e mostrando em tela
    void aumentaSalario (double valor){
        if (valor > 0){
            aumento = salario * (valor/100);
            System.out.println("Nome de Funcionario: " + nome);
            System.out.println("Aumento de Salario: " + aumento);
            System.out.println("Salario aumentou: " + valor + "%");
        }else{
            System.out.println("Valor invalido");
        }    
        }
    
    
    //Criando o metodo de Consulta do Funcinario
    void consultaDados() {
        System.out.println("Nome de Funcionario: " + nome);
        System.out.println("Função: " + funcao);
        System.out.println("Aumento de Salario: " + aumento);
        System.out.println("Salario de Funcionario: " + (salario += aumento));
    }
    
    

    
}
