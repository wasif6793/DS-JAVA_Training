package Java_Programs.Arrayss;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Decimaltobinaryconvert {
    public static void decimaltobinary(int n) {
        int binarynum[]=new int[1000];
        int i=0;
        while(n>0){
            binarynum[i]=n%2;
            n=n/2;
            i++;

        }
        for(int j=i-1;j>=0;j--){
            System.out.print(binarynum[j]);
            int arr[] = new int[]{binarynum[j]};
            System.out.println();
        }



    }
    public static void main(String[] args) {
        decimaltobinary(17);
    }
}