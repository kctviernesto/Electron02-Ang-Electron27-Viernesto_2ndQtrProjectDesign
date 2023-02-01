import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("!! WELCOME TO THE BABY SIMS !!");
    showMenu();
  }

  public static void showMenu() {
    Scanner input = new Scanner(System.in);
    String choice, name, sex;
    Person person;

    do {
      System.out.println("\nWhat would you like to do? \n" +
        "- List people \n" +
        "- List children \n" +
        "- See traits of a person \n" +
        "- Add a person \n" +
        "- Remove a person \n" +              
        "- Generate a child \n" +
        "- End application");
      choice = input.nextLine();
      
      if (choice.equalsIgnoreCase("List people")) {
        Person.listPeople();
      }

      if (choice.equalsIgnoreCase("List children")) {
        Child.listChildren();
      }

      else if (choice.equalsIgnoreCase("See traits of a person")) {
        System.out.print("What is the name of the person?: ");
        name = input.nextLine();
        person = Person.persons.get(name);
        
        person.seeTraits();
      }

      else if (choice.equalsIgnoreCase("Add a person")) {
        System.out.print("Enter the sex of the parent (F/M): ");
        sex = input.nextLine();
        
        if (sex.equalsIgnoreCase("F")) {
          FemaleParent.inputTraits();
        }
        else if (sex.equalsIgnoreCase("M")) {
          MaleParent.inputTraits();
        }
      }

      else if (choice.equalsIgnoreCase("Remove a person")) {
        System.out.print("What is the name of the person you want to remove?: ");
        name = input.nextLine();
        
        Person.removePerson(name);
      }

      else if (choice.equalsIgnoreCase("Generate a child")) {
        System.out.print("Pick the first parent (female): ");
        name = input.nextLine();
        FemaleParent parent1 = FemaleParent.femaleparents.get(name);
        
        System.out.print("Pick the second parent (male): ");
        name = input.nextLine();
        MaleParent parent2 = MaleParent.maleparents.get(name);

        determineTraits(parent1, parent2);
      }
    } while (!choice.equalsIgnoreCase("End application"));
  }
}