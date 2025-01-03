class Student {
    private String NameID;
    private String information;

    public Student(String name, String information) {
        this.NameID = name;
        this.information = information;
    }

    public String getInf() {
        return this.information;
    }

    public String getName() {
        return this.name;
    }

    public void setInformation(String name) {
        this.name = name;
    }
}