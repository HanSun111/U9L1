public class Textbook extends Book{
    private int edition;
    public Textbook(String bookTitle, double bookPrice, int edition){
        super(bookTitle, bookPrice);
        this.edition = edition;
    }

    public String getBookInfo() {
        return super.getTitle() + "-" + edition;
    }

    public int getEdition() {
        return edition;
    }

    public boolean canSubstituteFor(Textbook t){
        if(super.getTitle().equals(t.getTitle()) && getEdition() < t.getEdition()){
            return true;
        }
        return false;
    }
}
