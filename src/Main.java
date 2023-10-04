public class Main {
    public static void main(String[] args) {
        // Задание № 1
        byte byteVar = 8;
        short shortVar = 200;
        int intVar = 2000000000;
        long longVar = 3000000000L;

        System.out.println("Значение переменной byteVar с типом byte равно " + byteVar);
        System.out.println("Значение переменной shortVar с типом short равно " + shortVar);
        System.out.println("Значение переменной intVar с типом int равно " + intVar);
        System.out.println("Значение переменной longVar с типом long равно " + longVar);

        // Задание № 2
        float floatVar = 27.12f;
        long longVar2 = 987678965549L;
        double doubleVar = 2.786;
        short shortVar2 = 569;
        shortVar2 = -159;
        int intVar2 = 27897;
        byte byteVar2 = 67;

        // Задание № 3
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int eachPaper = paper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + eachPaper + " листов бумаги");

        // Задание № 4
        int machinePerfomanceForMinute = 16 / 2;
        int machinePerfomanceFor20Minutes = machinePerfomanceForMinute * 20;
        System.out.println("За 20 минут машина произвела " + machinePerfomanceFor20Minutes +
                " штук бутылок");
        int machinePerfomanceForDay = machinePerfomanceForMinute * 60 * 24;
        System.out.println("За сутки машина произвела " + machinePerfomanceForDay +
                " штук бутылок");
        int machinePerfomansFor3Days = machinePerfomanceForDay * 3;
        System.out.println("За 3 дня машина произвела " + machinePerfomansFor3Days +
                " штук бутылок");
        int machinePerfomanceForMonth = machinePerfomansFor3Days * 10;
        System.out.println("За месяц машина произвела " + machinePerfomanceForMonth +
                " штук бутылок");

        // Задание № 5
        int cansOfPaints = 120;
        byte cansWhiteOfPaintsForOneClass = 2;
        byte cansBrownOfPaintsForOneClass = 4;
        int classes = cansOfPaints / (cansBrownOfPaintsForOneClass + cansWhiteOfPaintsForOneClass);
        int cansWhiteOfPaints = classes * cansWhiteOfPaintsForOneClass;
        int cansBrownOfPaints = classes * cansBrownOfPaintsForOneClass;
        System.out.println("В школе, где " + classes + " классов, нужно " + cansWhiteOfPaints +
                " банок белой краски и " + cansBrownOfPaints + " банок коричневой краски");

        // Задание № 6
        byte bananas = 5;
        short bananas1Weight = 80;
        short milk = 200;
        short milk100Weight = 105;
        byte icecream = 2;
        short icecream1Weight = 100;
        byte eggs = 4;
        short eggs1Weight = 70;
        int shake = (bananas * bananas1Weight) + (milk * milk100Weight) + (icecream * icecream1Weight) +
                (eggs * eggs1Weight);
        System.out.println("Вес в граммах = " + shake);
        float shakeInKg = shake / 1000f;
        System.out.println("Вес в киллограммах = " + shakeInKg);

        // Задача № 7
        int finalWeight = 7 * 1000;
        int loseWeightBy250 = 250;
        int loseWeightBy500 = 500;
        int daysForLoseWeightBy250 = finalWeight / loseWeightBy250;
        System.out.println("При сжигании в день 250 грамм потребуется " + daysForLoseWeightBy250 +
                " дней");
        int daysForLoseWeightBy500 = finalWeight / loseWeightBy500;
        System.out.println("При сжигании в день 500 грамм потребуется " + daysForLoseWeightBy500 +
                " дней");
        float daysForLoseWeightAnAverage = finalWeight / ((loseWeightBy250 + loseWeightBy500) / 2f);
        System.out.println("При сжигании в день среднего значения потребуется " +
                daysForLoseWeightAnAverage + " дней");

        // Задание № 8
        int mashaMonthlySalary = 67760;
        int mashaSalaryPerYear = mashaMonthlySalary * 12;
        int newMashaMonthlySalary = (int) (mashaMonthlySalary * 1.1);
        int newMashaSalaryPerYear = newMashaMonthlySalary * 12;
        int denisMonthlySalary = 83690;
        int denisSalaryPerYear = denisMonthlySalary * 12;
        int newDenisMonthlySalary = (int) (denisMonthlySalary * 1.1);
        int newDenisSalaryPerYear = newDenisMonthlySalary * 12;
        int kristinaMonthlySalary = 76230;
        int kristinaSalaryPerYear = kristinaMonthlySalary * 12;
        int newKristinaMonthlySalary = (int) (kristinaMonthlySalary * 1.1);
        int newKristinaSalaryPerYear = newKristinaMonthlySalary * 12;
        System.out.println("Маша теперь получает " + newMashaMonthlySalary +
                " рублей. Годовой доход вырос на " + (newMashaSalaryPerYear - mashaSalaryPerYear));
        System.out.println("Денис теперь получает " + newDenisMonthlySalary +
                " рублей. Годовой доход вырос на " + (newDenisSalaryPerYear - denisSalaryPerYear));
        System.out.println("Кристина теперь получает " + newKristinaMonthlySalary +
                " рублей. Годовой доход вырос на " + (newKristinaSalaryPerYear - kristinaSalaryPerYear));
    }
}