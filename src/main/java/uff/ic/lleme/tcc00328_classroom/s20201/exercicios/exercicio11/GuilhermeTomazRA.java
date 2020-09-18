/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio11;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static void main(String[]args){
        /*
        2 e o primeiro numero primo e ja sera colocado na variavel 'produtoPrimos', multiplicando pelos outros primos diferentes dele de 1 a 50.
        */
        long produtoPrimos = prodPrimos(); 
        System.out.println("Resultado = " + produtoPrimos);
    }
    
    public static long prodPrimos(){
       long result = 2; //2 e o primeiro numero primo
       for(int i = 3;i<50;i++){
           result = result * VerificaPrimo(i);
       }
       return result; 
    }
   
    public static int VerificaPrimo(int numero){
         /*
        PS: Reutilizando o método que criei no exercício 4 para verificar se um número é primo ou não. Porém, com algumas modificações,
        agora o método retorna "int" ao invés de boolean, para retornar o número primo.
        Este metodo desconsidera o numero 2, avalia numeros primos a partir do 3.
        */
        int aux = 2;
        boolean primo = true;
        do{
          if(numero % aux == 0){
              primo = false;
              break;
          } 
          aux++;
        }while(aux<numero/2);
        if(primo){
            return numero;
        }
        return 1; //Se o numero nao for primo, o produto sera multiplicado por 1 para nao alterar o resultado
    }
}

