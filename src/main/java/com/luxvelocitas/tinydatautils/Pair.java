package com.luxvelocitas.tinydatautils;

/**
 * A general-purpose pair
 */
public class Pair<A,B> {
    public final A a;
    public final B b;

    public Pair(A aa, B bb) {
        a = aa;
        b = bb;
    }

    @Override
    public int hashCode() {
        return a.hashCode() ^ b.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Pair)) return false;
        Pair rhs = (Pair)o;
        return this.a.equals(rhs.a) &&
                this.b.equals(rhs.b);
    }

}
