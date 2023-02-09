/*
 * Isaac Van Meter
 * 1/27/23
 * Lab 1
 * This is my own original work
 */
package Labs;

public class lab1_VANM {

    public static void display(double[] lst){
        for (double num : lst){
            System.out.printf("%7.2f\n", num );
        }
    }

public static double[] computeVals(double[] lst){
    double[] ans = new double[21];
    for (int i = 0; i<21; i++){
        ans[i] = Math.sin(lst[i]) + Math.sin(lst[i]*lst[i]);
    }
    return ans;
}

    public static void main(String[] args) throws Exception{
        double[] listx = new double[21];
        for (int i = 0; i<21; i++){
            listx[i] = .5*i;
        }
        double[] listy = computeVals(listx);
        display(listy);
    }
    
}
