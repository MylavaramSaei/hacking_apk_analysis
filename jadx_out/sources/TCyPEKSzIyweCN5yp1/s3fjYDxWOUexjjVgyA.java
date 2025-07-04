package TCyPEKSzIyweCN5yp1;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1;
import androidx.appcompat.view.menu.husNiw3snxdgZPAGJm;
import androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA implements HJFh0TGMpafqLE9haL, TCyPEKSzIyweCN5yp1, AdapterView.OnItemClickListener {

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public Rect f1553lEeR5KfoEr4xU5yHH7;

    public static boolean A49QRPHynYLCBN0SqP(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
        int size = zzkhbgvufsk4aex3r0.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = zzkhbgvufsk4aex3r0.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    public static androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL VItLRw50eXTZeEfGl0(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (androidx.appcompat.view.menu.HJFh0TGMpafqLE9haL) listAdapter;
    }

    public static int aPyGSIylzVNKPT1Bls(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public abstract void G7AC3DWIx9i9fdanjk(PopupWindow.OnDismissListener onDismissListener);

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean IPyIQcaNa8aB7drBED(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        return false;
    }

    public abstract void LIMtzhnLwQyigzK0KO(int i);

    public abstract void OANkd3mP6AYvwbNLJM(View view);

    public abstract void R9SAhYMerGybF9OAjL(int i);

    public boolean T9PhQIpGRhE4yZDm1C() {
        return true;
    }

    public abstract void Y43RdunnpKgpbny0lE(int i);

    public abstract void e54J8UWNHWALQNixXM(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0);

    public Rect hoXrIDAFrSwfShk8da() {
        return this.f1553lEeR5KfoEr4xU5yHH7;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public boolean husNiw3snxdgZPAGJm(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        VItLRw50eXTZeEfGl0(listAdapter).f2597lEeR5KfoEr4xU5yHH7.DfpieXfdYs58yZAiXY((MenuItem) listAdapter.getItem(i), this, T9PhQIpGRhE4yZDm1C() ? 0 : 4);
    }

    public abstract void sTkWmhpZ5b1ArQIw4K(boolean z);

    public abstract void xHA29AmDt6y96AnB3t(boolean z);

    public void zaq8hOURtfwbcX17cG(Rect rect) {
        this.f1553lEeR5KfoEr4xU5yHH7 = rect;
    }

    @Override // androidx.appcompat.view.menu.TCyPEKSzIyweCN5yp1
    public void zZKhbgvUfsK4AEX3r0(Context context, zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0) {
    }
}
