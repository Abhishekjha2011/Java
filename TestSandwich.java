class sandwich 
{
private String ingrediant;
private String breadtype;
private double price;
 
void String set ingrediant(String i);
{
ingrediant=i

}
String getIngrediant ()
{
return ingrediant;
}
classTestsandwich
{
public static void main(String []args)
{
sandwich s=new sandwich ();
s.setIngrediant("sauce");
system.out.println(s.getIngrediant());
s.setIngrediant("brown");
system.out.println(s.getIngrediant());

s.setIngrediant(" ");
system.out.println(s.getIngrediant());
}
}