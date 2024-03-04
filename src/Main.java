public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");
        // первое задание , присвоить значения переменным и вывести в консоль.

        byte byteNum = 15;
        short shortNum = 39;
        int intNum = 90000887;
        long longNum = 107785948576L;
        float floatNum = 2.3f;
        double doubleNum = 173.29394810;
        System.out.println("byteNum = " + byteNum + "\nshortNum = " + shortNum + "\nintNum = " + intNum +
                "\nlongNum = " + longNum + "\nfloatNum = " + floatNum + "\ndoubleNum = " + doubleNum);

        System.out.println("\nЗадание 2\nВывод в консоль, не требуется.");
        //Задание 2, присвоить готовые значения переменным, подобрать правильные
        // переменные для каждого значения. Требование вывода в консоль, не указанно.
        float fl = 27.12f;
        long ln = 987_678_965_549L;
        double dl = 2.786;
        short st = 569;
        short sh = -159;
        int it = 27897;
        byte bt = 67;
        // вместо переменной int стоило использовать пременную sort с числом 27897, //
        // но если я правильно понял задачу, надо было использовать все численные переменные.


        System.out.println("\nЗадание 3");
        // Задача посчитать, колличествно листов бумаги, на каждого ученика.
        // Требование, не использовать переменную var.
        //Людмила Павловна = lp , Анна Сергеевна = as, Екатерина Андреевна = ea.
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short sheetsOfPaper = 480;
        int totalStudent = lp + as + ea;
        int sheetsOfPaperPerPerson = sheetsOfPaper / totalStudent;
        System.out.println("Три школьных учителя, Людмила Павловна, Анна Сергеевна и " +
                "Екатерина Андреевна, ведут три класса.\n" +
                "\n" +
                "У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у " +
                "Екатерины Андреевны — 30 учеников.\n" +
                "\n" +
                "Три учительницы закупили все вместе 480 листов бумаги на все три класса. " +
                "Посчитайте, сколько достанется листов каждому ученику." +
                "\n\nКоличество листов бумаги на одного ученика = " + sheetsOfPaperPerPerson);

        System.out.println("Задание 4");
        // Все значения прописал в переменной Int так как деления и умнажения происходят в переменной int.
        int performanceIn1Minute = 16 / 2;
        int performanceIn20Minutes = performanceIn1Minute * 20;
        // если я правильно понял, то абсолютно все расчеты, должен производить в Java.
        int performanceInDay = 60 * 24 * performanceIn1Minute;
        int performanceInThreeDay = performanceInDay * 3;
        int performanceInMonth = performanceInDay * 30;
        System.out.println("\nОтвет:\nПроизводительность машины = в 20 минут " + performanceIn20Minutes +
                ", в сутки " + performanceInDay + ", в трое суток " + performanceInThreeDay +
                ", в месяц " + performanceInMonth);

        System.out.println("\nЗадание 5");
        //Выведите результат задачи в консоль в формате: «В школе, где … классов,
        // нужно …банок белой краски и … банок коричневой краски».
        //Для объявления переменных не используйте тип var.
        byte totalCansPaint = 120; //всего банок краски купленно
        byte whitePaintConsumption = 2; //расход белой краски на 1 класс
        byte brownPaintConsumption = 4; //Расход коричневй краски на 1 класс
        int oneClassPaint = whitePaintConsumption + brownPaintConsumption; //Всего красски на класс
        int numberOfClasses = totalCansPaint / oneClassPaint;    // Таким образом узнаем колличество классов всего.
        int totalWhitePaint = numberOfClasses * whitePaintConsumption;
        int totalBrownPaint = numberOfClasses * brownPaintConsumption;
        System.out.println("\n\nОтвет\n\nВ школе где " + numberOfClasses + " классов, нужно " +
                totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");
        System.out.println("\n\nЗадание 6");

        // Требование если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        // то нужно умножать количество единиц на вес в граммах. Например, если в рецепте указано, что нужно добавить
        // 5 бананов по 80 грамм, то нужно количество бананов (5) умножить на вес одного (80 грамм), а не считать самим
        // общую сумму граммов.
        byte weightOfBanana = 80; //мера = грамм
        byte weightOfMilk = 105; // мера = грамм  (100мл = 105 грамм)
        byte weightOfIceCream = 100; // мера = грамм
        byte weightOfEgg = 70; // мера = грамм
        byte quantityBanana = 5;
        byte quantityIceCream = 2;
        byte quantityMilk = 2; // две позиции по 105 грамм.
        byte quantityEgg = 4;
        int totalWeightBanana = weightOfBanana * quantityBanana;
        int totalWeightMilk = weightOfMilk * quantityMilk;
        int totalWeightIceCream = weightOfIceCream * quantityIceCream;
        int totalWeightEgg = weightOfEgg * quantityEgg;
        float breakfastWeight = totalWeightEgg + totalWeightBanana + totalWeightMilk + totalWeightIceCream;
        float oneKilogram = 1000;
        float breakfastWeightInKilograms = breakfastWeight / oneKilogram;
        System.out.println("\nВес завтрака спортсмена составляет " + breakfastWeight + " грамм, или " + breakfastWeightInKilograms + " киллограм");

        System.out.println("\n\nЗадание 7");

        short sevenKilogram = 7000; //мера граммы
        short minimumGram = 250;
        short maximumGram = 500;
        int daysMaximum = sevenKilogram / minimumGram;
        int daysMinimum = sevenKilogram / maximumGram;
        int averageValue = daysMaximum - daysMinimum;

        System.out.println("\nОтвет\nДля похудения на 7 киллограм, потребуется от " + daysMinimum + " дней ( при потере в весе 250 грамм в день), " +
                "До " + daysMaximum + " дней (при ежедневной потере в весе 500 грамм в день)\nВ среднем потребуется " + averageValue + " дней");

        System.out.println("\nЗадание 8");

        var masha = 67760;
        var denis = 83690;
        var kristina = 76230;
        var year = 12;
        //требование посчитать увеличение зарплаты, на 10% и сравнить годовую разницу зарплаты каждого из сотрудников.
        double upMasha = masha * 0.10 + masha;
        double upDenis = denis * 0.10 + denis;
        double upKristina = kristina * 0.10 + kristina;
        double upYearSalaryMasha = upMasha * year;
        double upYearSalaryDenis = upDenis * year;
        double upYearSalaryKristina = upKristina * year;
        int yearSalaryMasha = masha * year;
        int yearSalaryDenis = denis * year;
        int yearSalaryKristina = kristina * year;
        double differenceMasha = upYearSalaryMasha - yearSalaryMasha;
        double differenceDenis = upYearSalaryDenis - yearSalaryDenis;
        double differenceKristina = upYearSalaryKristina - yearSalaryKristina;

        System.out.println("Зарплата Маши, после повышения составит "+upMasha+" рублей в месяц. \nРазница годового дохода" +
                "Маши, составит "+differenceMasha+" рублей в год.\nЗарплата Дениса, после повышения составит "+upDenis+" рублей в месяц." +
                "\nРазница годового дохода Дениа, составит "+differenceDenis+" рублей в год." +
                "\nЗарплата Кристины после повышения составит "+upKristina+" рублей в месяц.\nРазница годового дохода Кристины, " +
                "составит "+differenceKristina+" рублей в год.");

    }
}