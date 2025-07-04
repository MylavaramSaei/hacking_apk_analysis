package F8je6vTkTMHm5WbjEC;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class xHA29AmDt6y96AnB3t implements Map, Serializable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final xHA29AmDt6y96AnB3t f133lEeR5KfoEr4xU5yHH7 = new xHA29AmDt6y96AnB3t();

    public Set HJFh0TGMpafqLE9haL() {
        return LIMtzhnLwQyigzK0KO.f130lEeR5KfoEr4xU5yHH7;
    }

    public Collection KYHag8HRDlnO3X9zmZ() {
        return G7AC3DWIx9i9fdanjk.f129lEeR5KfoEr4xU5yHH7;
    }

    @Override // java.util.Map
    /* renamed from: TCyPEKSzIyweCN5yp1, reason: merged with bridge method [inline-methods] */
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return lEeR5KfoEr4xU5yHH7((Void) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return HJFh0TGMpafqLE9haL();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override // java.util.Map
    public int hashCode() {
        return 0;
    }

    public int husNiw3snxdgZPAGJm() {
        return 0;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return zZKhbgvUfsK4AEX3r0();
    }

    public boolean lEeR5KfoEr4xU5yHH7(Void r2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(r2, "value");
        return false;
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
    public Void get(Object obj) {
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return husNiw3snxdgZPAGJm();
    }

    public String toString() {
        return "{}";
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return KYHag8HRDlnO3X9zmZ();
    }

    public Set zZKhbgvUfsK4AEX3r0() {
        return LIMtzhnLwQyigzK0KO.f130lEeR5KfoEr4xU5yHH7;
    }
}
