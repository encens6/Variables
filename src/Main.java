import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        //: variables

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: additions

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: soustractions

        dog = dog - 4;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: friends

        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);

        //: frog

        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //: capacity left

        var liftingCapacity = 50;
        var stuffWeight = 20;
        var capacityLeft = liftingCapacity - stuffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        //: Product weight

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitweight = appleWeight + orangesWeight;
        System.out.println("Total fruits weight egals " + fruitweight + "kg");

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumberWeight = 2;
        var pepperweight = 2;
        var zuchiniweight = 2;

        var vegetablesWeight = tomatoesWeight + cucumberWeight + zuchiniweight + pepperweight;
        var productWeight = fruitweight + meatWeight + waterWeight + vegetablesWeight;
        System.out.println("Total product weight is " + productWeight + "kg !");

        var leftWeight = liftingCapacity - stuffWeight - productWeight;
        System.out.println("Lifting capacity left egals " + leftWeight + "kg !");

        //: addition of two friends of mine

        productWeight = productWeight * 2;
        System.out.println("Now the product weight is " + productWeight + "kg !");

        leftWeight = liftingCapacity - stuffWeight - productWeight;
        System.out.println("Now the left weight is " + leftWeight + "kg !");

        //: Overload

        var overload = (stuffWeight + productWeight) % liftingCapacity;
        System.out.println("Overload egals " + overload + "kg !");

        var productsInOneCar = productWeight / 2;
        System.out.println("Now there's " + productsInOneCar + "kg in one car.");

        //: Boxers weight

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalBoxersWeight = boxer1 + boxer2;
        System.out.println("The total weight of the two boxers is " + totalBoxersWeight + "kg");

        var difference = boxer2 - boxer1;
        System.out.println("The difference of weight betwin the two boxers is " + difference + "kg !");

        //: Work h

        var totalWorkHours = 640;
        var workingHoursOneEmployee = 8;
        var numberOfEmployees = totalWorkHours / workingHoursOneEmployee;
        System.out.println("If for one employee works 8h and the total working hours is 640, it mean that there is " + numberOfEmployees + " employees in the compagny.");

        numberOfEmployees = numberOfEmployees + 94;
        System.out.println("Now the number of employees in the compagny is " + numberOfEmployees);

        var additionOfWorkHours = workingHoursOneEmployee * 94;

        totalWorkHours = totalWorkHours + additionOfWorkHours;
        System.out.println(totalWorkHours + " is the total work hours in the compagny");
    }
}