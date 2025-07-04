package W3RZ2dTDKrKpS5Mxdk;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class G7AC3DWIx9i9fdanjk {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Runnable f1826lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final CopyOnWriteArrayList f1827s3fjYDxWOUexjjVgyA = new CopyOnWriteArrayList();

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final Map f1825HJFh0TGMpafqLE9haL = new HashMap();

    public G7AC3DWIx9i9fdanjk(Runnable runnable) {
        this.f1826lEeR5KfoEr4xU5yHH7 = runnable;
    }

    public void HJFh0TGMpafqLE9haL(Menu menu) {
        Iterator it = this.f1827s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            ((LIMtzhnLwQyigzK0KO) it.next()).s3fjYDxWOUexjjVgyA(menu);
        }
    }

    public void lEeR5KfoEr4xU5yHH7(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f1827s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            ((LIMtzhnLwQyigzK0KO) it.next()).lEeR5KfoEr4xU5yHH7(menu, menuInflater);
        }
    }

    public boolean s3fjYDxWOUexjjVgyA(MenuItem menuItem) {
        Iterator it = this.f1827s3fjYDxWOUexjjVgyA.iterator();
        while (it.hasNext()) {
            if (((LIMtzhnLwQyigzK0KO) it.next()).HJFh0TGMpafqLE9haL(menuItem)) {
                return true;
            }
        }
        return false;
    }
}
