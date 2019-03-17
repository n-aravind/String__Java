
public class Main {
    public static void main(String[] args) {

        String testString = "This is a test string";

        String anotherString = "This is a test string";

        String anotherCaseString = "ThIs iS a Test String";

        System.out.println(testString.equals(anotherString));
        System.out.println(testString.equals(anotherCaseString));
        System.out.println(testString.equalsIgnoreCase(anotherCaseString));

        System.out.println(testString.compareTo(anotherString));
        System.out.println(testString.compareTo(anotherCaseString));
        System.out.println(testString.compareToIgnoreCase(anotherCaseString));

        System.out.println(testString.toUpperCase().equals(anotherCaseString.toUpperCase()));

        System.out.println(testString.length());

        System.out.println(testString.endsWith("string"));

        testString.concat(". This is concatenated to test String");
        System.out.println(testString);

        String concatString = testString.concat(". This is concatenated to test String");
        System.out.println(concatString);

        String[] stringArray = concatString.split(" ");

        for(String words : stringArray){
            System.out.print(words + "\t");
        }

        System.out.println(testString.indexOf("test"));
        System.out.println(concatString.lastIndexOf("test"));

        String smallString = testString.substring(5);
        String anotherSmallString = testString.substring(5,10);

        System.out.println(testString.regionMatches(5,"is",0,2));







    }
}
