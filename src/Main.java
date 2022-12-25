public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        byte apples = 127;
        short bananas = 32767;
        int oranges = 2147483647;
        long lemons = 9223372036854775807L;
        float cherries = 2.5f;
        double strawberries = 10.5;
        System.out.println("Яблок " + apples + ", бананов " + bananas + ", апельсинов " + oranges + ", лимонов " + lemons + ", вишни " + cherries + ", клубники " + strawberries);
    }
    public static void task2 () {
        System.out.println("Задача 2");
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println("a= " + a + ", b= " + b + ", c= " + c + ", d= " + d + ", e= " + e + ", f= " + f + ", g= " + g);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte LPStudents = 23;
        byte ASStudents = 27;
        byte EAStudents = 30;
        short lists = 480;
        int totalStudents = LPStudents + ASStudents + EAStudents;
        int listsPP = lists / totalStudents;
        System.out.println("На каждого ученика рассчитано " + listsPP + " листов бумаги");

    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte machineProd2 = 16;
        int time = 2;
        int machineProd = machineProd2 / time;
        time = 20;
        int products = machineProd * time;
        System.out.println("За " + time + " минут машина производит " + products + " штук бутылок");
        time = time * 3 * 24;
        products = machineProd * time;
        System.out.println("За " + time + " минут машина производит " + products + " штук бутылок");
        time = time * 3;
        products = machineProd * time;
        System.out.println("За " + time + " минут машина производит " + products + " штук бутылок");
        time = time * 10;
        products = machineProd * time;
        System.out.println("За " + time + " минут машина производит " + products + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        byte totalCans = 120;
        byte whiteCansF1 = 2;
        byte brownCansF1 = 4;
        int cansF1 = whiteCansF1 + brownCansF1;
        int classes = totalCans / cansF1;
        int totalWhite = whiteCansF1 * classes;
        int totalBrown = brownCansF1 * classes;
        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte bananaWeight = 80;
        short milk = 200;
        byte milkWeightL = 100;
        byte milkWeightG = 105;
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte eggs = 4;
        byte eggWeight = 70;
        double totalWeightG = bananas * bananaWeight + milk / milkWeightL * milkWeightG + iceCream * iceCreamWeight + eggs * eggWeight;
        double totalWeightKG = totalWeightG / 1000;
        System.out.println("Вес спортзавтрака " + totalWeightG + " грамм или " + totalWeightKG + " кг");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        byte total = 7;
        short a = 250;
        short b = 500;
        double daysA = total * 1000 / a;
        double daysB = total * 1000 / b;
        double daysC = (daysA + daysB) / 2;
        System.out.println( daysA + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм. " + daysB + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм. В среднем потребуется " + daysC + " дней");
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mSalary = 67760;
        double mSalaryNew = mSalary * 1.1;
        double yearIncomeDif = mSalaryNew%mSalary * 12;
        System.out.println("Маша теперь получает " + mSalaryNew + " рублей. Годовой доход вырос на " + yearIncomeDif + " рублей");
        int dSalary = 83690;
        double dSalaryNew = dSalary * 1.1;
        yearIncomeDif = dSalaryNew%dSalary * 12;
        System.out.println("Денис теперь получает " + dSalaryNew + " рублей. Годовой доход вырос на " + yearIncomeDif + " рублей");
        int kSalary = 76230;
        double kSalaryNew = kSalary * 1.1;
        yearIncomeDif = kSalaryNew%kSalary * 12;
        System.out.println("Кристина теперь получает " + kSalaryNew + " рублей. Годовой доход вырос на " + yearIncomeDif + " рублей");
    }
    }