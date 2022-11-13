package programmer1.chapter10.question17;

public class QuestionClass {
    void rollOut() throws ClassCastException{}

    public void transform(String c){
        try {
            rollOut();
//        } catch (IllegalArgumentException | Error b){
//        } catch (IllegalArgumentException | NullPointerException b){
//        } catch (IllegalArgumentException | RuntimeException b){
//        } catch (IllegalArgumentException | NumberFormatException b){
        } catch (IllegalArgumentException | ClassCastException b){

        }
    }
}
