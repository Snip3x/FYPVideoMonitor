import info.debatty.java.stringsimilarity.Cosine;
import info.debatty.java.stringsimilarity.Jaccard;
import info.debatty.java.stringsimilarity.interfaces.StringSimilarity;

import java.util.Locale;

public class TextTest {
    public static void main(String[] args) {
        Cosine cos = new Cosine();
        Jaccard jac = new Jaccard();
        double d = jac.similarity("My $tring".toLowerCase(Locale.ROOT)
                ,"my string".toLowerCase(Locale.ROOT));
        double dd =cos.similarity("My $tring".toLowerCase(Locale.ROOT)
                ,"my string".toLowerCase(Locale.ROOT));
        System.out.println(d);
        System.out.println(dd);
    }
}
