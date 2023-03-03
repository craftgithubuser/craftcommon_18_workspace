package abdi;

public class ComAbdi {int height, weight;
  public ComAbdi(int height, int weight) {
    this.height = height;
    this.weight = weight;
  }
  public int getHeight(){
    return height;
  }
  public int getWeight(){
    return weight;
  }
  public static void main(String[] args) {
    ComAbdi a = new ComAbdi(6,182);
    System.out.println(" helloo everyone");
    System.out.println(" my h is " + a.getHeight());
    System.out.println(" my w is " + a.getWeight());
    System.out.println(" I repeat ");
    System.out.println(" height is " + a.getWeight());
    System.out.println(" weightt is " + a.getWeight());

	}

}
