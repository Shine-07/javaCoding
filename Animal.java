// Object orientation polymorohism animals:
public class Animal
{
private String name;
private double weight;
private String location;
public Animal(String name, double weight, String location)
{
  this.name = name;
  this.weight = weight;
  this.location = location;
  }
  
  public void setName(String name)
  {
  this.name = name;
  }
  public String getName()
  {
  return name;
  }
  
  public void setweight(double weight)
  {
  this.weight = weight;
  }
  public double getweight()
  {
  return weight;
  }
  
  public void setlocation(String location)
  {
  this.location = location;
  }
  public String getlocation()
  {
  return location;
  }
  
   public String toString()
  {
  return " Name " + getName() + " weight " + getweight() +
   " location " + getlocation();
  }
  } 
