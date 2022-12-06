//Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta.
// O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e
// passar estes valores para a função valorPagamento,
//que calculará o valor a ser pago e devolverá este valor ao programa que a chamou.
//O programa deverá então exibir o valor a ser pago na tela

// Após a execução o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja 
//informado um valor igual a zero para a prestação. Neste momento o programa deverá ser encerrado, 
//exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia. 
//O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, 
//cobrar o valor da prestação. 
//Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.


import java.util.Scanner;

public class atv7 {
    static void valorPagamento(double valor,int dias){
        do{
        double juros = 0.03;
        if (dias == 0){
            System.out.println(valor);;
        }
        else{
            juros = 0.3 * dias;
        }
            valor=valor + ((3 * valor)/100) + juros;
            System.out.println( valor); 
    
        }
    while (valor != 0);
        
    }
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o valor da prestação: ");
        double valor =entrada.nextDouble();
        System.out.println("Digite o números de dias de atraso: ");
        int dias = entrada.nextInt();
        entrada.close();
    
    valorPagamento(valor,dias);
    }}
   
    
    
    
    
    
        