import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Loteria {
    private static final int QTDE_DEZENAS = 6;
    private static final int MENOR_DEZENA = 1;
    private static final int MAIOR_DEZENA = 60;
    
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador();
        jogador1.apostar(QTDE_DEZENAS,MENOR_DEZENA,MAIOR_DEZENA);
        
        int[] numeroSorteados=Sorteio.sortear(QTDE_DEZENAS, MENOR_DEZENA, MAIOR_DEZENA);
        List<Integer> myList = new ArrayList<>();
        for(Integer dezenaJogador : jogador1.getAposta()){
            for(Integer dezenaSorteio : numeroSorteados)
            if( dezenaJogador == dezenaSorteio){
                myList.add(dezenaJogador);
                
                }
                
            }
            System.out.printf("voce acertou : "+ myList.size()+" numeros\n");
            System.out.printf("esta foi sua aposta: " + Arrays.toString(jogador1.getAposta())+"\n" );
            System.out.printf("estes sao os numeros sorteados :" + Arrays.toString(numeroSorteados)+" \n");
            if(myList.size()>0){
                System.out.printf("voce nao ganhou mas acertou"+ myList.size()+" dezenas estes sao os numeros que voce acertou :"+myList+" \n");
            }else if(myList.size()>4){
                System.out.printf("voce ganhouuu parabenss acertando "+myList.size() +" dezenas,estes sao os numeros que voce acertou :"+myList+" \n");
                
            }else{
                System.out.printf("Voce nao acertou nenhuma dezena infelizmente\n");
            }
      } 
}
