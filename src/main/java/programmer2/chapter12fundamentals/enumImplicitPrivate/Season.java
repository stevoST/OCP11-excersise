package programmer2.chapter12fundamentals.enumImplicitPrivate;

public enum Season {
    Winter("Low"),SPRING("Medium"),SUMMER("High"),FALL("Medium");
    private final String expectedVisitors;
    private Season(String expectedVisitors){
        System.out.println("constuctor called");
        this.expectedVisitors = expectedVisitors;
    }

    public void printExpectedVisitors(){
        System.out.println(expectedVisitors);
    }
}
