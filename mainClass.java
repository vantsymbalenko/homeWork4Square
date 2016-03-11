/**
 * Created by Admin on 11.03.2016.
 */
public class mainClass {
public static void main(String[] args){
    squareOfRectangles square=new squareOfRectangles(12f,12f);
    squareOfCicuit squareCicuit=new squareOfCicuit(12f);
    squareOfTriange squareTriange=new squareOfTriange(12f,12f);
    System.out.print("square of rectangle=");
    System.out.println(square.getTotal());
    System.out.print("square of circuit=");
    System.out.println(squareCicuit.getTotal());
    System.out.print("square of triangle=");
    System.out.println(squareTriange.getTotal());



}
}
