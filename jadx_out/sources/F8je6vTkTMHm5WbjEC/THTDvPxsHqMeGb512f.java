package F8je6vTkTMHm5WbjEC;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class THTDvPxsHqMeGb512f extends WWC27LAMFqFFBzfbNw {
    public static final Map Acstmh57AKoSEkEFNJ(Iterable iterable, Map map) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "destination");
        TCyPEKSzIyweCN5yp1(map, iterable);
        return map;
    }

    public static final void IPyIQcaNa8aB7drBED(Map map, GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ[] kYHag8HRDlnO3X9zmZArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZArr, "pairs");
        for (GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ : kYHag8HRDlnO3X9zmZArr) {
            map.put(kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(), kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA());
        }
    }

    public static final Map KYHag8HRDlnO3X9zmZ(Map map) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : WWC27LAMFqFFBzfbNw.HJFh0TGMpafqLE9haL(map) : zZKhbgvUfsK4AEX3r0();
    }

    public static final void TCyPEKSzIyweCN5yp1(Map map, Iterable iterable) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "pairs");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ kYHag8HRDlnO3X9zmZ = (GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ) it.next();
            map.put(kYHag8HRDlnO3X9zmZ.lEeR5KfoEr4xU5yHH7(), kYHag8HRDlnO3X9zmZ.s3fjYDxWOUexjjVgyA());
        }
    }

    public static final Map Z9WdNiOsPR0y54zHW4(GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ[] kYHag8HRDlnO3X9zmZArr, Map map) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZArr, "<this>");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(map, "destination");
        IPyIQcaNa8aB7drBED(map, kYHag8HRDlnO3X9zmZArr);
        return map;
    }

    public static Map husNiw3snxdgZPAGJm(GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ... kYHag8HRDlnO3X9zmZArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(kYHag8HRDlnO3X9zmZArr, "pairs");
        return kYHag8HRDlnO3X9zmZArr.length > 0 ? Z9WdNiOsPR0y54zHW4(kYHag8HRDlnO3X9zmZArr, new LinkedHashMap(WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7(kYHag8HRDlnO3X9zmZArr.length))) : zZKhbgvUfsK4AEX3r0();
    }

    public static Map pbVGzGjWvY2LDXC8vo(Iterable iterable) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return KYHag8HRDlnO3X9zmZ(Acstmh57AKoSEkEFNJ(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return zZKhbgvUfsK4AEX3r0();
        }
        if (size != 1) {
            return Acstmh57AKoSEkEFNJ(iterable, new LinkedHashMap(WWC27LAMFqFFBzfbNw.lEeR5KfoEr4xU5yHH7(collection.size())));
        }
        return WWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA((GraqRgO5nDZP94CSeH.KYHag8HRDlnO3X9zmZ) (iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next()));
    }

    public static Map zZKhbgvUfsK4AEX3r0() {
        xHA29AmDt6y96AnB3t xha29amdt6y96anb3t = xHA29AmDt6y96AnB3t.f133lEeR5KfoEr4xU5yHH7;
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.HJFh0TGMpafqLE9haL(xha29amdt6y96anb3t, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return xha29amdt6y96anb3t;
    }
}
