import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

// Set<T>
// • Representa um conjunto de elementos (similar ao da Álgebra)
//      • Não admite repetições
//      • Elementos não possuem posição
//      • Acesso, inserção e remoção de elementos são rápidos
//      • Oferece operações eficientes de conjunto: interseção, união, diferença.
//      • Principais implementações:
//          • HashSet - mais rápido (operações O(1) em tabela hash) e não ordenado
//          • TreeSet - mais lento (operações O(log(n)) em árvore rubro-negra) e ordenado pelo
//              compareTo do objeto (ou Comparator)
//          • LinkedHashSet - velocidade intermediária e elementos na ordem em que são adicionados


// • add(obj), remove(obj), contains(obj) 
//      • Baseado em equals e hashCode
//      • Se equals e hashCode não existir, é usada comparação de ponteiros
// • clear()
// • size()
// • removeIf(predicate)

// • addAll(other) - união: adiciona no conjunto os elementos do outro conjunto, sem repetição
// • retainAll(other) - interseção: remove do conjunto os elementos não contitos em other
// • removeAll(other) - diferença: remove do conjunto os elementos contidos em other


public class Program {
    public static void main(String[] args) {

        Set<String> set = new TreeSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));
        
        for (String p : set) {
            System.out.println(p);
        }
    }
    
}