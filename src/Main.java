public class Main {

    public static void main(String[] args) {
        Dog a = new Dog();
        a.setName("Roshan");
        a.setBreed("Mops");
        Shelter b = new Shelter("Losantos","Alfa 228");
        a.setShelter(b);
        a.setColor(Color.WHITE);
        a.setCommands(new String[] {"Fas" , "Sidaun" });
        a.makeVoice();
        System.out.println(a.getInfo());

        Dog a2 = new Dog("Rich","Labrador",Color.BLACK,new Shelter("Sevendays","Baytik 6b" ));
        a2.setCommands(new String[]{"Jump", "fas"});
        a2.makeVoice("Gaav");
        System.out.println(a2.getInfo());

        Dog a3 = new Dog("Sven","Buldog",Color.BROWN,new Shelter("Happy Dogs", "Getto"));
        a3.makevoice("Gaaaav",2);










    }
}
