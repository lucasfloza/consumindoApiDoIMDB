public class Filme {
    public String id;
    public int rank;
    public String title;
    public String fulltitle;
    public int year;


    public Filme(String id, int rank, String title, String fulltitle, int year) {
        this.id = id;
        this.rank = rank;
        this.title = title;
        this.fulltitle = fulltitle;
        this.year = year;
    }



    @Override
    public String toString() {
        return rank+"- Filme{" +
                "id='" + id + '\'' +
                ", rank=" + rank +
                ", title='" + title + '\'' +
                ", fulltitle='" + fulltitle + '\'' +
                ", year=" + year +
                '}';
    }
}
