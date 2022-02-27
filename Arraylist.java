import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    // create an ArrayList
    ArrayList<Integer> primeNumbers = new ArrayList<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    primeNumbers.add(5);
    System.out.println("ArrayList: " + primeNumbers);

    // remove element at index 2
    int removedElement = primeNumbers.remove(2);

    System.out.println("Removed Element: " + removedElement);
  }
}