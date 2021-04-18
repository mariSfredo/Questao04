/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4;


/**
 *
 * @author Mari
 */
public class Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // teste unitário
        String resultado  = ConcatERemove("blablablabla", "blablabcde", 8); //String resultado obtem o retorno da função ConcatWRemove, na função está atribuído os parametros de entrada do s, t e k
        
        if(resultado.equals("sim") ){ // se retorno da função é igual a sim exibe a mensagem teste validado
            System.out.println("Teste Validado");
        } else { // se não exibe a mensagem de teste não validado
        
            System.out.println("Teste não validado");
        }
        
        
    }
    
        //função ConcatERemove
    public static String ConcatERemove(String s,String t,int k){
       
        int tamanhoT = t.length();
        String s2 = "";
        int contMovimentacoes = 0;
        
        int j = 0;
        
        if(s.equals(t)){ //quando as palavras s e t são iguais  
            System.out.println("Palavras iguais");
            s = ""; //1 movimentação
            contMovimentacoes++;  
            for(int z = 0; z < t.length(); z++){
                s2 = s2 + "" + t.charAt(j);
                contMovimentacoes++;
                j++;
            }
                  
        } else if(s.length() > tamanhoT){ //palavras diferentes e tamanho de s maior de t
            for (int i = 0; i < s.length(); i++) {

                if( i < tamanhoT){
                    if (s.charAt(i) ==  t.charAt(j)){ //enquanto os caracteres é igual, ele entra no if

                        s2 = s2 + "" + s.charAt(i);
                        contMovimentacoes = s.length() - s2.length();

                    }  else { // os caracteres são diferentes, entra no else e conta a quantidade de movimentações
                    s2 = s2 + "" + t.charAt(j);
                    contMovimentacoes++;

                    }
                }           
                j++;
            }

        } else { //quando t é maior que o s
            
            s = ""; // 1 movimentação
            contMovimentacoes++;
            for(int i = 0; i < t.length(); i++){
                s2 = s2 + "" + t.charAt(i);
                contMovimentacoes++;
            }
            
        }
            
            s = s2; //s recebe atribuição do s2 auxiliar que tem os valores da palavra t
            if(contMovimentacoes <= k) {
                return "sim";
            } else {
                return "não";
        }
               
    }
    
}
