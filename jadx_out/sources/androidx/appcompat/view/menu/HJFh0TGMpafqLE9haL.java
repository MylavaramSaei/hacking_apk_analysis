package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.IPyIQcaNa8aB7drBED;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class HJFh0TGMpafqLE9haL extends BaseAdapter {

    /* renamed from: HJFh0TGMpafqLE9haL, reason: collision with root package name */
    public boolean f2594HJFh0TGMpafqLE9haL;

    /* renamed from: KYHag8HRDlnO3X9zmZ, reason: collision with root package name */
    public final int f2595KYHag8HRDlnO3X9zmZ;

    /* renamed from: husNiw3snxdgZPAGJm, reason: collision with root package name */
    public final LayoutInflater f2596husNiw3snxdgZPAGJm;

    /* renamed from: lEeR5KfoEr4xU5yHH7, reason: collision with root package name */
    public zZKhbgvUfsK4AEX3r0 f2597lEeR5KfoEr4xU5yHH7;

    /* renamed from: s3fjYDxWOUexjjVgyA, reason: collision with root package name */
    public int f2598s3fjYDxWOUexjjVgyA = -1;

    /* renamed from: zZKhbgvUfsK4AEX3r0, reason: collision with root package name */
    public final boolean f2599zZKhbgvUfsK4AEX3r0;

    public HJFh0TGMpafqLE9haL(zZKhbgvUfsK4AEX3r0 zzkhbgvufsk4aex3r0, LayoutInflater layoutInflater, boolean z, int i) {
        this.f2599zZKhbgvUfsK4AEX3r0 = z;
        this.f2596husNiw3snxdgZPAGJm = layoutInflater;
        this.f2597lEeR5KfoEr4xU5yHH7 = zzkhbgvufsk4aex3r0;
        this.f2595KYHag8HRDlnO3X9zmZ = i;
        lEeR5KfoEr4xU5yHH7();
    }

    @Override // android.widget.Adapter
    /* renamed from: HJFh0TGMpafqLE9haL, reason: merged with bridge method [inline-methods] */
    public husNiw3snxdgZPAGJm getItem(int i) {
        ArrayList arrayListXHA29AmDt6y96AnB3t = this.f2599zZKhbgvUfsK4AEX3r0 ? this.f2597lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t() : this.f2597lEeR5KfoEr4xU5yHH7.THTDvPxsHqMeGb512f();
        int i2 = this.f2598s3fjYDxWOUexjjVgyA;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (husNiw3snxdgZPAGJm) arrayListXHA29AmDt6y96AnB3t.get(i);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList arrayListXHA29AmDt6y96AnB3t = this.f2599zZKhbgvUfsK4AEX3r0 ? this.f2597lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t() : this.f2597lEeR5KfoEr4xU5yHH7.THTDvPxsHqMeGb512f();
        int i = this.f2598s3fjYDxWOUexjjVgyA;
        int size = arrayListXHA29AmDt6y96AnB3t.size();
        return i < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2596husNiw3snxdgZPAGJm.inflate(this.f2595KYHag8HRDlnO3X9zmZ, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f2597lEeR5KfoEr4xU5yHH7.OUd9THiLjZndMj0qdF() && groupId != (i2 >= 0 ? getItem(i2).getGroupId() : groupId));
        IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7 leer5kfoer4xu5yhh7 = (IPyIQcaNa8aB7drBED.lEeR5KfoEr4xU5yHH7) view;
        if (this.f2594HJFh0TGMpafqLE9haL) {
            listMenuItemView.setForceShowIcon(true);
        }
        leer5kfoer4xu5yhh7.zZKhbgvUfsK4AEX3r0(getItem(i), 0);
        return view;
    }

    public void lEeR5KfoEr4xU5yHH7() {
        husNiw3snxdgZPAGJm husniw3snxdgzpagjmR9SAhYMerGybF9OAjL = this.f2597lEeR5KfoEr4xU5yHH7.R9SAhYMerGybF9OAjL();
        if (husniw3snxdgzpagjmR9SAhYMerGybF9OAjL != null) {
            ArrayList arrayListXHA29AmDt6y96AnB3t = this.f2597lEeR5KfoEr4xU5yHH7.xHA29AmDt6y96AnB3t();
            int size = arrayListXHA29AmDt6y96AnB3t.size();
            for (int i = 0; i < size; i++) {
                if (((husNiw3snxdgZPAGJm) arrayListXHA29AmDt6y96AnB3t.get(i)) == husniw3snxdgzpagjmR9SAhYMerGybF9OAjL) {
                    this.f2598s3fjYDxWOUexjjVgyA = i;
                    return;
                }
            }
        }
        this.f2598s3fjYDxWOUexjjVgyA = -1;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        lEeR5KfoEr4xU5yHH7();
        super.notifyDataSetChanged();
    }

    public zZKhbgvUfsK4AEX3r0 s3fjYDxWOUexjjVgyA() {
        return this.f2597lEeR5KfoEr4xU5yHH7;
    }

    public void zZKhbgvUfsK4AEX3r0(boolean z) {
        this.f2594HJFh0TGMpafqLE9haL = z;
    }
}
