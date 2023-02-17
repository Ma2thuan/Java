import java.util.Scanner;

public class Main {
    public static void main (String[] args ){
        int count=0,frequency=0,index =0;
        int[] Arr = new int [] {6,6,6,6,6,6,6,6,6,6,6,6,1,2};
            for (int i = 0; i < 14; i++){
                for (int j= 0 ;j < 14; j++ ){
                    if (Arr[i] == Arr[j]){
                        count++;
                        if (count > frequency){
                            frequency =count;
                            index = Arr[i];
                        }
                    }

                }
                count = 0;
            }
            if (frequency == 0)
                System.out.println("Khong co so nao lap lai trong day");
            else
                System.out.println("So " + index + " xuat hien " + frequency +" lan trong day");

    }

}