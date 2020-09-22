/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uff.ic.lleme.tcc00328_classroom.s20201.exercicios.exercicio9;

/**
 *
 * @author GuiTomaz
 */
public class GuilhermeTomazRA {
    public static  void main(String[] args){
            System.out.println("Hello world");
            int enesimo = termo(0); 
            System.out.println("n = 0, termo = "+ enesimo);
            enesimo = termo(1); 
            System.out.println("n = 1, termo = "+ enesimo);
            enesimo = termo(2); //Neste caso, n == 2, temos: termo(2-1)+termo(2-2) = 1 + 0 = 1
            System.out.println("n=2, 2º termo = "+ enesimo);
            enesimo = termo(3); //Neste caso, n == 3, temos: termo(3-1)+termo(3-2) = 1 + 1 = 2
            System.out.println("n =3, 3º termo = "+ enesimo);
            enesimo = termo(4); //Neste caso, n == 4, temos: termo(4-1)+termo(4-2) = 2+ 1
            System.out.println("n = 4, 4º termo = "+ enesimo);
            enesimo = termo(5); //Neste caso, n == 5, temos: termo(5-1)+termo(5-2) = 3+ 2
            System.out.println("n = 5, 5º termo = "+ enesimo);
            enesimo = termo(6); //Neste caso, n == 6, temos: termo(6-1)+termo(6-2) = 5+ 3
            System.out.println("n = 6, 6º termo = "+ enesimo);
            enesimo = termo(10); 
            System.out.println("n = 10, 10º termo = "+ enesimo);
            
    }
    
    public static int termo(int num){
         
        if(num == 0){
            return 0;
        }else if(num == 1){
            return 1;
        }
        int ant = 0; //termo( n -2)
        int aux = 1; // termo(n-1)
        int proxTermo = ant + aux;
        //System.out.println(proxTermo + " "); Caso queira ver a sequencia fibonacci e nao apenas o enesesimo.
        for(int i = 1;i<num;i++){
            proxTermo = ant+aux; 
            /*System.out.println(proxTermo +" ");
            
                Caso queira ver a sequencia fibonacci e nao apenas o enesimo termo.
            
            */ 
            ant = aux; 
            aux = proxTermo; 
        }
        return proxTermo;
    }
}
