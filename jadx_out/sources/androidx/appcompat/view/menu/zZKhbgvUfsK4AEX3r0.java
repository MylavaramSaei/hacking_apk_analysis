package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class zZKhbgvUfsK4AEX3r0 implements THTDvPxsHqMeGb512f.lEeR5KfoEr4xU5yHH7 {

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public static final int[] f2729THTDvPxsHqMeGb512f = {1, 4, 5, 3, 2, 0};

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public husNiw3snxdgZPAGJm f2730A49QRPHynYLCBN0SqP;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f2733HJFh0TGMpafqLE9haL;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public View f2737OANkd3mP6AYvwbNLJM;

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f2739T9PhQIpGRhE4yZDm1C;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public boolean f2742WWC27LAMFqFFBzfbNw;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public Drawable f2745aPyGSIylzVNKPT1Bls;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public CharSequence f2747hoXrIDAFrSwfShk8da;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public lEeR5KfoEr4xU5yHH7 f2748husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public final Context f2749lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Resources f2751s3fjYDxWOUexjjVgyA;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public boolean f2754zZKhbgvUfsK4AEX3r0;

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public int f2746e54J8UWNHWALQNixXM = 0;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public boolean f2755zaq8hOURtfwbcX17cG = false;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public boolean f2752sTkWmhpZ5b1ArQIw4K = false;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f2743Y43RdunnpKgpbny0lE = false;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public boolean f2738R9SAhYMerGybF9OAjL = false;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public boolean f2732G7AC3DWIx9i9fdanjk = false;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public ArrayList f2753xHA29AmDt6y96AnB3t = new ArrayList();

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public CopyOnWriteArrayList f2736LIMtzhnLwQyigzK0KO = new CopyOnWriteArrayList();

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public boolean f2741VItLRw50eXTZeEfGl0 = false;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public ArrayList f2735KYHag8HRDlnO3X9zmZ = new ArrayList();

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public ArrayList f2740TCyPEKSzIyweCN5yp1 = new ArrayList();

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public boolean f2734IPyIQcaNa8aB7drBED = true;

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public ArrayList f2750pbVGzGjWvY2LDXC8vo = new ArrayList();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public ArrayList f2731Acstmh57AKoSEkEFNJ = new ArrayList();

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public boolean f2744Z9WdNiOsPR0y54zHW4 = true;

    public interface lEeR5KfoEr4xU5yHH7 {
        boolean lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem);

        void s3fjYDxWOUexjjVgyA(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0);
    }

    public interface s3fjYDxWOUexjjVgyA {
        boolean lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm);
    }

    public zZKhbgvUfsK4AEX3r0(Context context) {
        this.f2749lEeR5KfoEr4xU5yHH7 = context;
        this.f2751s3fjYDxWOUexjjVgyA = context.getResources();
        oocVJL811qFf0j0XXZ(true);
    }

    public static int A49QRPHynYLCBN0SqP(int i) {
        int i2 = ((-65536) & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f2729THTDvPxsHqMeGb512f;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public static int T9PhQIpGRhE4yZDm1C(ArrayList arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((husNiw3snxdgZPAGJm) arrayList.get(size)).zZKhbgvUfsK4AEX3r0() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    public boolean Acstmh57AKoSEkEFNJ(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        boolean zIPyIQcaNa8aB7drBED = false;
        if (this.f2736LIMtzhnLwQyigzK0KO.isEmpty()) {
            return false;
        }
        cT5Hs3CQpLK8NvlZAw();
        Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) weakReference.get();
            if (tCyPEKSzIyweCN5yp1 == null) {
                this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
            } else {
                zIPyIQcaNa8aB7drBED = tCyPEKSzIyweCN5yp1.IPyIQcaNa8aB7drBED(this, husniw3snxdgzpagjm);
                if (zIPyIQcaNa8aB7drBED) {
                    break;
                }
            }
        }
        udcVtCzLTM1Loe9KrX();
        if (zIPyIQcaNa8aB7drBED) {
            this.f2730A49QRPHynYLCBN0SqP = husniw3snxdgzpagjm;
        }
        return zIPyIQcaNa8aB7drBED;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021 A[PHI: r1
      0x0021: PHI (r1v4 boolean) = (r1v2 boolean), (r1v1 boolean), (r1v5 boolean) binds: [B:24:0x0054, B:15:0x002d, B:10:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean DfpieXfdYs58yZAiXY(android.view.MenuItem r5, androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1 r6, int r7) {
        /*
            r4 = this;
            androidx.appcompat.view.menu.husNiw3snxdgZPAGJm r5 = (androidx.appcompat.view.menu.husNiw3snxdgZPAGJm) r5
            r0 = 0
            if (r5 == 0) goto L58
            boolean r1 = r5.isEnabled()
            if (r1 != 0) goto Lc
            goto L58
        Lc:
            boolean r1 = r5.Acstmh57AKoSEkEFNJ()
            r5.TCyPEKSzIyweCN5yp1()
            boolean r2 = r5.pbVGzGjWvY2LDXC8vo()
            r3 = 1
            if (r2 == 0) goto L25
            boolean r5 = r5.expandActionView()
            r1 = r1 | r5
            if (r1 == 0) goto L57
        L21:
            r4.zZKhbgvUfsK4AEX3r0(r3)
            goto L57
        L25:
            boolean r2 = r5.hasSubMenu()
            if (r2 != 0) goto L30
            r5 = r7 & 1
            if (r5 != 0) goto L57
            goto L21
        L30:
            r7 = r7 & 4
            if (r7 != 0) goto L37
            r4.zZKhbgvUfsK4AEX3r0(r0)
        L37:
            boolean r7 = r5.hasSubMenu()
            if (r7 != 0) goto L49
            androidx.appcompat.view.menu.Acstmh57AKoSEkEFNJ r7 = new androidx.appcompat.view.menu.Acstmh57AKoSEkEFNJ
            android.content.Context r0 = r4.Y43RdunnpKgpbny0lE()
            r7.<init>(r0, r4, r5)
            r5.LIMtzhnLwQyigzK0KO(r7)
        L49:
            android.view.SubMenu r5 = r5.getSubMenu()
            androidx.appcompat.view.menu.Acstmh57AKoSEkEFNJ r5 = (androidx.appcompat.view.menu.Acstmh57AKoSEkEFNJ) r5
            boolean r5 = r4.pbVGzGjWvY2LDXC8vo(r5, r6)
            r1 = r1 | r5
            if (r1 != 0) goto L57
            goto L21
        L57:
            return r1
        L58:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.DfpieXfdYs58yZAiXY(android.view.MenuItem, androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1, int):boolean");
    }

    public CharSequence G7AC3DWIx9i9fdanjk() {
        return this.f2747hoXrIDAFrSwfShk8da;
    }

    public boolean GyWRxpdt1T8mEJXPoD(MenuItem menuItem, int i) {
        return DfpieXfdYs58yZAiXY(menuItem, null, i);
    }

    public void HJFh0TGMpafqLE9haL() {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2748husNiw3snxdgZPAGJm;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(this);
        }
    }

    public final void IPyIQcaNa8aB7drBED(boolean z) {
        if (this.f2736LIMtzhnLwQyigzK0KO.isEmpty()) {
            return;
        }
        cT5Hs3CQpLK8NvlZAw();
        Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) weakReference.get();
            if (tCyPEKSzIyweCN5yp1 == null) {
                this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
            } else {
                tCyPEKSzIyweCN5yp1.Z9WdNiOsPR0y54zHW4(z);
            }
        }
        udcVtCzLTM1Loe9KrX();
    }

    public final husNiw3snxdgZPAGJm KYHag8HRDlnO3X9zmZ(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        return new husNiw3snxdgZPAGJm(this, i, i2, i3, i4, charSequence, i5);
    }

    public void KqgKJKIWne3kz1AdHk(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = (TCyPEKSzIyweCN5yp1) weakReference.get();
            if (tCyPEKSzIyweCN5yp12 == null || tCyPEKSzIyweCN5yp12 == tCyPEKSzIyweCN5yp1) {
                this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
            }
        }
    }

    public boolean LIMtzhnLwQyigzK0KO() {
        return this.f2738R9SAhYMerGybF9OAjL;
    }

    public zZKhbgvUfsK4AEX3r0 LU0fFDMACqnfIfA1AZ(int i) {
        XdzLv4NdAtTYoEzVzB(i, null, 0, null, null);
        return this;
    }

    public void OANkd3mP6AYvwbNLJM(List list, int i, KeyEvent keyEvent) {
        boolean zJCtUeU2YI1poCxWcjm = jCtUeU2YI1poCxWcjm();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
            for (int i2 = 0; i2 < size; i2++) {
                husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2);
                if (husniw3snxdgzpagjm.hasSubMenu()) {
                    ((zZKhbgvUfsK4AEX3r0) husniw3snxdgzpagjm.getSubMenu()).OANkd3mP6AYvwbNLJM(list, i, keyEvent);
                }
                char alphabeticShortcut = zJCtUeU2YI1poCxWcjm ? husniw3snxdgzpagjm.getAlphabeticShortcut() : husniw3snxdgzpagjm.getNumericShortcut();
                if ((modifiers & 69647) == ((zJCtUeU2YI1poCxWcjm ? husniw3snxdgzpagjm.getAlphabeticModifiers() : husniw3snxdgzpagjm.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zJCtUeU2YI1poCxWcjm && alphabeticShortcut == '\b' && i == 67)) && husniw3snxdgzpagjm.isEnabled()) {
                        list.add(husniw3snxdgzpagjm);
                    }
                }
            }
        }
    }

    public boolean OUd9THiLjZndMj0qdF() {
        return this.f2741VItLRw50eXTZeEfGl0;
    }

    public void OqIo5QF00RDxUQb4qq(boolean z) {
        if (this.f2755zaq8hOURtfwbcX17cG) {
            this.f2752sTkWmhpZ5b1ArQIw4K = true;
            if (z) {
                this.f2743Y43RdunnpKgpbny0lE = true;
                return;
            }
            return;
        }
        if (z) {
            this.f2734IPyIQcaNa8aB7drBED = true;
            this.f2744Z9WdNiOsPR0y54zHW4 = true;
        }
        IPyIQcaNa8aB7drBED(z);
    }

    public void PPkm9uUfOJHHYveeLT(lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2748husNiw3snxdgZPAGJm = leer5kfoer4xu5yhh7;
    }

    public husNiw3snxdgZPAGJm R9SAhYMerGybF9OAjL() {
        return this.f2730A49QRPHynYLCBN0SqP;
    }

    public boolean TCyPEKSzIyweCN5yp1(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
        lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2748husNiw3snxdgZPAGJm;
        return leer5kfoer4xu5yhh7 != null && leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0, menuItem);
    }

    public ArrayList THTDvPxsHqMeGb512f() {
        if (!this.f2734IPyIQcaNa8aB7drBED) {
            return this.f2740TCyPEKSzIyweCN5yp1;
        }
        this.f2740TCyPEKSzIyweCN5yp1.clear();
        int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
        for (int i = 0; i < size; i++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i);
            if (husniw3snxdgzpagjm.isVisible()) {
                this.f2740TCyPEKSzIyweCN5yp1.add(husniw3snxdgzpagjm);
            }
        }
        this.f2734IPyIQcaNa8aB7drBED = false;
        this.f2744Z9WdNiOsPR0y54zHW4 = true;
        return this.f2740TCyPEKSzIyweCN5yp1;
    }

    public zZKhbgvUfsK4AEX3r0 ToH8yzk8U1nKT0PUfY(Drawable drawable) {
        XdzLv4NdAtTYoEzVzB(0, null, 0, drawable, null);
        return this;
    }

    public Resources VItLRw50eXTZeEfGl0() {
        return this.f2751s3fjYDxWOUexjjVgyA;
    }

    public void W3RZ2dTDKrKpS5Mxdk(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f2734IPyIQcaNa8aB7drBED = true;
        OqIo5QF00RDxUQb4qq(true);
    }

    public zZKhbgvUfsK4AEX3r0 WWC27LAMFqFFBzfbNw() {
        return this;
    }

    public final void XdzLv4NdAtTYoEzVzB(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resourcesVItLRw50eXTZeEfGl0 = VItLRw50eXTZeEfGl0();
        if (view != null) {
            this.f2737OANkd3mP6AYvwbNLJM = view;
            this.f2747hoXrIDAFrSwfShk8da = null;
            this.f2745aPyGSIylzVNKPT1Bls = null;
        } else {
            if (i > 0) {
                this.f2747hoXrIDAFrSwfShk8da = resourcesVItLRw50eXTZeEfGl0.getText(i);
            } else if (charSequence != null) {
                this.f2747hoXrIDAFrSwfShk8da = charSequence;
            }
            if (i2 > 0) {
                this.f2745aPyGSIylzVNKPT1Bls = LIMtzhnLwQyigzK0KO.lEeR5KfoEr4xU5yHH7.husNiw3snxdgZPAGJm(Y43RdunnpKgpbny0lE(), i2);
            } else if (drawable != null) {
                this.f2745aPyGSIylzVNKPT1Bls = drawable;
            }
            this.f2737OANkd3mP6AYvwbNLJM = null;
        }
        OqIo5QF00RDxUQb4qq(false);
    }

    public boolean XzJ1BS7H9Ilbkv4eVM() {
        return this.f2754zZKhbgvUfsK4AEX3r0;
    }

    public Context Y43RdunnpKgpbny0lE() {
        return this.f2749lEeR5KfoEr4xU5yHH7;
    }

    public zZKhbgvUfsK4AEX3r0 YlLW4G6OV9TFyuw5ix(View view) {
        XdzLv4NdAtTYoEzVzB(0, null, 0, null, view);
        return this;
    }

    public int Z9WdNiOsPR0y54zHW4(int i) {
        return e54J8UWNHWALQNixXM(i, 0);
    }

    public void aAp6BD79BhftLCnuvf(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
        cT5Hs3CQpLK8NvlZAw();
        for (int i = 0; i < size; i++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i);
            if (husniw3snxdgzpagjm.getGroupId() == groupId && husniw3snxdgzpagjm.e54J8UWNHWALQNixXM() && husniw3snxdgzpagjm.isCheckable()) {
                husniw3snxdgzpagjm.sTkWmhpZ5b1ArQIw4K(husniw3snxdgzpagjm == menuItem);
            }
        }
        udcVtCzLTM1Loe9KrX();
    }

    public husNiw3snxdgZPAGJm aPyGSIylzVNKPT1Bls(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f2753xHA29AmDt6y96AnB3t;
        arrayList.clear();
        OANkd3mP6AYvwbNLJM(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (husNiw3snxdgZPAGJm) arrayList.get(0);
        }
        boolean zJCtUeU2YI1poCxWcjm = jCtUeU2YI1poCxWcjm();
        for (int i2 = 0; i2 < size; i2++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) arrayList.get(i2);
            char alphabeticShortcut = zJCtUeU2YI1poCxWcjm ? husniw3snxdgzpagjm.getAlphabeticShortcut() : husniw3snxdgzpagjm.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zJCtUeU2YI1poCxWcjm && alphabeticShortcut == '\b' && i == 67))) {
                return husniw3snxdgzpagjm;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return lEeR5KfoEr4xU5yHH7(0, 0, 0, this.f2751s3fjYDxWOUexjjVgyA.getString(i));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        PackageManager packageManager = this.f2749lEeR5KfoEr4xU5yHH7.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i6 = 0; i6 < size; i6++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i6);
            int i7 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i7 < 0 ? intent : intentArr[i7]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i5 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i5] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f2751s3fjYDxWOUexjjVgyA.getString(i));
    }

    public boolean ao3wqKm5CXFuvC0q47() {
        return !this.f2755zaq8hOURtfwbcX17cG;
    }

    public void cT5Hs3CQpLK8NvlZAw() {
        if (this.f2755zaq8hOURtfwbcX17cG) {
            return;
        }
        this.f2755zaq8hOURtfwbcX17cG = true;
        this.f2752sTkWmhpZ5b1ArQIw4K = false;
        this.f2743Y43RdunnpKgpbny0lE = false;
    }

    @Override // android.view.Menu
    public void clear() {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = this.f2730A49QRPHynYLCBN0SqP;
        if (husniw3snxdgzpagjm != null) {
            husNiw3snxdgZPAGJm(husniw3snxdgzpagjm);
        }
        this.f2735KYHag8HRDlnO3X9zmZ.clear();
        OqIo5QF00RDxUQb4qq(true);
    }

    public void clearHeader() {
        this.f2745aPyGSIylzVNKPT1Bls = null;
        this.f2747hoXrIDAFrSwfShk8da = null;
        this.f2737OANkd3mP6AYvwbNLJM = null;
        OqIo5QF00RDxUQb4qq(false);
    }

    @Override // android.view.Menu
    public void close() {
        zZKhbgvUfsK4AEX3r0(true);
    }

    public final void e2F9F6h8YJxTHwLCa0(int i, boolean z) {
        if (i < 0 || i >= this.f2735KYHag8HRDlnO3X9zmZ.size()) {
            return;
        }
        this.f2735KYHag8HRDlnO3X9zmZ.remove(i);
        if (z) {
            OqIo5QF00RDxUQb4qq(true);
        }
    }

    public int e54J8UWNHWALQNixXM(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2);
            if (husniw3snxdgzpagjm.getItemId() == i) {
                return husniw3snxdgzpagjm;
            }
            if (husniw3snxdgzpagjm.hasSubMenu() && (menuItemFindItem = husniw3snxdgzpagjm.getSubMenu().findItem(i)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return (MenuItem) this.f2735KYHag8HRDlnO3X9zmZ.get(i);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f2742WWC27LAMFqFFBzfbNw) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public int hoXrIDAFrSwfShk8da(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean husNiw3snxdgZPAGJm(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        boolean zHusNiw3snxdgZPAGJm = false;
        if (!this.f2736LIMtzhnLwQyigzK0KO.isEmpty() && this.f2730A49QRPHynYLCBN0SqP == husniw3snxdgzpagjm) {
            cT5Hs3CQpLK8NvlZAw();
            Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) weakReference.get();
                if (tCyPEKSzIyweCN5yp1 == null) {
                    this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
                } else {
                    zHusNiw3snxdgZPAGJm = tCyPEKSzIyweCN5yp1.husNiw3snxdgZPAGJm(this, husniw3snxdgzpagjm);
                    if (zHusNiw3snxdgZPAGJm) {
                        break;
                    }
                }
            }
            udcVtCzLTM1Loe9KrX();
            if (zHusNiw3snxdgZPAGJm) {
                this.f2730A49QRPHynYLCBN0SqP = null;
            }
        }
        return zHusNiw3snxdgZPAGJm;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return aPyGSIylzVNKPT1Bls(i, keyEvent) != null;
    }

    public boolean jCtUeU2YI1poCxWcjm() {
        return this.f2733HJFh0TGMpafqLE9haL;
    }

    public MenuItem lEeR5KfoEr4xU5yHH7(int i, int i2, int i3, CharSequence charSequence) {
        int iA49QRPHynYLCBN0SqP = A49QRPHynYLCBN0SqP(i3);
        husNiw3snxdgZPAGJm husniw3snxdgzpagjmKYHag8HRDlnO3X9zmZ = KYHag8HRDlnO3X9zmZ(i, i2, i3, iA49QRPHynYLCBN0SqP, charSequence, this.f2746e54J8UWNHWALQNixXM);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f2739T9PhQIpGRhE4yZDm1C;
        if (contextMenuInfo != null) {
            husniw3snxdgzpagjmKYHag8HRDlnO3X9zmZ.G7AC3DWIx9i9fdanjk(contextMenuInfo);
        }
        ArrayList arrayList = this.f2735KYHag8HRDlnO3X9zmZ;
        arrayList.add(T9PhQIpGRhE4yZDm1C(arrayList, iA49QRPHynYLCBN0SqP), husniw3snxdgzpagjmKYHag8HRDlnO3X9zmZ);
        OqIo5QF00RDxUQb4qq(true);
        return husniw3snxdgzpagjmKYHag8HRDlnO3X9zmZ;
    }

    public zZKhbgvUfsK4AEX3r0 lLKzvdU99Iw80uVD5I(int i) {
        XdzLv4NdAtTYoEzVzB(0, null, i, null, null);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void oocVJL811qFf0j0XXZ(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f2751s3fjYDxWOUexjjVgyA
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f2749lEeR5KfoEr4xU5yHH7
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f2749lEeR5KfoEr4xU5yHH7
            boolean r3 = W3RZ2dTDKrKpS5Mxdk.zcy2NNbtVXgoGQbfuq.e54J8UWNHWALQNixXM(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f2754zZKhbgvUfsK4AEX3r0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.oocVJL811qFf0j0XXZ(boolean):void");
    }

    public final boolean pbVGzGjWvY2LDXC8vo(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ, TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1) {
        if (this.f2736LIMtzhnLwQyigzK0KO.isEmpty()) {
            return false;
        }
        boolean zAcstmh57AKoSEkEFNJ = tCyPEKSzIyweCN5yp1 != null ? tCyPEKSzIyweCN5yp1.Acstmh57AKoSEkEFNJ(acstmh57AKoSEkEFNJ) : false;
        Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp12 = (TCyPEKSzIyweCN5yp1) weakReference.get();
            if (tCyPEKSzIyweCN5yp12 == null) {
                this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
            } else if (!zAcstmh57AKoSEkEFNJ) {
                zAcstmh57AKoSEkEFNJ = tCyPEKSzIyweCN5yp12.Acstmh57AKoSEkEFNJ(acstmh57AKoSEkEFNJ);
            }
        }
        return zAcstmh57AKoSEkEFNJ;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return GyWRxpdt1T8mEJXPoD(findItem(i), i2);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjmAPyGSIylzVNKPT1Bls = aPyGSIylzVNKPT1Bls(i, keyEvent);
        boolean zGyWRxpdt1T8mEJXPoD = husniw3snxdgzpagjmAPyGSIylzVNKPT1Bls != null ? GyWRxpdt1T8mEJXPoD(husniw3snxdgzpagjmAPyGSIylzVNKPT1Bls, i2) : false;
        if ((i2 & 2) != 0) {
            zZKhbgvUfsK4AEX3r0(true);
        }
        return zGyWRxpdt1T8mEJXPoD;
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int iZ9WdNiOsPR0y54zHW4 = Z9WdNiOsPR0y54zHW4(i);
        if (iZ9WdNiOsPR0y54zHW4 >= 0) {
            int size = this.f2735KYHag8HRDlnO3X9zmZ.size() - iZ9WdNiOsPR0y54zHW4;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(iZ9WdNiOsPR0y54zHW4)).getGroupId() != i) {
                    break;
                }
                e2F9F6h8YJxTHwLCa0(iZ9WdNiOsPR0y54zHW4, false);
                i2 = i3;
            }
            OqIo5QF00RDxUQb4qq(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        e2F9F6h8YJxTHwLCa0(hoXrIDAFrSwfShk8da(i), true);
    }

    public void s3fjYDxWOUexjjVgyA(TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1, Context context) {
        this.f2736LIMtzhnLwQyigzK0KO.add(new WeakReference(tCyPEKSzIyweCN5yp1));
        tCyPEKSzIyweCN5yp1.zZKhbgvUfsK4AEX3r0(context, this);
        this.f2744Z9WdNiOsPR0y54zHW4 = true;
    }

    public ArrayList sTkWmhpZ5b1ArQIw4K() {
        zaq8hOURtfwbcX17cG();
        return this.f2750pbVGzGjWvY2LDXC8vo;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2);
            if (husniw3snxdgzpagjm.getGroupId() == i) {
                husniw3snxdgzpagjm.Y43RdunnpKgpbny0lE(z2);
                husniw3snxdgzpagjm.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.f2741VItLRw50eXTZeEfGl0 = z;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2);
            if (husniw3snxdgzpagjm.getGroupId() == i) {
                husniw3snxdgzpagjm.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.f2735KYHag8HRDlnO3X9zmZ.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) this.f2735KYHag8HRDlnO3X9zmZ.get(i2);
            if (husniw3snxdgzpagjm.getGroupId() == i && husniw3snxdgzpagjm.A49QRPHynYLCBN0SqP(z)) {
                z2 = true;
            }
        }
        if (z2) {
            OqIo5QF00RDxUQb4qq(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.f2733HJFh0TGMpafqLE9haL = z;
        OqIo5QF00RDxUQb4qq(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f2735KYHag8HRDlnO3X9zmZ.size();
    }

    public void tXWeW0sqVddf7ZBflq(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        this.f2744Z9WdNiOsPR0y54zHW4 = true;
        OqIo5QF00RDxUQb4qq(true);
    }

    public void udcVtCzLTM1Loe9KrX() {
        this.f2755zaq8hOURtfwbcX17cG = false;
        if (this.f2752sTkWmhpZ5b1ArQIw4K) {
            this.f2752sTkWmhpZ5b1ArQIw4K = false;
            OqIo5QF00RDxUQb4qq(this.f2743Y43RdunnpKgpbny0lE);
        }
    }

    public ArrayList xHA29AmDt6y96AnB3t() {
        zaq8hOURtfwbcX17cG();
        return this.f2731Acstmh57AKoSEkEFNJ;
    }

    public final void zZKhbgvUfsK4AEX3r0(boolean z) {
        if (this.f2732G7AC3DWIx9i9fdanjk) {
            return;
        }
        this.f2732G7AC3DWIx9i9fdanjk = true;
        Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) weakReference.get();
            if (tCyPEKSzIyweCN5yp1 == null) {
                this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
            } else {
                tCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7(this, z);
            }
        }
        this.f2732G7AC3DWIx9i9fdanjk = false;
    }

    public void zaq8hOURtfwbcX17cG() {
        ArrayList arrayListTHTDvPxsHqMeGb512f = THTDvPxsHqMeGb512f();
        if (this.f2744Z9WdNiOsPR0y54zHW4) {
            Iterator it = this.f2736LIMtzhnLwQyigzK0KO.iterator();
            boolean zHJFh0TGMpafqLE9haL = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                TCyPEKSzIyweCN5yp1 tCyPEKSzIyweCN5yp1 = (TCyPEKSzIyweCN5yp1) weakReference.get();
                if (tCyPEKSzIyweCN5yp1 == null) {
                    this.f2736LIMtzhnLwQyigzK0KO.remove(weakReference);
                } else {
                    zHJFh0TGMpafqLE9haL |= tCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL();
                }
            }
            if (zHJFh0TGMpafqLE9haL) {
                this.f2750pbVGzGjWvY2LDXC8vo.clear();
                this.f2731Acstmh57AKoSEkEFNJ.clear();
                int size = arrayListTHTDvPxsHqMeGb512f.size();
                for (int i = 0; i < size; i++) {
                    husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) arrayListTHTDvPxsHqMeGb512f.get(i);
                    (husniw3snxdgzpagjm.Z9WdNiOsPR0y54zHW4() ? this.f2750pbVGzGjWvY2LDXC8vo : this.f2731Acstmh57AKoSEkEFNJ).add(husniw3snxdgzpagjm);
                }
            } else {
                this.f2750pbVGzGjWvY2LDXC8vo.clear();
                this.f2731Acstmh57AKoSEkEFNJ.clear();
                this.f2731Acstmh57AKoSEkEFNJ.addAll(THTDvPxsHqMeGb512f());
            }
            this.f2744Z9WdNiOsPR0y54zHW4 = false;
        }
    }

    public zZKhbgvUfsK4AEX3r0 zcy2NNbtVXgoGQbfuq(CharSequence charSequence) {
        XdzLv4NdAtTYoEzVzB(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return lEeR5KfoEr4xU5yHH7(i, i2, i3, this.f2751s3fjYDxWOUexjjVgyA.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.f2751s3fjYDxWOUexjjVgyA.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return lEeR5KfoEr4xU5yHH7(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjm = (husNiw3snxdgZPAGJm) lEeR5KfoEr4xU5yHH7(i, i2, i3, charSequence);
        Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ = new Acstmh57AKoSEkEFNJ(this.f2749lEeR5KfoEr4xU5yHH7, this, husniw3snxdgzpagjm);
        husniw3snxdgzpagjm.LIMtzhnLwQyigzK0KO(acstmh57AKoSEkEFNJ);
        return acstmh57AKoSEkEFNJ;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return lEeR5KfoEr4xU5yHH7(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }
}
