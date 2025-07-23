public class TextProcessor {
    public static void main(String[] args) {
        String sentence = "Coding in Java is awesome";
        System.out.println("Original sentence:" + sentence);
        countWords(sentence);
        replaceWord(sentence);
    }
    public static int countWords(String sentence){
        int countWords = sentence.split("\\s").length;
System.out.println("Word count:"+ countWords );
        return countWords;
    }
    public static String replaceWord(String sentence){
        String newWord = sentence.replace("Java", "Programming");
        System.out.println("After replacement:"+  newWord );
        return newWord;
    }
}
