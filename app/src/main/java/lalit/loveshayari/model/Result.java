package lalit.loveshayari.model;

/**
 * Created by lalit on 11/8/2017.
 */

public class Result {
    private String textdata;

    public String getTextdata ()
    {
        return textdata;
    }

    public void setTextdata (String textdata)
    {
        this.textdata = textdata;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [textdata = "+textdata+"]";
    }
}
