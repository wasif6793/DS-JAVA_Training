package Java_Programs.ExceptionHandling;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("1.");

        // Arithmetic Exception : / by zero exception
        try{
            System.out.println(100/0);
        } catch (Exception e){
            System.out.println(e);
    }
        System.out.println("2.");

        String n = null;
        String ni ="";
         try{

            // Null Pointer Exception

            System.out.println(n.length());
            System.out.println(ni.length());
        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("3.");


         // Number Format error

         String fullname = "Wasif Sheikh";



         try{
             int z = Integer.parseInt(fullname);
         } catch (Exception e){
             System.out.println(e);
         }

        System.out.println("4. ");

         // Out of Bound Exception

        int arr[] = {1,2,34};

        try{
            System.out.println(arr[4]);
        } catch(Exception e){
            System.out.println(e);
        } finally {
            System.out.println(" FInally");
        }
        System.out.println();



        /// Read the Exception Name

        // We use try and catch to handle the exception.
    }
}
