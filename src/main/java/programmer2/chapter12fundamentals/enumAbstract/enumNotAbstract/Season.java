package programmer2.chapter12fundamentals.enumAbstract.enumNotAbstract;

public enum Season {
    WINTER {
        public String getHours() {
            return "10am-3pm";
        }
    },
    SUMMER {
        public String getHours() {
            return "9am-7pm";
        }
    },
    SPRING, FALL;

    public String getHours() {
        return "9am-5pm";

    }
}
