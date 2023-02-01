import java.util.*;

public class MendelianTrait extends Trait {
  public static HashMap<String, MendelianTrait> mendelianTraits = new HashMap<String, MendelianTrait>();

  public MendelianTrait (String n, String p) {
    super(n,p);
    mendelianTraits.put(name, this);
  }
  
  public MendelianTrait (String n, String p, int g) {
    super(n,p,g);
    mendelianTraits.put(name, this);
  }

  public Trait determineSex() {
    Random rand = new Random();
    int rng = 0;
    String sex;

    rng = rand.nextInt(2);

    if (rng == 0) {
      sex = "female";
    }
    else {
      sex = "male";
    }

    trait = new MendelianTrait("sex", sex);

    return trait;
  }
}