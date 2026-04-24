public class JavaSong {
    private String title;
    private String author;
    private boolean platinum;

    public JavaSong(String title, String author, boolean platinum){
        this.title = title;
        this.author = author;
        this.platinum = platinum;
    }

    public void setPlatinum(boolean platinum){
        this.platinum = platinum;
    }

    @Override
    public String toString(){
        return title + " by " + author + " | Platinum: " + platinum;
    }
}