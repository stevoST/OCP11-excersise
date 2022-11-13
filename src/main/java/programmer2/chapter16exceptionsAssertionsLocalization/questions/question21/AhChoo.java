package programmer2.chapter16exceptionsAssertionsLocalization.questions.question21;

public class AhChoo {
    static class SneezeExeception extends Exception{}
    static class SniffleException extends SneezeExeception {}

    public static void main(String[] args) {
        try {
            throw new SneezeExeception();
        }catch (SneezeExeception /*| SniffleException*/ e){

        } finally {

        }
    }
}
