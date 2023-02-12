class JoggedArray
{
public static void main(String args[ ] )
{
Scanner Sc=new Scanner(System.in);

int arr[][]=new int[3][];

for(int i=0;i<arr.length;i++)
{
System.out.print("Enter the number of col for row " + i + ":");
int col=Sc.nextInt();
arr[i]=new int[col];
for(j=0;j<arr[i].length;j++)
{
System.out.print("Enter value for index " +  i" " j + " ");
arr[i][j]=Sc.nextInt();

for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+"");
}
System.out.println();


