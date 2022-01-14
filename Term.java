import java.util.Objects;

public class Term implements Comparable
{
    private String term;
    private String  meaning ;

    public Term(String term, String meaning) {
        this.term = term;
        this.meaning = meaning;
    }

    public Term() {
        this.term = "";
        this.meaning="";
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    @Override
    public String toString() {
        return  term + "-" +meaning+"\n";
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Term)) return false;
        return ((this.term).equals(((Term) o).term));


    }


    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Term)) return -2;
        return (this.term).compareTo(((Term) o).term);
    }
}
