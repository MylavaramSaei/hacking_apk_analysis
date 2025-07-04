package androidx.appcompat.view.menu;

import IPyIQcaNa8aB7drBED.XzJ1BS7H9Ilbkv4eVM;
import IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm;
import W3RZ2dTDKrKpS5Mxdk.Y43RdunnpKgpbny0lE;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class s3fjYDxWOUexjjVgyA extends TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA implements TCyPEKSzIyweCN5yp1, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: ao3wqKm5CXFuvC0q47, reason: collision with root package name */
    public static final int f2692ao3wqKm5CXFuvC0q47 = lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6234husNiw3snxdgZPAGJm;

    /* renamed from: A49QRPHynYLCBN0SqP, reason: collision with root package name */
    public TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 f2693A49QRPHynYLCBN0SqP;

    /* renamed from: G7AC3DWIx9i9fdanjk, reason: collision with root package name */
    public int f2695G7AC3DWIx9i9fdanjk;

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public final int f2696HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final boolean f2698KYHag8HRDlnO3X9zmZ;

    /* renamed from: LIMtzhnLwQyigzK0KO, reason: collision with root package name */
    public boolean f2699LIMtzhnLwQyigzK0KO;

    /* renamed from: OANkd3mP6AYvwbNLJM, reason: collision with root package name */
    public View f2700OANkd3mP6AYvwbNLJM;

    /* renamed from: R9SAhYMerGybF9OAjL, reason: collision with root package name */
    public int f2701R9SAhYMerGybF9OAjL;

    /* renamed from: TCyPEKSzIyweCN5yp1, reason: collision with root package name */
    public final Handler f2703TCyPEKSzIyweCN5yp1;

    /* renamed from: THTDvPxsHqMeGb512f, reason: collision with root package name */
    public boolean f2704THTDvPxsHqMeGb512f;

    /* renamed from: VItLRw50eXTZeEfGl0, reason: collision with root package name */
    public ViewTreeObserver f2705VItLRw50eXTZeEfGl0;

    /* renamed from: WWC27LAMFqFFBzfbNw, reason: collision with root package name */
    public PopupWindow.OnDismissListener f2706WWC27LAMFqFFBzfbNw;

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public boolean f2707Y43RdunnpKgpbny0lE;

    /* renamed from: aPyGSIylzVNKPT1Bls, reason: collision with root package name */
    public View f2709aPyGSIylzVNKPT1Bls;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final int f2712husNiw3snxdgZPAGJm;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public final Context f2714s3fjYDxWOUexjjVgyA;

    /* renamed from: sTkWmhpZ5b1ArQIw4K, reason: collision with root package name */
    public boolean f2715sTkWmhpZ5b1ArQIw4K;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final int f2717zZKhbgvUfsK4AEX3r0;

    /* renamed from: IPyIQcaNa8aB7drBED, reason: collision with root package name */
    public final List f2697IPyIQcaNa8aB7drBED = new ArrayList();

    /* renamed from: pbVGzGjWvY2LDXC8vo, reason: collision with root package name */
    public final List f2713pbVGzGjWvY2LDXC8vo = new ArrayList();

    /* renamed from: Acstmh57AKoSEkEFNJ, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f2694Acstmh57AKoSEkEFNJ = new lEeR5KfoEr4xU5yHH7();

    /* renamed from: Z9WdNiOsPR0y54zHW4, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f2708Z9WdNiOsPR0y54zHW4 = new ViewOnAttachStateChangeListenerC0032s3fjYDxWOUexjjVgyA();

    /* renamed from: e54J8UWNHWALQNixXM, reason: collision with root package name */
    public final jCtUeU2YI1poCxWcjm f2710e54J8UWNHWALQNixXM = new HJFh0TGMpafqLE9haL();

    /* renamed from: T9PhQIpGRhE4yZDm1C, reason: collision with root package name */
    public int f2702T9PhQIpGRhE4yZDm1C = 0;

    /* renamed from: hoXrIDAFrSwfShk8da, reason: collision with root package name */
    public int f2711hoXrIDAFrSwfShk8da = 0;

    /* renamed from: xHA29AmDt6y96AnB3t, reason: collision with root package name */
    public boolean f2716xHA29AmDt6y96AnB3t = false;

    /* renamed from: zaq8hOURtfwbcX17cG, reason: collision with root package name */
    public int f2718zaq8hOURtfwbcX17cG = jCtUeU2YI1poCxWcjm();

    public class HJFh0TGMpafqLE9haL implements jCtUeU2YI1poCxWcjm {

        public class lEeR5KfoEr4xU5yHH7 implements Runnable {

            /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 f2720HJFh0TGMpafqLE9haL;

            /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
            public final /* synthetic */ zZKhbgvUfsK4AEX3r0 f2721lEeR5KfoEr4xU5yHH7;

            /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
            public final /* synthetic */ MenuItem f2722s3fjYDxWOUexjjVgyA;

            public lEeR5KfoEr4xU5yHH7(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem, androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02) {
                this.f2721lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
                this.f2722s3fjYDxWOUexjjVgyA = menuItem;
                this.f2720HJFh0TGMpafqLE9haL = zzkhbgvufsk4aex3r02;
            }

            @Override // java.lang.Runnable
            public void run() {
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = this.f2721lEeR5KfoEr4xU5yHH7;
                if (zzkhbgvufsk4aex3r0 != null) {
                    s3fjYDxWOUexjjVgyA.this.f2704THTDvPxsHqMeGb512f = true;
                    zzkhbgvufsk4aex3r0.f2728s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(false);
                    s3fjYDxWOUexjjVgyA.this.f2704THTDvPxsHqMeGb512f = false;
                }
                if (this.f2722s3fjYDxWOUexjjVgyA.isEnabled() && this.f2722s3fjYDxWOUexjjVgyA.hasSubMenu()) {
                    this.f2720HJFh0TGMpafqLE9haL.GyWRxpdt1T8mEJXPoD(this.f2722s3fjYDxWOUexjjVgyA, 4);
                }
            }
        }

        public HJFh0TGMpafqLE9haL() {
        }

        @Override // IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm
        public void HJFh0TGMpafqLE9haL(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
            s3fjYDxWOUexjjVgyA.this.f2703TCyPEKSzIyweCN5yp1.removeCallbacksAndMessages(zzkhbgvufsk4aex3r0);
        }

        @Override // IPyIQcaNa8aB7drBED.jCtUeU2YI1poCxWcjm
        public void lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, MenuItem menuItem) {
            s3fjYDxWOUexjjVgyA.this.f2703TCyPEKSzIyweCN5yp1.removeCallbacksAndMessages(null);
            int size = s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (zzkhbgvufsk4aex3r0 == ((zZKhbgvUfsK4AEX3r0) s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.get(i)).f2728s3fjYDxWOUexjjVgyA) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                return;
            }
            int i2 = i + 1;
            s3fjYDxWOUexjjVgyA.this.f2703TCyPEKSzIyweCN5yp1.postAtTime(new lEeR5KfoEr4xU5yHH7(i2 < s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.size() ? (zZKhbgvUfsK4AEX3r0) s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.get(i2) : null, menuItem, zzkhbgvufsk4aex3r0), zzkhbgvufsk4aex3r0, SystemClock.uptimeMillis() + 200);
        }
    }

    public class lEeR5KfoEr4xU5yHH7 implements ViewTreeObserver.OnGlobalLayoutListener {
        public lEeR5KfoEr4xU5yHH7() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!s3fjYDxWOUexjjVgyA.this.KYHag8HRDlnO3X9zmZ() || s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.size() <= 0 || ((zZKhbgvUfsK4AEX3r0) s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.get(0)).f2727lEeR5KfoEr4xU5yHH7.hoXrIDAFrSwfShk8da()) {
                return;
            }
            View view = s3fjYDxWOUexjjVgyA.this.f2700OANkd3mP6AYvwbNLJM;
            if (view == null || !view.isShown()) {
                s3fjYDxWOUexjjVgyA.this.dismiss();
                return;
            }
            Iterator it = s3fjYDxWOUexjjVgyA.this.f2713pbVGzGjWvY2LDXC8vo.iterator();
            while (it.hasNext()) {
                ((zZKhbgvUfsK4AEX3r0) it.next()).f2727lEeR5KfoEr4xU5yHH7.s3fjYDxWOUexjjVgyA();
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.s3fjYDxWOUexjjVgyA$s3fjYDxWOUexjjVgyA, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0032s3fjYDxWOUexjjVgyA implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0032s3fjYDxWOUexjjVgyA() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = s3fjYDxWOUexjjVgyA.this.f2705VItLRw50eXTZeEfGl0;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    s3fjYDxWOUexjjVgyA.this.f2705VItLRw50eXTZeEfGl0 = view.getViewTreeObserver();
                }
                s3fjYDxWOUexjjVgyA s3fjydxwouexjjvgya = s3fjYDxWOUexjjVgyA.this;
                s3fjydxwouexjjvgya.f2705VItLRw50eXTZeEfGl0.removeGlobalOnLayoutListener(s3fjydxwouexjjvgya.f2694Acstmh57AKoSEkEFNJ);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public static class zZKhbgvUfsK4AEX3r0 {

        /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
        public final int f2726HJFh0TGMpafqLE9haL;

        /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
        public final XzJ1BS7H9Ilbkv4eVM f2727lEeR5KfoEr4xU5yHH7;

        /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
        public final androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 f2728s3fjYDxWOUexjjVgyA;

        public zZKhbgvUfsK4AEX3r0(XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM, androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, int i) {
            this.f2727lEeR5KfoEr4xU5yHH7 = xzJ1BS7H9Ilbkv4eVM;
            this.f2728s3fjYDxWOUexjjVgyA = zzkhbgvufsk4aex3r0;
            this.f2726HJFh0TGMpafqLE9haL = i;
        }

        public ListView lEeR5KfoEr4xU5yHH7() {
            return this.f2727lEeR5KfoEr4xU5yHH7.TCyPEKSzIyweCN5yp1();
        }
    }

    public s3fjYDxWOUexjjVgyA(Context context, View view, int i, int i2, boolean z) {
        this.f2714s3fjYDxWOUexjjVgyA = context;
        this.f2709aPyGSIylzVNKPT1Bls = view;
        this.f2717zZKhbgvUfsK4AEX3r0 = i;
        this.f2712husNiw3snxdgZPAGJm = i2;
        this.f2698KYHag8HRDlnO3X9zmZ = z;
        Resources resources = context.getResources();
        this.f2696HJFh0TGMpafqLE9haL = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(lEeR5KfoEr4xU5yHH7.HJFh0TGMpafqLE9haL.f6224s3fjYDxWOUexjjVgyA));
        this.f2703TCyPEKSzIyweCN5yp1 = new Handler();
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean Acstmh57AKoSEkEFNJ(Acstmh57AKoSEkEFNJ acstmh57AKoSEkEFNJ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 : this.f2713pbVGzGjWvY2LDXC8vo) {
            if (acstmh57AKoSEkEFNJ == zzkhbgvufsk4aex3r0.f2728s3fjYDxWOUexjjVgyA) {
                zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7().requestFocus();
                return true;
            }
        }
        if (!acstmh57AKoSEkEFNJ.hasVisibleItems()) {
            return false;
        }
        e54J8UWNHWALQNixXM(acstmh57AKoSEkEFNJ);
        TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2693A49QRPHynYLCBN0SqP;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.s3fjYDxWOUexjjVgyA(acstmh57AKoSEkEFNJ);
        }
        return true;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void G7AC3DWIx9i9fdanjk(PopupWindow.OnDismissListener onDismissListener) {
        this.f2706WWC27LAMFqFFBzfbNw = onDismissListener;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean HJFh0TGMpafqLE9haL() {
        return false;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public boolean KYHag8HRDlnO3X9zmZ() {
        return this.f2713pbVGzGjWvY2LDXC8vo.size() > 0 && ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(0)).f2727lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ();
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void LIMtzhnLwQyigzK0KO(int i) {
        this.f2707Y43RdunnpKgpbny0lE = true;
        this.f2695G7AC3DWIx9i9fdanjk = i;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void OANkd3mP6AYvwbNLJM(View view) {
        if (this.f2709aPyGSIylzVNKPT1Bls != view) {
            this.f2709aPyGSIylzVNKPT1Bls = view;
            this.f2711hoXrIDAFrSwfShk8da = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(this.f2702T9PhQIpGRhE4yZDm1C, view.getLayoutDirection());
        }
    }

    public final View OUd9THiLjZndMj0qdF(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02) {
        androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemAo3wqKm5CXFuvC0q47 = ao3wqKm5CXFuvC0q47(zzkhbgvufsk4aex3r0.f2728s3fjYDxWOUexjjVgyA, zzkhbgvufsk4aex3r02);
        if (menuItemAo3wqKm5CXFuvC0q47 == null) {
            return null;
        }
        ListView listViewLEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0.lEeR5KfoEr4xU5yHH7();
        ListAdapter adapter = listViewLEeR5KfoEr4xU5yHH7.getAdapter();
        int i = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            hJFh0TGMpafqLE9haL = (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) headerViewListAdapter.getWrappedAdapter();
        } else {
            hJFh0TGMpafqLE9haL = (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) adapter;
            headersCount = 0;
        }
        int count = hJFh0TGMpafqLE9haL.getCount();
        while (true) {
            if (i >= count) {
                i = -1;
                break;
            }
            if (menuItemAo3wqKm5CXFuvC0q47 == hJFh0TGMpafqLE9haL.getItem(i)) {
                break;
            }
            i++;
        }
        if (i != -1 && (firstVisiblePosition = (i + headersCount) - listViewLEeR5KfoEr4xU5yHH7.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewLEeR5KfoEr4xU5yHH7.getChildCount()) {
            return listViewLEeR5KfoEr4xU5yHH7.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void R9SAhYMerGybF9OAjL(int i) {
        this.f2715sTkWmhpZ5b1ArQIw4K = true;
        this.f2701R9SAhYMerGybF9OAjL = i;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public boolean T9PhQIpGRhE4yZDm1C() {
        return false;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public ListView TCyPEKSzIyweCN5yp1() {
        if (this.f2713pbVGzGjWvY2LDXC8vo.isEmpty()) {
            return null;
        }
        return ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(r0.size() - 1)).lEeR5KfoEr4xU5yHH7();
    }

    public final int THTDvPxsHqMeGb512f(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        int size = this.f2713pbVGzGjWvY2LDXC8vo.size();
        for (int i = 0; i < size; i++) {
            if (zzkhbgvufsk4aex3r0 == ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(i)).f2728s3fjYDxWOUexjjVgyA) {
                return i;
            }
        }
        return -1;
    }

    public final XzJ1BS7H9Ilbkv4eVM WWC27LAMFqFFBzfbNw() {
        XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVM = new XzJ1BS7H9Ilbkv4eVM(this.f2714s3fjYDxWOUexjjVgyA, null, this.f2717zZKhbgvUfsK4AEX3r0, this.f2712husNiw3snxdgZPAGJm);
        xzJ1BS7H9Ilbkv4eVM.W3RZ2dTDKrKpS5Mxdk(this.f2710e54J8UWNHWALQNixXM);
        xzJ1BS7H9Ilbkv4eVM.WWC27LAMFqFFBzfbNw(this);
        xzJ1BS7H9Ilbkv4eVM.VItLRw50eXTZeEfGl0(this);
        xzJ1BS7H9Ilbkv4eVM.zaq8hOURtfwbcX17cG(this.f2709aPyGSIylzVNKPT1Bls);
        xzJ1BS7H9Ilbkv4eVM.R9SAhYMerGybF9OAjL(this.f2711hoXrIDAFrSwfShk8da);
        xzJ1BS7H9Ilbkv4eVM.A49QRPHynYLCBN0SqP(true);
        xzJ1BS7H9Ilbkv4eVM.LIMtzhnLwQyigzK0KO(2);
        return xzJ1BS7H9Ilbkv4eVM;
    }

    public final int XzJ1BS7H9Ilbkv4eVM(int i) {
        List list = this.f2713pbVGzGjWvY2LDXC8vo;
        ListView listViewLEeR5KfoEr4xU5yHH7 = ((zZKhbgvUfsK4AEX3r0) list.get(list.size() - 1)).lEeR5KfoEr4xU5yHH7();
        int[] iArr = new int[2];
        listViewLEeR5KfoEr4xU5yHH7.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f2700OANkd3mP6AYvwbNLJM.getWindowVisibleDisplayFrame(rect);
        return this.f2718zaq8hOURtfwbcX17cG == 1 ? (iArr[0] + listViewLEeR5KfoEr4xU5yHH7.getWidth()) + i > rect.right ? 0 : 1 : iArr[0] - i < 0 ? 1 : 0;
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void Y43RdunnpKgpbny0lE(int i) {
        if (this.f2702T9PhQIpGRhE4yZDm1C != i) {
            this.f2702T9PhQIpGRhE4yZDm1C = i;
            this.f2711hoXrIDAFrSwfShk8da = Y43RdunnpKgpbny0lE.s3fjYDxWOUexjjVgyA(i, this.f2709aPyGSIylzVNKPT1Bls.getLayoutDirection());
        }
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void Z9WdNiOsPR0y54zHW4(boolean z) {
        Iterator it = this.f2713pbVGzGjWvY2LDXC8vo.iterator();
        while (it.hasNext()) {
            TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.VItLRw50eXTZeEfGl0(((zZKhbgvUfsK4AEX3r0) it.next()).lEeR5KfoEr4xU5yHH7().getAdapter()).notifyDataSetChanged();
        }
    }

    public final MenuItem ao3wqKm5CXFuvC0q47(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02) {
        int size = zzkhbgvufsk4aex3r0.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = zzkhbgvufsk4aex3r0.getItem(i);
            if (item.hasSubMenu() && zzkhbgvufsk4aex3r02 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public void dismiss() {
        int size = this.f2713pbVGzGjWvY2LDXC8vo.size();
        if (size > 0) {
            zZKhbgvUfsK4AEX3r0[] zzkhbgvufsk4aex3r0Arr = (zZKhbgvUfsK4AEX3r0[]) this.f2713pbVGzGjWvY2LDXC8vo.toArray(new zZKhbgvUfsK4AEX3r0[size]);
            for (int i = size - 1; i >= 0; i--) {
                zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0 = zzkhbgvufsk4aex3r0Arr[i];
                if (zzkhbgvufsk4aex3r0.f2727lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ()) {
                    zzkhbgvufsk4aex3r0.f2727lEeR5KfoEr4xU5yHH7.dismiss();
                }
            }
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void e54J8UWNHWALQNixXM(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zzkhbgvufsk4aex3r0.s3fjYDxWOUexjjVgyA(this, this.f2714s3fjYDxWOUexjjVgyA);
        if (KYHag8HRDlnO3X9zmZ()) {
            tXWeW0sqVddf7ZBflq(zzkhbgvufsk4aex3r0);
        } else {
            this.f2697IPyIQcaNa8aB7drBED.add(zzkhbgvufsk4aex3r0);
        }
    }

    public final int jCtUeU2YI1poCxWcjm() {
        return this.f2709aPyGSIylzVNKPT1Bls.getLayoutDirection() == 1 ? 0 : 1;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void lEeR5KfoEr4xU5yHH7(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, boolean z) {
        int iTHTDvPxsHqMeGb512f = THTDvPxsHqMeGb512f(zzkhbgvufsk4aex3r0);
        if (iTHTDvPxsHqMeGb512f < 0) {
            return;
        }
        int i = iTHTDvPxsHqMeGb512f + 1;
        if (i < this.f2713pbVGzGjWvY2LDXC8vo.size()) {
            ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(i)).f2728s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(false);
        }
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02 = (zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.remove(iTHTDvPxsHqMeGb512f);
        zzkhbgvufsk4aex3r02.f2728s3fjYDxWOUexjjVgyA.KqgKJKIWne3kz1AdHk(this);
        if (this.f2704THTDvPxsHqMeGb512f) {
            zzkhbgvufsk4aex3r02.f2727lEeR5KfoEr4xU5yHH7.tXWeW0sqVddf7ZBflq(null);
            zzkhbgvufsk4aex3r02.f2727lEeR5KfoEr4xU5yHH7.sTkWmhpZ5b1ArQIw4K(0);
        }
        zzkhbgvufsk4aex3r02.f2727lEeR5KfoEr4xU5yHH7.dismiss();
        int size = this.f2713pbVGzGjWvY2LDXC8vo.size();
        this.f2718zaq8hOURtfwbcX17cG = size > 0 ? ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(size - 1)).f2726HJFh0TGMpafqLE9haL : jCtUeU2YI1poCxWcjm();
        if (size != 0) {
            if (z) {
                ((zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(0)).f2728s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(false);
                return;
            }
            return;
        }
        dismiss();
        TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = this.f2693A49QRPHynYLCBN0SqP;
        if (leer5kfoer4xu5yhh7 != null) {
            leer5kfoer4xu5yhh7.lEeR5KfoEr4xU5yHH7(zzkhbgvufsk4aex3r0, true);
        }
        ViewTreeObserver viewTreeObserver = this.f2705VItLRw50eXTZeEfGl0;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f2705VItLRw50eXTZeEfGl0.removeGlobalOnLayoutListener(this.f2694Acstmh57AKoSEkEFNJ);
            }
            this.f2705VItLRw50eXTZeEfGl0 = null;
        }
        this.f2700OANkd3mP6AYvwbNLJM.removeOnAttachStateChangeListener(this.f2708Z9WdNiOsPR0y54zHW4);
        this.f2706WWC27LAMFqFFBzfbNw.onDismiss();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0;
        int size = this.f2713pbVGzGjWvY2LDXC8vo.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                zzkhbgvufsk4aex3r0 = null;
                break;
            }
            zzkhbgvufsk4aex3r0 = (zZKhbgvUfsK4AEX3r0) this.f2713pbVGzGjWvY2LDXC8vo.get(i);
            if (!zzkhbgvufsk4aex3r0.f2727lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ()) {
                break;
            } else {
                i++;
            }
        }
        if (zzkhbgvufsk4aex3r0 != null) {
            zzkhbgvufsk4aex3r0.f2728s3fjYDxWOUexjjVgyA.zZKhbgvUfsK4AEX3r0(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void pbVGzGjWvY2LDXC8vo(TCyPEKSzIyweCN5yp1.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7) {
        this.f2693A49QRPHynYLCBN0SqP = leer5kfoer4xu5yhh7;
    }

    @Override // TCyPEKSzIyweCN5yp1.HJFh0TGMpafqLE9haL
    public void s3fjYDxWOUexjjVgyA() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (KYHag8HRDlnO3X9zmZ()) {
            return;
        }
        Iterator it = this.f2697IPyIQcaNa8aB7drBED.iterator();
        while (it.hasNext()) {
            tXWeW0sqVddf7ZBflq((androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0) it.next());
        }
        this.f2697IPyIQcaNa8aB7drBED.clear();
        View view = this.f2709aPyGSIylzVNKPT1Bls;
        this.f2700OANkd3mP6AYvwbNLJM = view;
        if (view != null) {
            boolean z = this.f2705VItLRw50eXTZeEfGl0 == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f2705VItLRw50eXTZeEfGl0 = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2694Acstmh57AKoSEkEFNJ);
            }
            this.f2700OANkd3mP6AYvwbNLJM.addOnAttachStateChangeListener(this.f2708Z9WdNiOsPR0y54zHW4);
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void sTkWmhpZ5b1ArQIw4K(boolean z) {
        this.f2716xHA29AmDt6y96AnB3t = z;
    }

    public final void tXWeW0sqVddf7ZBflq(androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r02;
        View viewOUd9THiLjZndMj0qdF;
        int i;
        int i2;
        int i3;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f2714s3fjYDxWOUexjjVgyA);
        androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL hJFh0TGMpafqLE9haL = new androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL(zzkhbgvufsk4aex3r0, layoutInflaterFrom, this.f2698KYHag8HRDlnO3X9zmZ, f2692ao3wqKm5CXFuvC0q47);
        if (!KYHag8HRDlnO3X9zmZ() && this.f2716xHA29AmDt6y96AnB3t) {
            hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(true);
        } else if (KYHag8HRDlnO3X9zmZ()) {
            hJFh0TGMpafqLE9haL.zZKhbgvUfsK4AEX3r0(TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.A49QRPHynYLCBN0SqP(zzkhbgvufsk4aex3r0));
        }
        int iAPyGSIylzVNKPT1Bls = TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA.aPyGSIylzVNKPT1Bls(hJFh0TGMpafqLE9haL, null, this.f2714s3fjYDxWOUexjjVgyA, this.f2696HJFh0TGMpafqLE9haL);
        XzJ1BS7H9Ilbkv4eVM xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw = WWC27LAMFqFFBzfbNw();
        xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.OANkd3mP6AYvwbNLJM(hJFh0TGMpafqLE9haL);
        xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.Y43RdunnpKgpbny0lE(iAPyGSIylzVNKPT1Bls);
        xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.R9SAhYMerGybF9OAjL(this.f2711hoXrIDAFrSwfShk8da);
        if (this.f2713pbVGzGjWvY2LDXC8vo.size() > 0) {
            List list = this.f2713pbVGzGjWvY2LDXC8vo;
            zzkhbgvufsk4aex3r02 = (zZKhbgvUfsK4AEX3r0) list.get(list.size() - 1);
            viewOUd9THiLjZndMj0qdF = OUd9THiLjZndMj0qdF(zzkhbgvufsk4aex3r02, zzkhbgvufsk4aex3r0);
        } else {
            zzkhbgvufsk4aex3r02 = null;
            viewOUd9THiLjZndMj0qdF = null;
        }
        if (viewOUd9THiLjZndMj0qdF != null) {
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.OqIo5QF00RDxUQb4qq(false);
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.XzJ1BS7H9Ilbkv4eVM(null);
            int iXzJ1BS7H9Ilbkv4eVM = XzJ1BS7H9Ilbkv4eVM(iAPyGSIylzVNKPT1Bls);
            boolean z = iXzJ1BS7H9Ilbkv4eVM == 1;
            this.f2718zaq8hOURtfwbcX17cG = iXzJ1BS7H9Ilbkv4eVM;
            if (Build.VERSION.SDK_INT >= 26) {
                xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.zaq8hOURtfwbcX17cG(viewOUd9THiLjZndMj0qdF);
                i2 = 0;
                i = 0;
            } else {
                int[] iArr = new int[2];
                this.f2709aPyGSIylzVNKPT1Bls.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewOUd9THiLjZndMj0qdF.getLocationOnScreen(iArr2);
                if ((this.f2711hoXrIDAFrSwfShk8da & 7) == 5) {
                    iArr[0] = iArr[0] + this.f2709aPyGSIylzVNKPT1Bls.getWidth();
                    iArr2[0] = iArr2[0] + viewOUd9THiLjZndMj0qdF.getWidth();
                }
                i = iArr2[0] - iArr[0];
                i2 = iArr2[1] - iArr[1];
            }
            if ((this.f2711hoXrIDAFrSwfShk8da & 5) == 5) {
                if (!z) {
                    iAPyGSIylzVNKPT1Bls = viewOUd9THiLjZndMj0qdF.getWidth();
                    i3 = i - iAPyGSIylzVNKPT1Bls;
                }
                i3 = i + iAPyGSIylzVNKPT1Bls;
            } else {
                if (z) {
                    iAPyGSIylzVNKPT1Bls = viewOUd9THiLjZndMj0qdF.getWidth();
                    i3 = i + iAPyGSIylzVNKPT1Bls;
                }
                i3 = i - iAPyGSIylzVNKPT1Bls;
            }
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.xHA29AmDt6y96AnB3t(i3);
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.THTDvPxsHqMeGb512f(true);
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.OUd9THiLjZndMj0qdF(i2);
        } else {
            if (this.f2715sTkWmhpZ5b1ArQIw4K) {
                xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.xHA29AmDt6y96AnB3t(this.f2701R9SAhYMerGybF9OAjL);
            }
            if (this.f2707Y43RdunnpKgpbny0lE) {
                xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.OUd9THiLjZndMj0qdF(this.f2695G7AC3DWIx9i9fdanjk);
            }
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.G7AC3DWIx9i9fdanjk(hoXrIDAFrSwfShk8da());
        }
        this.f2713pbVGzGjWvY2LDXC8vo.add(new zZKhbgvUfsK4AEX3r0(xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw, zzkhbgvufsk4aex3r0, this.f2718zaq8hOURtfwbcX17cG));
        xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        ListView listViewTCyPEKSzIyweCN5yp1 = xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.TCyPEKSzIyweCN5yp1();
        listViewTCyPEKSzIyweCN5yp1.setOnKeyListener(this);
        if (zzkhbgvufsk4aex3r02 == null && this.f2699LIMtzhnLwQyigzK0KO && zzkhbgvufsk4aex3r0.G7AC3DWIx9i9fdanjk() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(lEeR5KfoEr4xU5yHH7.KYHag8HRDlnO3X9zmZ.f6236pbVGzGjWvY2LDXC8vo, (ViewGroup) listViewTCyPEKSzIyweCN5yp1, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(zzkhbgvufsk4aex3r0.G7AC3DWIx9i9fdanjk());
            listViewTCyPEKSzIyweCN5yp1.addHeaderView(frameLayout, null, false);
            xzJ1BS7H9Ilbkv4eVMWWC27LAMFqFFBzfbNw.s3fjYDxWOUexjjVgyA();
        }
    }

    @Override // TCyPEKSzIyweCN5yp1.s3fjYDxWOUexjjVgyA
    public void xHA29AmDt6y96AnB3t(boolean z) {
        this.f2699LIMtzhnLwQyigzK0KO = z;
    }
}
