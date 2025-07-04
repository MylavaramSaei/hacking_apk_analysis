package F8je6vTkTMHm5WbjEC;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class G7AC3DWIx9i9fdanjk implements List, Serializable, RandomAccess {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public static final G7AC3DWIx9i9fdanjk f129lEeR5KfoEr4xU5yHH7 = new G7AC3DWIx9i9fdanjk();

    public int HJFh0TGMpafqLE9haL() {
        return 0;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return lEeR5KfoEr4xU5yHH7((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    public int husNiw3snxdgZPAGJm(Void r2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(r2, "element");
        return -1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return zZKhbgvUfsK4AEX3r0((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return R9SAhYMerGybF9OAjL.f131lEeR5KfoEr4xU5yHH7;
    }

    public boolean lEeR5KfoEr4xU5yHH7(Void r2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(r2, "element");
        return false;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return husNiw3snxdgZPAGJm((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return R9SAhYMerGybF9OAjL.f131lEeR5KfoEr4xU5yHH7;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    /* renamed from: s3fjYDxWOUexjjVgyA, reason: merged with bridge method [inline-methods] */
    public Void get(int i) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i + '.');
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return HJFh0TGMpafqLE9haL();
    }

    @Override // java.util.List
    public List subList(int i, int i2) {
        if (i == 0 && i2 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return jpEZy3U5wFkT2e9PKQ.zZKhbgvUfsK4AEX3r0.lEeR5KfoEr4xU5yHH7(this);
    }

    public String toString() {
        return "[]";
    }

    public int zZKhbgvUfsK4AEX3r0(Void r2) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(r2, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i) {
        if (i == 0) {
            return R9SAhYMerGybF9OAjL.f131lEeR5KfoEr4xU5yHH7;
        }
        throw new IndexOutOfBoundsException("Index: " + i);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(objArr, "array");
        return jpEZy3U5wFkT2e9PKQ.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA(this, objArr);
    }
}
