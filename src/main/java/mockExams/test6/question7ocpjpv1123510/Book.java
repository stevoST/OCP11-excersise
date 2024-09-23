package mockExams.test6.question7ocpjpv1123510;

interface Book {
    public default String getId() {
        return "ISBN123456";
    }
}

interface Encyclopedia extends Book {
    //INSERT CODE HERE
}
