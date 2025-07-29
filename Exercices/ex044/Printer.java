public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
    }
    public int addToner(int tonerAmount){
        for(int i = 0; i<tonerAmount; i++){
            if(tonerLevel < 100 && tonerLevel > 0){
                tonerLevel++;
            }else{
                break;
            }
        }
        return tonerLevel;
    }
    public int getTonerLevel() {
        return tonerLevel;
    }
    public int getPagesPrinted() {
        return pagesPrinted;
    }
    public int printPages(int pages){
        int pagesBePrinted;
        if (duplex){
            pagesBePrinted = pages / 2;
            System.out.println("Its a Duplex");
        }else{
            pagesBePrinted = pages;
        }
        pagesPrinted += pagesBePrinted;
        return pagesPrinted;
    }
}

