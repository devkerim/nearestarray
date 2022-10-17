import java.util.Scanner;
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner intscanner  = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int r = intscanner.nextInt();
	int[] list = {-5,80,732,-85,9,7,63,12};
	Arrays.sort(list);
	int max=list[list.length-1];
	int min=list[0];
    for(int i:list){
        if(i>min&&i<r){
            min=i;
        }

        if(i<max&&i>r){
            max=i;
        }
    }

    if(r<min){
        System.out.println("Dizideki en küçük eleman : "+r);
        System.out.println("Girdiğiniz değere en yakın büyük eleman: "+max);}
    else if(r>max){
        System.out.println("Dizideki en  büyük eleman : "+r);
        System.out.println("Girdiğiniz değere en yakın küçük eleman: "+min);}
    else{
    System.out.println("Girdiğiniz değere en yakın küçük eleman: "+min);
    System.out.println("Girdiğiniz değere en yakın büyük eleman: "+max);}

    }
}
