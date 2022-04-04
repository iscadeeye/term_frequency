package academy.learningProgramming;

public class Main {
    /*

     String substring(): This method has two variants and returns a new string that is a substring
     of this string. The substring begins with the character at the specified index and extends to the
     end of this string. And index of substring starts from 1 and not from 0.


     */

    public static void main(String[] args) {
        String doc = "At Google, we don’t just accept difference — we celebrate it, we support it," +
                " and we thrive on " +
                "it for the benefit of our employees, our products, and our community. Apprentices " +
                "become part of our mission to build great products for every user, and their different" +
                " experiences help ensure that our products are as diverse as our users.";

        String term = "we";
        IRUtil irUtil = new IRUtil();
        System.out.println("The term weigh is " + irUtil.termFrequency(doc, term));



    }


}
