import java.util.*;

public abstract class Trait {
  public String name, phenotype;
  public int genotype;

  protected Trait(String n, String p) {
    name = n;
    phenotype = p;
  }

  protected Trait(String n, String p, int g) {
    name = n;
    phenotype = p;
    genotype = g;
  }
}