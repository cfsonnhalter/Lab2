class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int total = 55*11;
    double blue = total * .24;
    double brown = total * .13;
    double green = total * .16;
    double orange = total * .20;
    double red = total * .13;
    double yellow = total * .14;

    System.out.println("blue " + blue);
    System.out.println("brown " + brown);
    System.out.println("green " + green);
    System.out.println("orange " + orange);
    System.out.println("red "  + red);
    System.out.println("yellow " + yellow);

    double sum = blue + brown + green + orange + red + yellow;

    System.out.println("Sum: " + sum);

    if (blue > brown && red > orange ) 
      System.out.println("Blue over brown and red over orange");
    if (brown <= green)
      System.out.println("Brown is equal to or less than green");
    if (sum == total)
      System.out.println("Numbers match");




  }
}