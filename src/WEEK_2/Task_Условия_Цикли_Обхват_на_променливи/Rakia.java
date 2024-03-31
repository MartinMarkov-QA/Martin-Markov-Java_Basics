package WEEK_2.Task_Условия_Цикли_Обхват_на_променливи;

/*
 *  15. Ракийчице
 *  Събрали сме плодове, направили сме си джибри и сега е време да преценим кога е най- добрият момент, в който да
 *  отидем до казана и да получим дълго чаканата си домашна ракийка.
 *  Знаем, че процесът на ферментация е свързан с бактерии, които преработват захарта в алкохол. Освен тези приятни
 *  бактерии обаче, има и едни други, не толкова дружелюбни бактерии, които преобразуват алкохола в оцет.
 *  Ако приемем, че в началото на процеса имаме 100% захар. За един ден бактериите преобразуват 10% (от наличната
 *  захар) в алкохол и 1% от алкохола в оцет.
 *  След колко дни трябва да отидем до казана, така че да получим възможно най-много алкохол?
 */
public class Rakia {
    public static void main(String[] args) {
        double totalSugar = 100;
        double sugarToAlcoholEachDay;
        double pureAlcoholTotal = 0;
        double vinegarTotal = 0;
        double singleDayAlcoholFromSugarPercentage = 0.10;
        double singleDayAlcoholToVinegarPercentage = 0.01;
        int daysOfProcessRakia = 0;

        // Using 1% as loop breaker because with 0% the loop becomes to large, and we don't want to wait for the Rakia to long :)
        while (totalSugar > 1) {
            sugarToAlcoholEachDay = totalSugar * singleDayAlcoholFromSugarPercentage;
            pureAlcoholTotal += sugarToAlcoholEachDay - (sugarToAlcoholEachDay * singleDayAlcoholToVinegarPercentage);
            vinegarTotal += sugarToAlcoholEachDay * singleDayAlcoholToVinegarPercentage;
            totalSugar -= totalSugar * singleDayAlcoholFromSugarPercentage;
            daysOfProcessRakia++;
        }

        System.out.println("daysOfProcessRakia = " + daysOfProcessRakia);
        System.out.println("pureAlcoholTotal = " + pureAlcoholTotal);
        System.out.println("vinegarTotal = " + vinegarTotal);
        System.out.println("sugarLeft = " + totalSugar);
    }
}
