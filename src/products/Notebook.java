package products;

public class Notebook extends Product {
    private int pageCount;
    private boolean isHardCover;

    public Notebook(String title, Double price, int pageCount, boolean isHardCover) {
        super(title, price);
        this.pageCount = pageCount;
        this.isHardCover = isHardCover;
    }

    // Getters و Setters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public boolean isHardCover() {
        return isHardCover;
    }

    public void setHardCover(boolean hardCover) {
        isHardCover = hardCover;
    }

    @Override
    protected String generateId() {
        return "2" + (int)(Math.random() * 10000);
    }

    @Override
    public String toString() {
        return super.toString() + ", Page Count: " + pageCount + ", Hard Cover: " + isHardCover;
    }
}


