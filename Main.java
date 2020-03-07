
package eg.edu.alexu.csd.datastructure.iceHockey.cs22;
import java.awt.Point;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        String[] arr = {"33JUBU33","3U3O4433","O33P44NB","PO3NSDP3","VNDSD333","OINFD33X"};
        Picture myObj = new Picture();
        Point p;
        java.awt.Point[] points = myObj.findPlayers(arr, 3, 16);
        for(int i=0; i <myObj.getSize(); i++)
        {
            p = points[i];
            System.out.println(p.getX() + " " + p.getY());
        }
    }
}