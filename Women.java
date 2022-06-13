public class Women extends Clothing
{
  private String extendedSize; 

  public Women()  
  {
    super();
    extendedSize = "tall";
  }

  public Women(double p, String c, String n, int q, String b, String s, String exS)
  {
    super(p, c, n, q, b, s);
    extendedSize = exS;
  }

  public String getExtendedSize()
  {
    return extendedSize;
  }

  public void setExtendedSize(String es)
  {
    extendedSize = es;
  }

  public String toString() 
  {
    return super.toString() + " and style " + this.getExtendedSize() + ".";
  }
}
