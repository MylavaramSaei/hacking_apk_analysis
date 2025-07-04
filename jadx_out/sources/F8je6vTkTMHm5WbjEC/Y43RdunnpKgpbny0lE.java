package F8je6vTkTMHm5WbjEC;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class Y43RdunnpKgpbny0lE extends sTkWmhpZ5b1ArQIw4K {
    public static Object Acstmh57AKoSEkEFNJ(Iterable iterable) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "<this>");
        if (iterable instanceof List) {
            return Z9WdNiOsPR0y54zHW4((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static boolean IPyIQcaNa8aB7drBED(Iterable iterable, Object obj) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "<this>");
        return iterable instanceof Collection ? ((Collection) iterable).contains(obj) : pbVGzGjWvY2LDXC8vo(iterable, obj) >= 0;
    }

    public static final Object Z9WdNiOsPR0y54zHW4(List list) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static final int pbVGzGjWvY2LDXC8vo(Iterable iterable, Object obj) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                Z9WdNiOsPR0y54zHW4.KYHag8HRDlnO3X9zmZ();
            }
            if (jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.lEeR5KfoEr4xU5yHH7(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
