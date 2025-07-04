package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class ao3wqKm5CXFuvC0q47 {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Map f3842lEeR5KfoEr4xU5yHH7 = new LinkedHashMap();

    public final Set HJFh0TGMpafqLE9haL() {
        return new HashSet(this.f3842lEeR5KfoEr4xU5yHH7.keySet());
    }

    public final void lEeR5KfoEr4xU5yHH7() {
        Iterator it = this.f3842lEeR5KfoEr4xU5yHH7.values().iterator();
        while (it.hasNext()) {
            ((VItLRw50eXTZeEfGl0) it.next()).lEeR5KfoEr4xU5yHH7();
        }
        this.f3842lEeR5KfoEr4xU5yHH7.clear();
    }

    public final VItLRw50eXTZeEfGl0 s3fjYDxWOUexjjVgyA(String str) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "key");
        return (VItLRw50eXTZeEfGl0) this.f3842lEeR5KfoEr4xU5yHH7.get(str);
    }

    public final void zZKhbgvUfsK4AEX3r0(String str, VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl0) {
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(str, "key");
        jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(vItLRw50eXTZeEfGl0, "viewModel");
        VItLRw50eXTZeEfGl0 vItLRw50eXTZeEfGl02 = (VItLRw50eXTZeEfGl0) this.f3842lEeR5KfoEr4xU5yHH7.put(str, vItLRw50eXTZeEfGl0);
        if (vItLRw50eXTZeEfGl02 != null) {
            vItLRw50eXTZeEfGl02.zZKhbgvUfsK4AEX3r0();
        }
    }
}
