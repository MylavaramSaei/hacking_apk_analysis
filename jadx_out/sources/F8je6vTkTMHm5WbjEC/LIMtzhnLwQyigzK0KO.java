package F8je6vTkTMHm5WbjEC;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class LIMtzhnLwQyigzK0KO implements Set, Serializable {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final LIMtzhnLwQyigzK0KO f130lEeR5KfoEr4xU5yHH7 = new LIMtzhnLwQyigzK0KO();

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return lEeR5KfoEr4xU5yHH7((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return R9SAhYMerGybF9OAjL.f131lEeR5KfoEr4xU5yHH7;
    }

    public boolean lEeR5KfoEr4xU5yHH7(Void r2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(r2, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int s3fjYDxWOUexjjVgyA() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return s3fjYDxWOUexjjVgyA();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return jpEZy3U5wFkT2e9PKQ.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "array");
        return jpEZy3U5wFkT2e9PKQ.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(this, objArr);
    }
}
