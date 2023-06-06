// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Задача 1
        int newInt = 1;
        byte newByte = 2;
        short newShort = 3;
        long newLong = 4;
        float newFloat = 5.0f;
        double newDouble = 6.0;
        System.out.println("Значение переменной newInt с типом int равно " + newInt);
        System.out.println("Значение переменной newByte с типом byte равно " + newByte);
        System.out.println("Значение переменной newShort с типом short равно " + newShort);
        System.out.println("Значение переменной newLong с типом long равно " + newLong);
        System.out.println("Значение переменной newFloat с типом float равно " + newFloat);
        System.out.println("Значение переменной newDouble с типом double равно " + newDouble);
        System.out.println();

        // Задача 2
        float newFloat2 = 27.12f;
        long newLong2 = 987678954549L;
        float newFloat3 = 2.786f;
        short newShort2 = 569;
        short newShort3 = -159;
        short newShort4 = 27897;
        byte newByte2 = 67;

        // Задача 3
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        int pupilsNumber = class1 + class2 + class3;
        short paperAmount = 480;
        int paperPerPupil = paperAmount / pupilsNumber;
        System.out.println("На каждого ученика рассчитано " + paperPerPupil + " листов бумаги");
        System.out.println();

        // Задача 4
        byte capacity = 8;
        int capacity2 = capacity * 20;
        int capacity3 = (capacity2 * 3) * 24;
        int capacity4 = capacity3 * 3;
        int capacity5 = capacity3 * 31;
        System.out.println("За 20 минут машина произвела " + capacity2 + " штук бутылок");
        System.out.println("За сутки машина произвела " + capacity3 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + capacity4 + " штук бутылок");
        System.out.println("За месяц машина произвела " + capacity5 + " штук бутылок");
        System.out.println();

        // Задача 5
        byte paintTotalAmount = 120;
        byte brownPaint = 2;
        byte whitePaint = 4;
        int numberOfClasses = paintTotalAmount / (brownPaint + whitePaint);
        int brownPaintTotal = brownPaint * numberOfClasses;
        int whitePaintTotal = whitePaint * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски");
        System.out.println();

        // Задача 6
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte icecreamWeight = 100;
        byte rawEggWeight = 70;
        int recipe = (bananaWeight * 5) + (milkWeight * 2) + (icecreamWeight * 2) + (rawEggWeight * 4);
        int grPerKg = 1000;
        float recipeKg = recipe / (float)grPerKg;
        System.out.println(recipe);
        System.out.println(recipeKg);
        System.out.println();

        // Задача 7
        short excessWeight = 7000;
        short weightLossA = 250;
        short weightLossB = 500;
        int weightLossPeriodA = excessWeight / weightLossA;
        int weightLossPeriodB = excessWeight / weightLossB;
        int averagePeriod = (weightLossPeriodA + weightLossPeriodB) / 2;
        System.out.println(weightLossPeriodA);
        System.out.println(weightLossPeriodB);
        System.out.println(averagePeriod);
        System.out.println();

        // Задача 8
        float payRise = 1.1f;
        float salaryMasha = 67760.0f;
        float salaryDenis = 83690.0f;
        float salaryKristina = 76230.0f;
        float increasedSalaryMasha = salaryMasha * payRise;
        float increasedSalaryDenis = salaryDenis * payRise;
        float increasedSalaryKristina = salaryKristina * payRise;
        float annualIncreaseMasha = (increasedSalaryMasha - salaryMasha) * 12;
        float annualIncreaseDenis = (increasedSalaryDenis - salaryDenis) * 12;
        float annualIncreaseKristina = (increasedSalaryKristina - salaryKristina) * 12;
        System.out.println("Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на " + annualIncreaseMasha + " рублей");
        System.out.println("Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на " + annualIncreaseDenis + " рублей");
        System.out.println("Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на " + annualIncreaseKristina + " рублей");
    }
}