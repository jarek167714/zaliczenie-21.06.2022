
import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner nowy = new Scanner(System.in);
    int x, wynik;
    System.out.println("Podaj liczbę:  ");
    x = nowy.nextInt(); 
    wynik = 0;
    while (x != 0) 
    {
      wynik += x % 10;
      x /= 10;
    }
System.out.println("Suma cyfr w liczbie całkowitej wynosi " + wynik);
}
}