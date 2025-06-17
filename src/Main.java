import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            FileReader fileReader= new FileReader("text.txt");
            fileReader.read();
        } catch (Exception e) {
            System.out.println("Exception");
            System.exit(1);
        }finally {
            System.out.println("Finally");
            System.out.println("End");
        }
    }
}

        

