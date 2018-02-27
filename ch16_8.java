package ch16;
/*
Write a method called switchPairs that switches the order of values in the list in a pairwise fashion.
Your method should switch the order of the first two values, then switch the order of the next two,
switch the order of the next two, and so on. If the list contains an odd number of values, the final
element is not moved. For example, if the list initially stores [10, 25, 31, 47, 52, 68, 77],
your method should switch the first pair (10 and 25), the sec- ond pair (31 and 47),
and the third pair (52 and 68) to yield [25, 10, 47, 31, 68, 52, 77].
 */
public class ch16_8 {
    public static void main(String[] args) {
        LinkedIntList liste = new LinkedIntList();
        liste.add(10);
        liste.add(25);
        liste.add(31);
        liste.add(47);
        liste.add(52);
        liste.add(1);
        liste.add(5);


        liste.switchPairs(liste);
    }
    /*
    Kaldte metode:

    //Valgte at lade metoden tage en liste som paramter for at gøre koden lettere at læse.
    public void switchPairs (LinkedIntList list){

        //Laver en midlertidig liste som fyldes op med dataen i ønsket rækkefølge
        //(hvert par switched).
        LinkedIntList tempList = new LinkedIntList();
        //Switcher hvert par ved brug af et forloop hvorunder i%2==0 bliver sat som en condition for et if-statement.
        //Hvis i%2==0 tilføjes i+1 og derefter i, hvilket får de to styks data til at skifte plads.
        //Grunden til at i%2==0 er sat som condition, er at den tilføjer 2 tal hver anden gang, hvilket
        //gør at listen forbliver samme længde og at tallene bliver switched som efterspurgt i opgaven.
        for (int i = 0; i < list.size()-1; i++){
            if (i % 2 == 0){
                tempList.add(list.get(i+1));
                tempList.add(list.get(i));
            }
        }
        //Tester om den givne liste er af ujævn længde -
        //hvis den er ujævn, indsættes sidste nodes data bagi.
        if (list.size() % 2 != 0){
            tempList.add(list.get(list.size()-1));
        }

        System.out.println(tempList);
    }
     */
}
