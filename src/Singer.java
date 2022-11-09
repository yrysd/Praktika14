public class Singer extends Person {

    private String brentName;

    public Singer(String name, String designation, String brentName) {
        super(name, designation);
        this.brentName = brentName;
    }

    public String getBrentName() {
        return brentName;
    }

    public void setBrentName(String brentName) {
        this.brentName = brentName;
    }

    public void singing(){
        System.out.println("Gimn ");

    }
    public void playGitar(){
        System.out.println("Play gitar: Kusnechik");

    }

    @Override
    public String toString() {
        return "name :"+getName()+'\n'+
                "Designation : "+getDesignation()+'\n'+
                "Brent Name: "+brentName;
    }
}
