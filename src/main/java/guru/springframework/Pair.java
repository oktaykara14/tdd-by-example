package guru.springframework;

import java.util.Objects;

class Pair {
    private final String from;
    private final String to;

     Pair(String from, String s) {
        this.from = from;
        to = s;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pair pair = (Pair) object;
        return Objects.equals(from, pair.from) && Objects.equals(to, pair.to);
    }

    @Override
    public int hashCode() {
        return Objects.hash(from, to);
    }
}
