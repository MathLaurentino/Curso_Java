import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* 
    Operações intermediárias
    • filter: Filtra os elementos do stream com base em um predicado.
    • map: Transforma cada elemento do stream usando a função fornecida.
    • flatMap: Transforma cada elemento do stream em zero ou mais elementos de outro stream e os concatena em um único stream.
    • peek: Executa uma ação para cada elemento do stream sem modificar o próprio stream.
    • distinct: Remove elementos duplicados do stream.
    • sorted: Ordena os elementos do stream com base em uma ordem natural ou comparador fornecido.
    • skip: Pula os primeiros n elementos do stream.
    • limit: Limita o número de elementos no stream para no máximo o valor especificado (*).
    * short-circuit
*/
/*
    Operações terminais
    • forEach: Executa uma ação para cada elemento do stream.
    • forEachOrdered: Executa uma ação para cada elemento do stream mantendo a ordem de encontro.
    • toArray: Converte o stream em um array.
    • reduce: Combina os elementos do stream em um único valor usando uma função associativa.
    • collect: Acumula os elementos do stream em uma coleção ou outro tipo de objeto.
    • min: Encontra o menor elemento do stream com base em um comparador.
    • max: Encontra o maior elemento do stream com base em um comparador.
    • count: Conta o número de elementos no stream.
    • anyMatch: Verifica se pelo menos um elemento do stream satisfaz um predicado (*).
    • allMatch: Verifica se todos os elementos do stream satisfazem um predicado (*).
    • noneMatch: Verifica se nenhum elemento do stream satisfaz um predicado (*).
    • findFirst: Retorna o primeiro elemento do stream (*).
    • findAny: Retorna qualquer elemento do stream (*).
    * short-circuit
 */

public class Program1 {
      
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
        Stream<Integer> st1 = list.stream();
        System.out.println(Arrays.toString(st1.toArray()));

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));
        
    }

}