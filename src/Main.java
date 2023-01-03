public class Main {
    public static void main(String[] args) {

        //: Переменные 1

        var                                                                                                                                                                    dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: Additions

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: Soustractions

        dog = dog - 4;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //: Friends

        var friends = 19;
        System.out.println(friends);
        friends = friends + 2;
        System.out.println(friends);
        friends = friends / 7;
        System.out.println(friends);

        //: Frog

        var frog = 3.5;
        System.out.println(frog);
        frog = frog + 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //: Capacity left

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

        //: Addition of two friends of mine

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

        //: Work hours

        var totalWorkHours = 640;
        var workingHoursOneEmployee = 8;
        var numberOfEmployees = totalWorkHours / workingHoursOneEmployee;
        System.out.println("If one employee works 8h and the total working hours is 640, it mean that there is " + numberOfEmployees + " employees in the compagny.");

        numberOfEmployees = numberOfEmployees + 94;
        System.out.println("Now the number of employees in the compagny is " + numberOfEmployees);

        var additionOfWorkHours = workingHoursOneEmployee * 94;

        totalWorkHours = totalWorkHours + additionOfWorkHours;
        System.out.println(totalWorkHours + " is the total work hours in the compagny");

        //: Переменные 2

        short bananas = 100;
        System.out.println("Bananas " + bananas + " kg");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("One portion of sugar weights = " + onePortion + " kg");

        byte a = 1;
        short b = 1;
        int c = 1;

        int d = a + b + c;
        System.out.println(d);

        //: Задача 1

        int catField = 2000000;
        System.out.println(catField);
        short catFish = 32700;
        System.out.println(catFish);
        long catFlex = 416541531;
        System.out.println(catFlex);
        float catFolks = 2.25F;
        System.out.println(catFolks);
        double catFex = 2654.251;
        System.out.println(catFex);

        //: Задача 2

        float a1 = 27.12f;
        System.out.println(a1);
        long a2 = 987678965549L;
        System.out.println(a2);
        double a3 = 2.786;
        System.out.println(a3);
        short a4 = 569;
        System.out.println(a4);
        short a5 = -159;
        System.out.println(a5);
        short a6 = 27897;
        System.out.println(a6);
        byte a7 = 67;
        System.out.println(a7);

        //: Задача 3

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;

        short totalStudents = (short) (teacher1 + teacher2 + teacher3);
        System.out.println("The total amount of students is: " + totalStudents);

        short papers = 480;

        short papersPerstudent = (short) (papers / totalStudents);
        System.out.println("The amount of papers per student is: " + papersPerstudent);

        //: Задача 4

        byte productionCapacityperMinute = 16;

        int result20mn = productionCapacityperMinute * 20;
        System.out.println(result20mn + " bottles produced in 20mn.");

        int result1day = (result20mn * 3) * 4;
        System.out.println(result1day + " bottles produced in 1 day.");

        int result3days = result1day * 3;
        System.out.println(result3days + " bottles produced in 3 day.");

        int result1month = result1day * 31;
        System.out.println(result1month + " bottles produced in 1 month.");

        //: Задача 5

        byte peintBacs = 120;
        byte paintPerclasse = 6;
        byte classroom = (byte) (peintBacs / paintPerclasse);
        byte white = 2;
        byte brown = 4;
        byte whiteBoght = (byte) (white * classroom);
        byte brownBoght = (byte) (brown * classroom);
        System.out.println("In a school with " + classroom + " classes, " + " you will need " + whiteBoght + " white paint bacs, and " + brownBoght + " brown paint bacs.");

        //: Задача 6

        int bananas2 = 5 * 80;
        int milk = 200 * 105 / 100;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalWeight1 = bananas2 + milk + iceCream + eggs;
        double weightKg = totalWeight1 / 1000.0;
        System.out.println("Total weight of the breakfast : " + totalWeight1 + " grammes (" + weightKg + " kilograms.)");

        //: Задача 7

        int objectifWeight = 7000;
        int lossPerDay1 = 250;
        int lossPerDay2 = 500;
        int days1 = objectifWeight / lossPerDay1;
        int days2 = objectifWeight / lossPerDay2;
        int averageLoss = objectifWeight / (days1 + days2) / 2;
        System.out.println("Number of day to loss weight (250 grammes per day) : " + days1);
        System.out.println("Number of day to loss weight (500 grammes per day) : " + days2);
        System.out.println("Average weight loss : " + averageLoss + " grammes per day");


        //: Задача 8

        double tauxAugmentation = 0.1;

        double salaryMasha = 67760;
        double percentageMasha = salaryMasha * tauxAugmentation;
        double newsalaryMasha = salaryMasha + percentageMasha;
        double diffMasha = (newsalaryMasha - salaryMasha) * 12;
        System.out.println("Masha is now payed " + newsalaryMasha + " roubles.");
        System.out.println("The annual revenu increst of " + diffMasha + " roubles.");

        double salaryDenis = 83690;
        double pourcentageDenis = salaryDenis * tauxAugmentation;
        double newSalaryDenis = salaryDenis + pourcentageDenis;
        double diffDenis = (newSalaryDenis - salaryDenis) * 12;
        System.out.println("Denis is now payed " + newSalaryDenis + " roubles.");
        System.out.println("The annual revenu increst of " + diffDenis + " roubles.");

        double salaryKristina = 76230;
        double pourcentageKristina = salaryKristina * tauxAugmentation;
        double newSalaryKristina = salaryKristina + pourcentageKristina;
        double diffKristina = (newSalaryKristina - salaryKristina);
        System.out.println("Kristina is now payed " + newSalaryKristina + " roubles.");
        System.out.println("The annual revenu increst of " + diffKristina + " roubles.");

    }
}