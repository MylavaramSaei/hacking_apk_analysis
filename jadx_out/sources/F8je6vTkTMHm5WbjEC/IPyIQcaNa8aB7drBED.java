package F8je6vTkTMHm5WbjEC;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class IPyIQcaNa8aB7drBED extends TCyPEKSzIyweCN5yp1 {
    public static Object IPyIQcaNa8aB7drBED(Object[] objArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "<this>");
        if (objArr.length == 1) {
            return objArr[0];
        }
        return null;
    }

    public static final int KYHag8HRDlnO3X9zmZ(Object[] objArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "<this>");
        return objArr.length - 1;
    }

    public static char TCyPEKSzIyweCN5yp1(char[] cArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }
}
