public class Main{
    public static void main(String[]args){
        JavaSong track1 = new JavaSong("look at the sea", "oiscle melonpan", false);
        JavaSong track2 = new JavaSong("Love is Stronger Than Pride", "Sade", false);
        System.out.println(track1);
        System.out.println(track1.isPlatinum());
    }
}