public class Main {
    public static void main(String[] args) {
        //task1

        int iBox = 4;
        System.out.println("Значение переменной iBo[ с типом int равно " + iBox);
        byte bBox = 6;
        System.out.println("Значение переменной bBox с типом byte равно " + bBox);
        short sBox = 7;
        System.out.println("Значение переменной sBox с типом short равно " + sBox);
        long lBox = 8;
        System.out.println("Значение переменной lBox с типом long равно " + lBox);
        float fBox = 0.8f;
        System.out.println("Значение переменной fBox с типом float равно " + fBox);
        double dBox = 6.9;
        System.out.println("Значение переменной dBox с типом double равно " + dBox);

        //task2

        byte by2 = 67;
        short sh2 = -159;
        int in2 = 27897;
        long lo2 = 987678965549L;
        float fl2 = 27.12f;
        double do2 = 2.786;

        //task3

        byte lydmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndrrevna = 30;
        short allSheets = 480;
        int sheetsEach = allSheets / (lydmilaPavlovna + ekaterinaAndrrevna + annaSergeevna);
        System.out.println("На каждого ученика рассчитано " + sheetsEach + " листов бумаги");

        //task4

        byte min2Make = 16;
        System.out.println("за 20 минут машина произвела " + min2Make + " штук");
        int min20Make = (min2Make / 2) * 20;
        System.out.println("за 20 минут машина произвела " + min20Make + " штук");
        int hours24Make = min20Make * 3 * 24;
        System.out.println("за 24 часа машина произвела " + hours24Make + " штук");
        int day3Make = hours24Make * 3;
        System.out.println("за 3 дня машина произвела " + day3Make + " штук");
        int month1Make = day3Make * 10;
        System.out.println("за 1 месяц машина произвела " + month1Make + " штук");

        //task5

        byte cansTotal = 120;
        byte whiteOneClass = 2;
        byte braunOneClass = 4;
        int classTotal = cansTotal / (whiteOneClass + braunOneClass);
        int whiteTotal = classTotal * 2;
        int braunTotal = classTotal * 4;
        System.out.println("В школе, где " + classTotal + " классов, нужно "
                + whiteTotal + " банок белой краски и " + braunTotal + " банок белой краски");

        //task6

        byte bananaPs = 5;
        int massBananaGr = bananaPs * 80;
        short milkMl = 200;
        int massMilkGr = (milkMl / 100) * 105;
        byte iceCreamPs = 2;
        int massIceCreamGr = iceCreamPs * 100;
        byte eggPs = 4;
        int massEggGr = eggPs * 70;
        int massCoctailGr = (massBananaGr + massMilkGr + massIceCreamGr + massEggGr);
        System.out.println("Масса коклетя в граммах " + massCoctailGr);
        float massCoctailKg = massCoctailGr / 1000f;
        System.out.println("Масса коклетя в килограммах " + massCoctailKg);

        //task7

        byte allLoseMassKg = 7;
        short correctMass250Gr = 250;
        short correctMass500Gr = 500;
        int allLoseMassGr = allLoseMassKg * 1000;
        int ifCorrect250Gr = allLoseMassGr / correctMass250Gr;
        System.out.println(ifCorrect250Gr + " дней, если худеть на 250гр в день");
        int ifCorrect500Gr = allLoseMassGr / correctMass500Gr;
        System.out.println(ifCorrect500Gr + " дней, если худель на 500гр в день");
        int middleDay = (ifCorrect250Gr + ifCorrect500Gr) / 2;
        System.out.println(middleDay + " день потребуется в среднем");

        //task8

        byte percentUpYear = 10;
        int mashaSalaryM = 67760;
        int denysSalaryM = 83690;
        int kristinaSalaryM = 76230;
        int mashaSalaryUp = (mashaSalaryM * (percentUpYear + 100)) / 100;
        int denysSalaryUp = (denysSalaryM * (percentUpYear + 100)) / 100;
        int kristinaSalaryUp = (kristinaSalaryM * (percentUpYear + 100)) / 100;
        int mashaYearUp = (mashaSalaryUp - mashaSalaryM) * 12;
        int denisYearUp = (denysSalaryUp - denysSalaryM) * 12;
        int kristinaYearUp = (kristinaSalaryUp - kristinaSalaryM) * 12;
        System.out.println(mashaYearUp);
        System.out.println("Маша теперь получает " + mashaSalaryUp + " рублей." + " Годовой доход вырос на " + mashaYearUp + " рубля");
        System.out.println("Денис теперь получает " + denysSalaryUp + " рублей." + " Годовой доход вырос на " + denisYearUp + " рубля");
        System.out.println("Кристина теперь получает " + kristinaSalaryUp + " рублей."+ " Годовой доход вырос на " + kristinaYearUp + " рубля" );





    }

}

