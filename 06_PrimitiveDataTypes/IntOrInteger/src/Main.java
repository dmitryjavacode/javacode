public class Main {

    public static void main(String[] args) {
        Container container = new Container(0);
        container.addCount(5672);
        System.out.println(container.getCount());

        //  ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.

        // Вариант №1

        String alphabetRu = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЫЬЭЮЯ";
        String alphabetRuFull = alphabetRu + alphabetRu.toLowerCase();
        for (int i = 0; i < 65536; i++) {
            char c = (char) i;
            if(alphabetRuFull.indexOf(c) != -1){
                System.out.println(i + " " + c);
            }
        }

        // Вариант №2

//        String alphabetRu = "АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЬЫЬЭЮЯ";
//        String alphabetRuFull = alphabetRu + alphabetRu.toLowerCase();
//        for (int i = 0; i < 65536; i++) {
//            char c = (char) i;
//            String str = String.valueOf(c);
//            if(alphabetRuFull.contains(str))
//            System.out.println(i + " " + c);
//        }

    }

}
