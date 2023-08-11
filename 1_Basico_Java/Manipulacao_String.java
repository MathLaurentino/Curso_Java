public class Manipulacao_String {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG ";
        
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();// retira os espaços na borda da string
        String s04 = original.substring(2);// recorta a string a partir do index 2
        String s05 = original.substring(2, 9);// recorta a string a partir do index 2 ate o anterior ao 9
        String s06 = original.replace('a', 'x');// substitui a por x
        String s07 = original.replace("abc", "xy");// substitui abc por xy
        int i = original.indexOf("bc");// indica o index da primeira ocorrencia de "bc"
        int j = original.lastIndexOf("bc");// indica o index da ultimo ocorrencia de "bc"
        
        System.out.println("Original: -" + original + "-");//-abcde FGHIJ ABC abc DEFG -
        System.out.println("toLowerCase: -" + s01 + "-");//-abcde fghij abc abc defg -
        System.out.println("toUpperCase: -" + s02 + "-");//-ABCDE FGHIJ ABC ABC DEFG -
        System.out.println("trim: -" + s03 + "-");//-abcde FGHIJ ABC abc DEFG-
        System.out.println("substring(2): -" + s04 + "-");//-cde FGHIJ ABC abc DEFG -
        System.out.println("substring(2, 9): -" + s05 + "-");//-cde FGH-
        System.out.println("replace('a', 'x'): -" + s06 + "-");//-xbcde FGHIJ ABC xbc DEFG -
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");//-xyde FGHIJ ABC xy DEFG -
        System.out.println("Index of 'bc': " + i);// 1
        System.out.println("Last index of 'bc': " + j);// 17
        
        String s = "potato apple lemon";
        
        String[] vect = s.split(" ");// separa em um vetor um string a partir do separador indicado  
        String word1 = vect[0];
        String word2 = vect[1];
        String word3 = vect[2];
        
        System.out.println();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        
    }

}
