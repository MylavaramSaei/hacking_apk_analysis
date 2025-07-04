package PPkm9uUfOJHHYveeLT;

import android.widget.ListView;

/* loaded from: classes.dex */
public class husNiw3snxdgZPAGJm extends lEeR5KfoEr4xU5yHH7 {

    /* renamed from: Y43RdunnpKgpbny0lE, reason: collision with root package name */
    public final ListView f1281Y43RdunnpKgpbny0lE;

    public husNiw3snxdgZPAGJm(ListView listView) {
        super(listView);
        this.f1281Y43RdunnpKgpbny0lE = listView;
    }

    @Override // PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7
    public void Acstmh57AKoSEkEFNJ(int i, int i2) {
        this.f1281Y43RdunnpKgpbny0lE.scrollListBy(i2);
    }

    @Override // PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7
    public boolean lEeR5KfoEr4xU5yHH7(int i) {
        return false;
    }

    @Override // PPkm9uUfOJHHYveeLT.lEeR5KfoEr4xU5yHH7
    public boolean s3fjYDxWOUexjjVgyA(int i) {
        ListView listView = this.f1281Y43RdunnpKgpbny0lE;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int i2 = firstVisiblePosition + childCount;
        if (i > 0) {
            if (i2 >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else {
            if (i >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}
