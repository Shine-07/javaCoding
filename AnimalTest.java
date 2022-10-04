//Animal test class 
public class AnimalTest
{
  public static void main(String[] args)
  {
  Wolf wolfOne = new Wolf(" Great Northern Wolf" , 34.5, " Northern Canada");
  Whale whaleOne = new Whale( " Blue whale", 80000.0, " Pacific Ociean");
  Walrus walrusOne = new Walrus(" Short Tusk", 3000.0, " South Pacific");
  
  Animal[] animals = new Animal[3];
  animals[0] = wolfOne;
  animals[1] = whaleOne;
  animals[2] = walrusOne;
  for(int i = 0; i < animals.length; i++)
  {
  System.out.println(animals[i].toString());
  }
  wolfOne.setName("Canadian Grey");
  System.out.println("\n"+wolfOne.toString());
  }
  }

