package h3D8MhcyLuC2SOP1fB;

import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import jpEZy3U5wFkT2e9PKQ.pbVGzGjWvY2LDXC8vo;

/* loaded from: classes.dex */
public abstract class s3fjYDxWOUexjjVgyA {
    public static final String HJFh0TGMpafqLE9haL(Reader reader) {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        s3fjYDxWOUexjjVgyA(reader, stringWriter, 0, 2, null);
        String string = stringWriter.toString();
        pbVGzGjWvY2LDXC8vo.zZKhbgvUfsK4AEX3r0(string, "toString(...)");
        return string;
    }

    public static final long lEeR5KfoEr4xU5yHH7(Reader reader, Writer writer, int i) throws IOException {
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(reader, "<this>");
        pbVGzGjWvY2LDXC8vo.husNiw3snxdgZPAGJm(writer, "out");
        char[] cArr = new char[i];
        int i2 = reader.read(cArr);
        long j = 0;
        while (i2 >= 0) {
            writer.write(cArr, 0, i2);
            j += i2;
            i2 = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long s3fjYDxWOUexjjVgyA(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return lEeR5KfoEr4xU5yHH7(reader, writer, i);
    }
}
