import java.util.Scanner;
public class Gender
{
    public static void main(String[] args)
    {
        String gender;
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your gender, male of female?");
        gender = scan.nextLine();


        if( "f".equals(gender)||gender =="F"||gender =="female"||gender 
            =="Female"||"FEMALE".equals(gender))
        {
            System.out.println("A female" );
        }
        if( "m".equals(gender)||gender =="M"||gender =="male"||gender 
            =="Male"||"MALE".equals(gender))
        {
            System.out.println("A male.");
        }
    }
}
