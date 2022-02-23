/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;
import java.util.Scanner;
public class Suhu {

    public static void main(String[] args) {
        
        Float s,suhu;
        Scanner Input = new Scanner(System.in);
        
        System.out.println("Konversi suhu");
        
        String[] Suhu = {"Fahrenheit","Kelvin","Reamur"};
        for (int i = 0; i<Suhu.length; i++){
            System.out.println(i +"."+Suhu[i]);
        }
        
        System.out.print("Masukan Satuan Suhu Yang Dipilih = ");
        int satuan = Input.nextInt();
        
        System.out.print("Masukan masukkan suhu Celcius anda = ");
        s = Input.nextFloat();
         
        if (s > 38){
            System.out.println("suhu tubuh anda termasuk rawan covid 19");
        }else{
            System.out.println("suhu tubuh anda aman covid 19 ");
        }
        
        switch(satuan){
            case 0:
                suhu = (9/5* s)+32;
                System.out.println("Suhu Fahrenheit = "+suhu);
                break;
            case 1:
                suhu = s+273;
                System.out.println("Suhu kelvin = "+suhu);
                break;
            case 2:
                suhu = s*4/5;
                System.out.println("Suhu Reamur = "+suhu);
                break;
            default:
                System.out.println("Suhu tidak dapat dikonversi");
        }
    }
    
}
