package programmer2.chapter16exceptionsAssertionsLocalization.assertions.disabled;

import programmer2.chapter16exceptionsAssertionsLocalization.assertions.enabled.EnabledAssertion;

public class DisabledAssertion {
    public static void main(String[] args) {
        int x = 2;
        assert x == 3;
        System.out.println("assertion disabled");
        EnabledAssertion.main(new String[0]);
    }
}
