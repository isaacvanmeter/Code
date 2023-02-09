/*
 * Isaac Van Meter
 * 1/31/23
 * Homework C-1
 * This is my own original work.
 */
import java.util.Random;

public class HWC1_VANM {

    public static Lamp[][] stepOne(){
        Lamp[][] arr = new Lamp[6][5];
        Random rd = new Random();
        for (int i = 0; i<6; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = new Lamp();
                if (rd.nextInt(2) + 1 == 1){
                    arr[i][j] = arr[i][j].turnOn();
                }
                else{
                    arr[i][j] = arr[i][j].turnOff();
                }
            }
        }
        return arr;
    }

    public static Lamp[][] stepTwo(Lamp[][] arr){
        //first ten
        for(int i = 0; i<2; i++){
            for (int j = 0; j<5; j++){
                arr[i][j] = arr[i][j].flip();
            }
        }
        //second ten
        for(int k = 2; k<4; k++){
            for (int l = 0; l<5; l++){
                arr[k][l] = arr[k][l].turnOff();
            }
        }
        //third ten
        for(int x = 4; x<6; x++){
            for (int y = 0; y<5; y++){
                arr[x][y] = arr[x][y].turnOn();
            }
        }
        return arr;
    }

    public static void display(Lamp[][] arr){
        for (int i = 0; i<6; i++){
            System.out.println(" ");
            for (int j = 0; j<5; j++){
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public static void main(String[] args) throws Exception{
        Lamp[][] arr1 = stepOne();
        display(arr1);
        System.out.println(" ");
        Lamp[][] arr2 = stepTwo(arr1);
        display(arr2);
    }
        
    
}
