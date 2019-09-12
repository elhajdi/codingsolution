import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ShadowOfTheKnight {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int Xo = 0;
        int Yo = 0;
        int Xn = W-1;
        int Yn = H-1;
        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            int Xr = Xo;
            int Yr = Yo;
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");
            System.err.println("I Por:"+Xo+","+Yo+ ", Pn:"+(Xn)+","+(Yn));
            System.err.println(X0+","+Y0+" - "+bombDir);
            
            if(bombDir.contains("L")) {
                 Xr = (X0 - Xo) /2;
                 // Xr = (Xn - X0) /2;
                 Xn = X0;
                 if(!bombDir.contains("U") && !bombDir.contains("D")  ) {
                     Yn= Y0;
                     Yr = Y0;
                 }
            }
            
            if(bombDir.contains("U")) {
                 Yr = Yo + (Y0 - Yo) / 2;
                 // Yr = (Yn - Y0) /2;
                 Yn = Y0;
                 if(!bombDir.contains("L") && !bombDir.contains("R") ) {
                     Xn= X0;
                     Xr= X0;
                 }
            }
            
            if(bombDir.contains("R")) {
                Xr = X0 + (Xn - X0+1)/2;
                Xo = X0;
                if(!bombDir.contains("U") && !bombDir.contains("D") ) {
                     Yn= Y0;
                     Yr = Y0;
                 }
                
            }
            
            if(bombDir.contains("D")) {
                 Yr = Y0 + (Yn-Y0+1)/2;
                 Yo = Y0;
                 
                 if(!bombDir.contains("L") && !bombDir.contains("R") ) {
                     Xn= X0;
                     Xr= X0;
                 }
            }

            X0 = Xr;
            Y0 = Yr;
            
            System.err.println("S Por:"+Xo+","+Yo+ ", Pn:"+(Xn-1)+","+(Yn-1));
            // the location of the next window Batman should jump to.
           
            System.out.println(X0+" "+Y0);
        }
    }
}
