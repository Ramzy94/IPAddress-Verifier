import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class IPValidator
{
    private Matcher matcher;
    private Pattern pattern;

    public IPValidator() {
        pattern = Pattern.compile("(\\d{1,3})(\\.{1})(\\d{1,3})(\\.{1})(\\d{1,3})(\\.{1})(\\d{1,3})"); //checks for correct format
    }

    public boolean IPcheck(String IPaddr)
    {
        matcher = pattern.matcher(IPaddr);
        if(matcher.find())
        {
            String[] theValues = IPaddr.split("\\.");
            System.out.print(theValues.length);

            for(int i=0;i<theValues.length;i++)
            {
                System.out.print(theValues[i]);

                int number = Integer.parseInt(theValues[i]);
                if(number>255)
                    return false;
            }
            return true;
        }
        else
            return false;
    }

}