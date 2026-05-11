public class   Exemplos4 {
  public static void main(String[] args) {
    for (int i = 0; i < 10; i++) {
      if (i == 4) {
        continue;
      }
      System.out.println(i);
    }  
  }
}
// nesse exemplo, o loop for irá imprimir os números de 0 a 9, exceto o número 4, pois quando i for igual a 4, a instrução continue será executada.
//  fazendo com que o loop pule a iteração atual e continue com a próxima.