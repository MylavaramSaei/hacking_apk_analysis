package androidx.appcompat.view.menu;

import IPyIQcaNa8aB7drBED.PPkm9uUfOJHHYveeLT;
import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA, IPyIQcaNa8aB7drBED, AdapterView.OnItemClickListener {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public static final int[] f2591HJFh0TGMpafqLE9haL = {R.attr.background, R.attr.divider};

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f2592lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2593s3fjYDxWOUexjjVgyA;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    public int getWindowAnimations() {
        return this.f2593s3fjYDxWOUexjjVgyA;
    }

    @Override // androidx.appcompat.view.menu.zZKhbgvUfsK4AEX3r0.s3fjYDxWOUexjjVgyA
    public boolean lEeR5KfoEr4xU5yHH7(husNiw3snxdgZPAGJm husniw3snxdgzpagjm) {
        return this.f2592lEeR5KfoEr4xU5yHH7.GyWRxpdt1T8mEJXPoD(husniw3snxdgzpagjm, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        lEeR5KfoEr4xU5yHH7((husNiw3snxdgZPAGJm) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        PPkm9uUfOJHHYveeLT pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL = PPkm9uUfOJHHYveeLT.R9SAhYMerGybF9OAjL(context, attributeSet, f2591HJFh0TGMpafqLE9haL, i, 0);
        if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(0)) {
            setBackgroundDrawable(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(0));
        }
        if (pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.zaq8hOURtfwbcX17cG(1)) {
            setDivider(pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.TCyPEKSzIyweCN5yp1(1));
        }
        pPkm9uUfOJHHYveeLTR9SAhYMerGybF9OAjL.xHA29AmDt6y96AnB3t();
    }
}
