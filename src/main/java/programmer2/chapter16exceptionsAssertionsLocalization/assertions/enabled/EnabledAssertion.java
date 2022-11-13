package programmer2.chapter16exceptionsAssertionsLocalization.assertions.enabled;

import programmer2.chapter16exceptionsAssertionsLocalization.assertions.disabled.DisabledAssertion;

public class EnabledAssertion {
    public static void main(String[] args) {
        int x =2;
        assert x==3;
        System.out.println("assertion enabled");
    }
}
