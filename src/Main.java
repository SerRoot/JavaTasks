import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskOne();
        TaskTwo();
        TaskThree();
        TaskFour();
        TaskFive();
        TaskSix();
        TaskSeven();
        TaskEight();
        TaskNine();
        TaskTen();
        TaskEleven();
        TaskTwelve();
        TaskThirteen();
    }
    public static void TaskOne(){
        int n = 1;
        int sum = 1;
        int max = 0;
        int schet = 0;
        System.out.println("Р’РІРµРґРёС‚Рµ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚СЊ РёР· С‡РёСЃРµР» РєСЂРѕРјРµ 0. РџСЂРё Р·Р°РІСЂРµС€РµРЅРёРё РІРІРѕРґР° РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё РЅР°РїРёС€РёС‚Рµ 0");
        while (n != 0) {
            Scanner in = new Scanner(System.in);
            schet = schet+1;

            int l = in.nextInt();
            if (schet == 1){
                max = l;
            }
            n = l;
            if(n == max){
                sum = sum+1;
            }
            if(n > max){
                max = n;
                sum = 1;
            }
        }
        System.out.println("Р’ РґР°РЅРЅРѕР№ РїРѕСЃР»РµРґРѕРІР°С‚Р»СЊРЅРѕСЃС‚Рё " + sum + " РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№(С‹С…) С‡Р»РµРЅ(Р°)");
    }
    public static void TaskTwo() {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> numberContainer = new ArrayList<>();

        System.out.println("Введите последовательность целых чисел, чтобы завершить ввод - введите число 101");

        int inputNumber = 0,
                countQuantity = 0,
                finalQuantity = 0;

        while (inputNumber != 101) {

            inputNumber = in.nextInt();

            if (inputNumber != 101) {

                numberContainer.add(inputNumber);

            }

        }

        for (int i = 0; i < numberContainer.size(); i++) {

            for (int j = 0; j < numberContainer.size(); j++) {

                if (j > i) {

                    if ((numberContainer.get(i) * numberContainer.get(i)) == (numberContainer.get(j) * numberContainer.get(j))) {

                        countQuantity++;

                    }

                }

            }

            if (countQuantity == 0) {

                finalQuantity++;

            } else {

                countQuantity = 0;

            }

        }

        System.out.println("Количество различных значений квадратов в последовательности: " + finalQuantity);

    }
    public static void TaskThree(){
        double n = 1;
        double sredarifm;
        double sum = 0;
        double schet = 0;
        System.out.println("Р’РІРµРґРёС‚Рµ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚СЊ РёР· С‡РёСЃРµР» РєСЂРѕРјРµ 0. РџСЂРё Р·Р°РІСЂРµС€РµРЅРёРё РІРІРѕРґР° РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё РЅР°РїРёС€РёС‚Рµ 0");
        while (n != 0) {
            Scanner in = new Scanner(System.in);
            int l = in.nextInt();
            n = l;
            if(n!=0) {
                schet = schet + 1;
                sum = sum + n;
            }
        }
        sredarifm = sum / schet;
        if(schet > 0){System.out.println("РЎСЂРµРґРЅРµРµ Р°СЂРёС„РјРµС‚РёС‡РµСЃРєРѕРµ СЌС‚РёС… С‡РёСЃРµР» СЂР°РІРЅСЏРµС‚СЃСЏ " + sredarifm);
        }
        else{
            System.out.println("Р—Р°РґР°РЅР° РїСѓСЃС‚Р°СЏ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚СЊ");
        }
    }
    public static void TaskFour() {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите последовательность целых чисел, чтобы завершить ввод - введите число 101");

        int inputNumber = 0,
                countNumber = 0,
                lastNumber = 0,
                countQuantity = 0,
                maxQuantity = 0;

        while (inputNumber != 101) {

            inputNumber = in.nextInt();


            if (inputNumber != 101) {

                if (countQuantity == 0) {

                    lastNumber = inputNumber;

                    countQuantity++;

                }

                if (inputNumber == lastNumber) {

                    countNumber++;

                    maxQuantity = countNumber;

                } else if (inputNumber != lastNumber) {

                    if (countNumber > maxQuantity) {

                        maxQuantity = countNumber;

                    }

                    countNumber = 1;

                    lastNumber = inputNumber;

                }

            }

        }

        System.out.println("Максимальное число подряд идущих чисел в последовательности равно: " + maxQuantity);

    }
    public static void TaskFive() {
        int max = 0;
        int min = 0;
        int num = 0;
        int maxpos = 0;
        int minpos = 0;
        boolean firsttime = true;
        System.out.println("РќР°С‡РёРЅР°Р№С‚Рµ РІРІРѕРґРёС‚СЊ С†РµР»С‹Рµ С‡РёСЃР»Р°. РџСЂРё РІРІРѕРґРµ Р»СЋР±С‹С… РґСЂСѓРіРёС… РґР°РЅРЅС‹С… РїСЂРѕРіСЂР°РјРјР° Р·Р°РІРµСЂС€РёС‚ СЂР°Р±РѕС‚Сѓ.");
        try {
            while (true) {
                num++;
                Scanner scanner = new Scanner(System.in);
                int n = scanner.nextInt();
                if (firsttime){
                    max = n;
                    maxpos = num;
                    min = n;
                    minpos = num;
                    firsttime = false;
                }
                if (n >= max) {
                    maxpos = num;
                    max = n;
                }
                if (n > min) {
                    minpos = num;
                    min = n;
                }
            }
        } catch (Exception e) {
            System.out.println("РџРµСЂРІС‹Р№ РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚ РїРѕРґ РЅРѕРјРµСЂРѕРј: " + minpos +". РџРѕСЃР»РµРґРЅРёР№ РјР°РєСЃРёРјР°Р»СЊРЅС‹Р№ СЌР»РµРјРµРЅС‚ РїРѕРґ РЅРѕРјРµСЂРѕРј: " + maxpos);
        }
    }
    public static void TaskSix() {
        System.out.println("РќР°С‡РёРЅР°Р№С‚Рµ РІРІРѕРґРёС‚СЊ С†РµР»С‹Рµ С‡РёСЃР»Р°. РџСЂРё РІРІРѕРґРµ Р»СЋР±С‹С… РґСЂСѓРіРёС… РґР°РЅРЅС‹С… РїСЂРѕРіСЂР°РјРјР° Р·Р°РІРµСЂС€РёС‚ СЂР°Р±РѕС‚Сѓ.");
        boolean b = false;
        boolean zero = false;
        int i = 0;
        while (!b) {
            if(!zero) {
                i++;
            }
            Scanner scanner = new Scanner(System.in);
            try {
                int n = scanner.nextInt();
                if (n == 0) {
                    zero = true;
                }
            }
            catch (Exception e){
                b = true;
            }
        }
        if (zero) {
            System.out.println(i + " СЌР»РµРјРµРЅС‚ РїРѕСЃР»РµРґРѕРІР°С‚РµР»СЊРЅРѕСЃС‚Рё.");
        }
        else {
            System.out.println("0");
        }
    }
    public static void TaskSeven() {
        Scanner in = new Scanner(System.in);
        int check = 0;
        double a = in.nextDouble();
        int k = 1;
        double pr = a;
        if ((a % 1) == 0) {
            check = 0;
        } else {
            check = 1;
        }
        while (check == 0) {
            a = in.nextDouble();
            if (a > pr){ k++; }
            pr = a;
            if ((a % 1) == 0) {
                check = 0;
            }else {
                check = 1;
            }

        }
        System.out.println(k);
    }
    public static void TaskEight(){
        Scanner in = new Scanner(System.in);
        int check = 0;
        double a = in.nextDouble();
        double max = Double.MIN_VALUE;
        double max2 = Double.MIN_VALUE;
        if ((a% 1) == 0) {
            check = 0;
        } else {
            check = 1;
        }
        while (check == 0) {
            if (a  > max) { max = a;}
            if (a > max2 && max2 != max) { max2 = a;}
            a = in.nextDouble();
            if ((a % 1) == 0) {
                check = 0;
            } else {
                check = 1;
            }

        }
        if (max2 != Double.MIN_VALUE) {System.out.println(max2);} else { System.out.println("NO");}
    }
    public static void TaskNine() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        boolean t=true;
        int x;
        Scanner in =new Scanner(System.in);
        while(t)
        {
            try {
                arr.add(in.nextInt());
            }
            catch (InputMismatchException e)
            {
                t=false;
            }
        }
        t=true;
        int i=0;
        int j=1;
        while(i<arr.size() && t){
            while(j<arr.size() && t){
                for(int m=0;m<arr.size();m++) {
                    if(m!=i && m!=j) {
                        if (arr.get(i) * arr.get(j) == arr.get(m)) {
                            System.out.println("x=" + arr.get(i) + " y=" + arr.get(j) + " z=" + arr.get(m));
                            t=false;
                            break;
                        }
                    }
                }
                j++;
            }
            i++;
            j=i+1;
        }
    }
    public static void TaskTen() {
        int x=0;
        int y=0;
        int n=1;
        int max=1;
        boolean t=true;
        Scanner in =new Scanner(System.in);
        System.out.println("Р’РІРµРґРёС‚Рµ С‡РёСЃР»Р°");
        y = in.nextInt();
        while(t)
        {
            try {
                x = in.nextInt();
                if(x==y){
                    n++;
                    y=x;
                    //System.out.println(n);
                }
                else{
                    if(n>max)max=n;
                    n=1;
                    y=x;
                }
            }
            catch (InputMismatchException e)
            {
                t=false;
                if(n>max)max=n;
            }
        }
        System.out.println(max);
    }
    public static void TaskEleven() {
        int quantityGrops = 1;
        int inputNumber = 0;
        while (inputNumber == 0 || inputNumber == 1) {
            Scanner input = new Scanner (System.in);
            inputNumber = input.nextInt();
            int VariableCounter = 0;
            while (inputNumber == 0){
                VariableCounter = 1;
                if (inputNumber != 0 || inputNumber != 0){
                    break;
                }
                inputNumber = input.nextInt();
            }
            quantityGrops += VariableCounter;
        }
        System.out.println("РљРѕР»Р»Р»РёС‡РµСЃРІС‚Рѕ РіСЂСѓРїРї: " + quantityGrops);
    }
    public static void TaskTwelve() {
        int quantityGrops = 0;
        System.out.println("Р’РІРµРґРёС‚Рµ Р»СЋР±СѓСЋ Р±СѓРєРІСѓ С‡С‚РѕР±С‹ Р·Р°РєРѕРЅС‡РёС‚СЊ РІРІРѕРґ");
        int inputNumber;
        Scanner input = new Scanner (System.in);
        while (input.hasNextInt()) {
            int quantity = 0;
            inputNumber = input.nextInt();
            if (inputNumber == 1){
                for (int i = 1; i <= 6; i ++){
                    if (i == inputNumber){
                        quantity ++;
                        inputNumber = input.nextInt();
                    }
                }
            }
            if (quantity == 6){
                quantityGrops ++;
            }
        }
        System.out.println("РљРѕР»Р»Р»РёС‡РµСЃРІС‚Рѕ РІС…РѕР¶РґРµРЅРёР№: " + quantityGrops);
    }
    public static void TaskThirteen() {
        System.out.println("Введите 6 чисел");
        Scanner in = new Scanner(System.in);
        double a1 = in.nextDouble();
        double a2 = in.nextDouble();
        double a3 = in.nextDouble();
        double a4 = in.nextDouble();
        double a5 = in.nextDouble();
        double a6 = in.nextDouble();
        int check = 0;
        int k = 0;
        while (check == 0) {
            if (a1 == 1 && a2 == 2 && a3 == 1 && a4 == 2 && a5 == 1 && a6 == 2) {
                k++;
            }
            a1 = a2;
            a2 = a3;
            a3 = a4;
            a4 = a5;
            a5 = a6;
            a6 = in.nextDouble();
            if ((a6 % 1) == 0) {
                check = 0;
            } else {
                check = 1;
            }

        }
        System.out.println(k);

    }

}
