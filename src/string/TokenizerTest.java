package string;

import java.util.StringTokenizer;

public class TokenizerTest {
    public static void main(String[] args) {
        String string = "Java, JSP, Servlet, JSF, JDBC, JPA, EJB, JMS, JAZ-WS, JAX-RS, CDI";
        StringTokenizer tokenizer = new StringTokenizer(string, ",.:;",true);
        while(tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println("Dizgecik: " + token);
        }

        String[] tokens =  string.split(",");
        for (String token : tokens) {
            System.out.println("# Dizgecik: " + token);
        }

        for (String token : string.split(", ")) {
            System.out.println("# Dizgecik: " + token);
        }


    }
}
