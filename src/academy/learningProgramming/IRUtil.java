package academy.learningProgramming;
//Term frequency document
public class IRUtil {

    public double termFrequency(String doc, String term){

        int frequencyCounty = getFrequencyCounty2(doc, term);
        int totalTermCounty = doc.split(" ").length;

        return (double) frequencyCounty/totalTermCounty;
    }

    private int getFrequencyCounty2(String doc, String term){

        term = term.toLowerCase();
        doc = doc.toLowerCase();

        int frequencyCounty = 0;
        int index = doc.indexOf(term);//returns the index of the first letter of the specified term.

        while (index >= 0){
            frequencyCounty += 1;

            doc = doc.substring(index + term.length());
            index = doc.indexOf(term);
        }
        return frequencyCounty;
    }



}
