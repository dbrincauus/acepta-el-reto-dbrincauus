package adabyron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
 
public class problema545 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            if(sc.hasNext()!=true) {
                break;
            }
            int lngtray = Integer.parseInt(sc.next());
            int ncoches = Integer.parseInt(sc.next());
            List<Integer> ls = new ArrayList<>();
            if(ncoches==1) {
                for(int i= 0;i<ncoches*2;i++) {
                    ls.add(Integer.parseInt(sc.next()));
                }
            }else {
                for(int i= 0;i<ncoches*2;i++) {
                    ls.add(Integer.parseInt(sc.next()));
                }
            }

            int r= 10001;
            for(int i2=0;i2<ls.size();i2=i2+2) {
                int itiempo= ls.get(i2);
                int velocidad= ls.get(i2+1);
                int z = (lngtray/velocidad)+(itiempo);
                if(z<r && z >=0) {
                    r= z;
                }
            }
            System.out.println(r);
        }
    }
}