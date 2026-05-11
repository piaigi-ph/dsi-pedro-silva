public class Exemplos3 {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i = i / 2; i++ ){
      System.out.println(i);
    }  
  }
// nesse exemplo, o loop for não irá funcionar corretamente, pois a condição de incremento (i = i / 2) irá causar um loop infinito.
