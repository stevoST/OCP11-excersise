package programmer1.chapter8.question15;

class Arachnid {
    static StringBuilder sb = new StringBuilder();

    {
        sb.append("c");
    }

    static {
        sb.append("u");
    }

    {
        sb.append("r");
    }
}
