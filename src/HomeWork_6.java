import java.util.Arrays;

public class HomeWork_6 {
    public static void main(String[] args) {
        String[] seasons  = new String[] {"Зима", "Весна", "Лето", "Осень"};

        System.out.println(Arrays.toString(seasons));
        System.out.println(Arrays.asList(seasons[3]));

        String[] month  = new String[12];
        month[0] = "Январь";
        month[1] = "Февраль";
        month[2] = "Март";
        month[3] = "Апрель";
        month[4] = "Май";
        month[5] = "Июнь";
        month[6] = "Июль";
        month[7] = "Август";
        month[8] = "Сентябрь";
        month[9] = "Октябрь";
        month[10] = "Ноябрь";
        month[11] = "Декабрь";

        System.out.println(Arrays.toString(month));
        System.out.println(Arrays.asList(month[7]));
        System.out.println(Arrays.asList(month[9]));


        String[] denNedili = new String[] {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        int [] chisloMonth = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        for (int i = 0; i < 31; i++) {
            System.out.print(chisloMonth[i]);
        }


    }
}
