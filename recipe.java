/*Idea is to make a program that takes users recipes and stores it
into objects to be accessed later, want to also include ingredients,
menu, choose a random recipe for you*/
import java.util.Scanner;
import java.util.ArrayList;

public class recipe {
      public static void main(String[] args) {
            System.out.println("\n *** Menu *** \n1)Add new recipe\n2)Edit recipe\n3)Delete recipe\n4)Exit program\n5)Random recipe");
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            while(!(1 <= input && 5 >= input)){
                  System.out.println("Please try again");
                  input = scan.nextInt();
            }
       
            switch (input) {
                  case 1:
                        addRecipe();
                        break;
                  case 2:
                        System.out.println("this is the second option");
                        break;
                  case 3:
                        System.out.println("this is the third option");
                        break;
                  default:
                        System.out.println("this is the fourth option");
                        break;
            }
      }
      /*right now only have it configured for one recipe to be added, would like to ask the user
      the amount of recipes to be added and store the name of each recipe to be looked up later*/
      public static void addRecipe(){
            Scanner scan = new Scanner(System.in);
            //System.out.println("How many recipes would you like to add?");
            //int amountOfRecipes = scan.nextInt();
            int i = 0;
            ArrayList<String> nameofRecipe = new ArrayList<String>();
            System.out.println("How many ingredients do you need for this recipe?");
            int amountOfIngredients = scan.nextInt();
            while(i < amountOfIngredients){
                  System.out.println("Please state the ingredient then press enter:");
                  String ingredient = scan.next();
                  nameofRecipe.add(ingredient);
                  i++;
                  }
            System.out.println("The following ingredients have been added to the recipe: " + nameofRecipe);
      }
      public static void deleteRecipe(){
            
      }
      public static void editRecipe(){
            
      }
      public static void randomRecipe(){

      }
 }