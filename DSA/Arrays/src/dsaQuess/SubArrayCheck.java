package dsaQuess;

public class SubArrayCheck {
    public static void main(String[] args) {

        System.out.println(isSubset());


    } //  long a1[], long a2[], int n, int m
    public static String isSubset() {
        long a1[] = {7,5};
        long a2[] = {8,4, 5, 3, 1, 7, 9, 5, 1, 3, 7, 9};
        int n = a1.length;
        int m = a2.length;

        if(n > m){
            for(int i = 0; i < n; i++){
                for(int j = 0; j< m;j++){

                    if(a1[i] == a2[j]){
                         return "Yes";
                    } else {
                        return "No";
                    }
                }
            }
        } else {
            for(int i = 0; i < m; i++){
                for(int j = 0; j< n;j++){

                    if(a1[j] == a2[i]){
                        return "Yes";
                    } else {
                        return "No";
                    }
                }
            }

        }


//        for(int i = 0; i < n; i++){
//            for(int j = 0; j< m;j++){
//
//                if(a1[i] == a2[j]){
//                    return "Yes";
//                } else {
//                    return "No";
//                }
//            }
//        }
        return "No";
    }
}
