import java.util.*;

public class MaleParent extends Person {
  public static HashMap<String, MaleParent> maleparents = new HashMap<String, MaleParent>();
  
  public MaleParent (String n, Trait s, Trait r, Trait h, Trait e, Trait t, Trait i) {
    super(n,s,r,h,e,t,i);
    maleparents.put(name, this);
  }

  public static void inputTraits() {
    String nameOfRace, nameOfHairColor, nameOfEyeColor;
    float heightNumber, IQnumber;
    int hairColorGenotype, eyeColorGenotype;
    
    System.out.print("What is the person's name?: ");
    name = input.nextLine();
    
    sex = new MendelianTrait("sex", "male");

    System.out.print("What is the person's race? [Caucasian/Asian/Black]: ");
    nameOfRace = input.nextLine();
    race = new Trait("race", nameOfRace);

    System.out.print("What is the person's hair color? [Black/Brunette/Blonde]: ");
    nameOfHairColor = input.nextLine();

    if (nameOfHairColor.equalsIgnoreCase("Black")) {
      hairColorGenotype = 6;
    }
    else if (nameOfHairColor.equalsIgnoreCase("Brunette")) {
      hairColorGenotype = 3;
    }
    else if (nameOfHairColor.equalsIgnoreCase("Blonde")) {
      hairColorGenotype = 0;
    }
    
    hairColor = new PolygenicTrait("hair color", nameOfHairColor, hairColorGenotype);

    System.out.print("What is the person's eye color? [Black/Brown/Grey]: ");
    nameOfEyeColor = input.nextLine();

    if (nameOfEyeColor.equalsIgnoreCase("Black")) {
      eyeColorGenotype = 6;
    }
    else if (nameOfEyeColor.equalsIgnoreCase("Brown")) {
      eyeColorGenotype = 3;
    }
    else if (nameOfEyeColor.equalsIgnoreCase("Grey")) {
      eyeColorGenotype = 0;
    }
    
    eyeColor = new PolygenicTrait("eye color", nameOfEyeColor, eyeColorGenotype);

    System.out.print("What is the person's height in cm?: ");
    heightNumber = input.nextInt();
    input.nextLine();
    height = new PolygenicTrait("height", heightNumber);
    
    System.out.print("What is the person's IQ?: ");
    IQnumber = input.nextInt();
    input.nextLine();
    IQ = new PolygenicTrait("IQ", IQnumber);

    new FemaleParent(name, sex, race, hairColor, eyeColor, height, IQ);
  }
}