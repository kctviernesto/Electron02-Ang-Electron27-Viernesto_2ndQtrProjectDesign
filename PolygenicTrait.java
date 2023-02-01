import java.util.*;

public class PolygenicTrait extends Trait {
  public static HashMap<String, PolygenicTrait> polygenicTraits = new HashMap<String, PolygenicTrait>();
  
  public PolygenicTrait (String n, String p) {
    super(n,p);
    polygenicTraits.put(name, this);
  }

  public PolygenicTrait (String n, String p, int g) {
    super(n,p,g);
    polygenicTraits.put(name, this);
  }
  
  public static Trait cross(PolygenicTrait t) {
    Random rand = new Random();
    int rng = 0, newGenotype;
    String newPhenotype;

    if (genotype = null) {
      rng = rand.nextInt(2);
      if (rng == 0) {
        newPhenotype = (phenotype + t.phenotype)/2;
      }
      else if (rng == 1) {
        trait = rand.nextInt(2);
        if (rng == 1){
          newPhenotype = phenotype;
        }
        else if (rng == 2) {
          newPhenotype = t.phenotype;
        }
      }
      
      trait = new PolygenicTrait(name, newPhenotype);
    }
    else {
      if (genotype.equals(t.genotype)) {
        newPhenotype = phenotype;
        newGenotype = genotype;
      }
      else if (genotype + t.genotype == 9 || genotype + t.genotype == 3) {
        rng = rand.nextInt(2);
        if (rng == 0){
          newPhenotype = phenotype;
          newGenotype = genotype;
        }
        else if (rng == 1){
          newPhenotype = t.phenotype;
          newGenotype = t.genotype;
        }
      }
      else if (genotype + t.genotype == 6) {
        if (name.equals("hair color")) {
          newPhenotype = "Brunette";
          newGenotype = 3;
        } else if (name.equals("eye color")) {
          newPhenotype = "Brown";
          newGenotype = 3;
        }
      }

      trait = new PolygenicTrait(name, newPhenotype, newGenotype);
    }
    
    return trait;
  }
}